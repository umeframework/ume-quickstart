package org.umeframework.quickstart.sample.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.umeframework.dora.exception.ApplicationException;
import org.umeframework.dora.service.BaseComponent;
import org.umeframework.quickstart.sample.service.CloudAlbumManageService;
import org.umeframework.quickstart.sample.service.dto.AlbumManageDto;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 远程服务调用，熔断处理。<br>
 * <br>
 *
 * @author UME-team
 */
public class RemoteAlbumServiceImpl extends BaseComponent implements CloudAlbumManageService {
    /**
     * 客户端负载均衡RestTemplate实例<br>
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 模拟HTTP调用云服务ws003，返回AlbumManageDto对象列表<br>
     * 当入参中包含"fallback"关键字时，模拟模拟启用熔断机制(回调fallbackMethod中设定的逻辑)<br>
     * 
     * @throws Exception
     */
    @Override
    @HystrixCommand(commandKey = "queryAlbumListCommand", groupKey = "albumGroup", ignoreExceptions = { ApplicationException.class }, fallbackMethod = "queryAlbumList_fallback")
    public AlbumManageDto[] queryAlbumList(Map<String, String> inParam) {
        if (inParam.containsKey("fallback")) {
            // 当入参包含'fallback'关键字时，模拟调用熔断情况
            throw new RuntimeException("Invoke faild, fallback message:" + inParam.get("fallback"));
        }
        

        String url = "http://ume-quickstart-cloud/service/capi/sys/ws003";
        super.getLogger().info("Invoke cloud service " + url);
        ResponseEntity<AlbumManageDto[]> responseEntity = restTemplate.postForEntity(url, inParam, AlbumManageDto[].class);
        super.getLogger().info("Invoke cloud service response:" + responseEntity.getBody());
        
        return responseEntity.getBody();
    }

    /**
     * 服务熔断处理逻辑。<br>
     * 
     * @param inParam
     * @param invokeError
     * @return
     */
    public AlbumManageDto[] queryAlbumList_fallback(Map<String, String> inParam, Throwable invokeError) {
        super.getLogger().warn("Entry fallback logic due to:" + invokeError.getMessage());
        AlbumManageDto fbResult = new AlbumManageDto();
        fbResult.setMessage("Entry fallback logic due to:" + invokeError.getMessage());
        return new AlbumManageDto[] {fbResult};
    }

}
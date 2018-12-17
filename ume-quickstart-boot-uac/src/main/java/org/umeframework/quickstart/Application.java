package org.umeframework.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.umeframework.dora.contant.BeanConfigConst;
import org.umeframework.dora.web.user.UserAuthenticator;
import org.umeframework.quickstart.uac.user.dto.UserAclDto;
import org.umeframework.quickstart.uac.user.impl.DefaultAuthenticatorImpl;

/**
 * Spring Boot启动用的主类<br>
 * 只需在该类的头部用注解标注的形式，即可启动一个内嵌Web服务器的Java项目<br>
 * <br>
 * 框架提供基于注解自动配置和基于XML配置两种方案，分别采用如下说明的方法来选择配置方式：<br>
 * <li>基于注解自动配置 - 在主类的头部添加"@ImportAutoConfiguration"设置
 * <li>基于注解自动配置 - 在主类的头部添加"@ImportResource"设置
 * <li>对于要从自动配置中排除的模块，使用"@EnableAutoConfiguration(exclude=...)"设置 <br>
 * <li>基于XML配置的场合，使用：@ImportResource("classpath:applicationContext.xml")<br>
 * <br><br>
 * 当默认的自动配置类org.umeframework.dora.appconfig.AutoConfiguration被导入·启动时，<br>
 * 框架会默认声明一组名称的Bean(这些在BeanConfigConst.java中定义)，因此应用中需避免再次定义相同的名称，否则会发生命名重复。<br>
 * <br><br>
 * @author Yue MA
 */
// 排除SpringBoot自带的数据源初始化设置，采用application.properties中使用ume.jdbc设置的数据源连接。
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class })
// 导入项目的自动化配置。
@Import({
    // 启动UME框架的默认配置
	// 启用AutoConfiguration内建的默认配置项目
    // org.umeframework.dora.appconfig.AutoConfiguration.class,
	// 或根据需要选择自定义如下预置组件的配置项目
    org.umeframework.dora.appconfig.DefaultBeanFactoryConfiguration.class,
    org.umeframework.dora.appconfig.DefaultDaoConfiguration.class,
    org.umeframework.dora.appconfig.DefaultDataSourceConfiguration.class,
    org.umeframework.dora.appconfig.DefaultExceptionHandlerConfiguration.class,
    org.umeframework.dora.appconfig.DefaultHttpProxyConfiguration.class,
    org.umeframework.dora.appconfig.DefaultLogConfiguration.class,
    org.umeframework.dora.appconfig.DefaultMessageConfiguration.class,
    org.umeframework.dora.appconfig.DefaultServiceAjaxConfiguration.class,
    org.umeframework.dora.appconfig.DefaultServiceMappingConfiguration.class,
    org.umeframework.dora.appconfig.DefaultServiceRunnerConfiguration.class,
    org.umeframework.dora.appconfig.DefaultSystemPropertyConfiguration.class,
    org.umeframework.dora.appconfig.DefaultTransactionManagerConfiguration.class,
    org.umeframework.dora.appconfig.DefaultUserCacheConfiguration.class,
    org.umeframework.dora.appconfig.DefaultUserLoginConfiguration.class,
    org.umeframework.dora.appconfig.DefaultWebControllerConfiguration.class })
// 该设置创建并导入示例用的数据库及数据脚本；如果应用(通过application.properties的ume.jdbc设置)已变更为其他的数据库，请删除此设置。
@ImportResource("classpath:applicationInit.xml")
@ComponentScan(basePackages = "org.umeframework.quickstart")
public class Application {

	/**
	 * Start application.<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Throwable e) {
			if (!e.getClass().getName().startsWith("org.springframework.boot.devtools")) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * User authentication implementation class.<br>
	 * 
	 * @return
	 */
	@Bean(name = BeanConfigConst.DEFAULT_USER_AUTHENTICATOR)
	public UserAuthenticator<?> userAuthenticator() {
		UserAuthenticator<UserAclDto> instance = new DefaultAuthenticatorImpl();
		return instance;
	}

}

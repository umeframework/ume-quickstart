【前提条件】
  Spring Cloud Eureka注册服务已经在运行，如未发现可用的注册服务器会导致本应用启动出错。

【运行方法】
  1 依赖环境
    Eclipse版本4.6或以上; JDK版本1.8或以上; Apache Maven版本3.3.9或以上
  2.运行步骤
    右键选择"src/main/java"子目录中的"Application.java"文件，在弹出菜单选择 [Run As] > [Java Application] 运行。

【服务测试】
  打开浏览器窗口(浏览器推荐使用Firefox或Chrome，安装Json-handle插件以编译查看JSON格式的数据)，
  
  #本地服务
  http://localhost:8081/service/capi/sys/ws901/

  #服务熔断测试
  #调用云服务
  http://localhost:8081/service/capi/sys/ws081/{"id":101}
  #调用云服务发生错误触发熔断
  http://localhost:8081/service/capi/sys/ws081/{"id":101, "fallback":"A Test For Fallback"}
  
  #Hystrix监控
  http://localhost:8081/hystrix
  #在上述打开的页面中"Hystrix Dashboard"标题下方的栏目中输入"http://localhost:8081/hystrix.stream"，点击"Monitor Stream"按钮进入监控详细画面
  
  #Actuator监控
  http://localhost:8084/actuator

  
  
  
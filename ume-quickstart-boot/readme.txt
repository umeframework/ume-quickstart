【运行方法(I) - 使用Eclipse启动】
  1 依赖环境
    Eclipse版本4.5或以上; JDK版本1.7或以上; Apache Maven版本3.3.3或以上
  2.运行步骤
    右键选择"src/main/java"子目录中的"Application.java"文件，在弹出菜单选择 [Run As] > [Java Application] 运行。

【运行方法(II) - 命令行执行启动命令】
  1 依赖环境
    JDK版本1.7或以上(可在命令行输入命令 java -version 进行确认)
  2.运行步骤
    打开命令行窗口，
    进入项目的target目录下运行 java -jar {可执行jar文件名}
    或者直接在项目根目录下运行  mvn spring-boot:run
  
【服务测试 HTTP GET】
  打开浏览器窗口(浏览器推荐使用Firefox或Chrome，安装Json-handle插件以编译查看JSON格式的数据)，
  输入如下URL查看当前Web服务的状态:
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws901/
  #唱片查询
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws001/101
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws002/Pink Floyd
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws002/Pink Floyd/Moon
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws003/{"artist":"Pink Floyd"}
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws003/{"artist":"Pink Floyd","genre":"02"}
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws003?genre=02&artist=Pink Floyd
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws003/{"genre":"02"}?artist=Jeff Beck
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws004/Aerosmith/{"artist":"Jeff Beck"}

【服务测试 HTTP POST】
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws901 
   ["ws001","ws002"]
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws001
   [101]
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws002
   ["Pink Floyd", "Moon"]
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws004
   ["Aerosmith", {"artist":"Jeff Beck"}]
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws005
   {"album":{"id":601},"trackList":[{"albumId":601,"trackNo":99,"trackName":"I Put A Spell On You"}]}
  http://localhost:8080/ume-quickstart-boot/capi/sys/ws006
   ["Fleetwood Mac","Jeff Beck"]


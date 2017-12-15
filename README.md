# mer-dev-helper

商户测试环境联调, 错误日志自助查询平台

1. 打包
   项目使用spring-boot, 修改代码后, 使用maven命令

   ```shell
   mvn clean package
   ```

   打包即可生成可执行jar包 `mer-dev-helper.jar`

2. 运行
   由于项目需要监测多个应用的日志文件, 因此项目应部署到一个可同时访问测试环境所有机器的公共跳板机(如10.10.10.22)上; 

   在10.10.10.22:/app/mer-dev-helper/下, 执行 

   ```shell
   nohup java -jar mer-dev-helper.jar &
   ```

   启动应用, 应用日志将打印到/app/mer-dev-helper/logs/ 下

3. 访问

   项目的默认端口是7070, 可以在MvcApplication.java中修改; 访问http://10.10.10.22:7070/index.html即可开始使用
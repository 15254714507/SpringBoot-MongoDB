# SpringBoot-MongoDB
springboot整合MongoDb
版本：jdk ：1.8， springboot：2.1.6，mongoDB：4.0.10
```
├─.mvn
│  └─wrapper
│          maven-wrapper.jar
│          maven-wrapper.properties
│          MavenWrapperDownloader.java
│      
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─ssm
│  │  │          │  SpringBootMongoDbApplication.java  //启动类
│  │  │          │  
│  │  │          ├─controller	
│  │  │          │      UserController.java		//controller类
│  │  │          │      
│  │  │          ├─mapper
│  │  │          │      UserMapper.java		//mapper接口
│  │  │          │      
│  │  │          ├─mongodb
│  │  │          │  │  UserMongoDB.java		//mongoDB操作接口
│  │  │          │  │  
│  │  │          │  ├─configuration		//mongoDB配置类，里面配置了去掉字段_class的配置
│  │  │          │  │      MongoConfig.java
│  │  │          │  │      
│  │  │          │  └─impl
│  │  │          │          UserMongoDBImpl.java	//mongoDB的实现类
│  │  │          │          
│  │  │          ├─pojo
│  │  │          │      User.java			//bean
│  │  │          │      
│  │  │          └─service
│  │  │              │  UserService.java		//service接口
│  │  │              │  
│  │  │              └─impl
│  │  │                      UserServiceImpl.java	//实现类
│  │  │                      
│  │  ├─resources
│  │  │  │  application.yml				//全局配置文件
│  │  │  │  
│  │  │  ├─mapper
│  │  │  │      UserMapper.xml			//maybatis配置文件，里面都是SQL语句
│  │  │  │      
│  │  │  ├─static
│  │  │  └─templates
│  │  └─webapp
│  │      └─WEB-INF
│  │          └─jsp
│  │                  index.jsp			//测试返回类
```

Error:java: 无效的源发行版: 1.8

必须保证maven编译器级别和idea里面的值的project和编译级别一致

[spring boot application.yml文件中文注释乱码](https://blog.csdn.net/u013887008/article/details/82528066)

```java
#SpringBoot底层会把application.yml文件解析为application.properties
#在Spring Boot中多环境配置文件名需要满足application-{profile}.yml的格式，其中{profile}对应你的环境标识

springboot web # 1.x 2.x contextpath配置有区别
```



http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20

springboot启动变更

![1559187329903](C:\Users\cpr161\AppData\Roaming\Typora\typora-user-images\1559187329903.png)



springboot不赞同使用jsp，访问jsp页面会提示如下信息

![1559202527547](C:\Users\cpr161\AppData\Roaming\Typora\typora-user-images\1559202527547.png)

```xml
<dependency>
  <groupId>org.apache.tomcat.embed</groupId>
  <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
<dependency>
  <groupId>javax.servlet</groupId>
  <artifactId>jstl</artifactId>
</dependency>
```

可以在pom中通过增加上述依赖来支持jsp的解析
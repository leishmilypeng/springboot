1.本地仓库、中心仓库、私服

![1559718449612](picture/1559718449612.png)



当需要对私服仓库进行防止非法访问时，就需要对私服设置用户名和密码

![1559719103720](picture/1559719103720.png)

当本地开发完，需要对测试通过的包发布到相应环境时，可以在pom.xml文件中配置发布地址

![1559719731375](picture/1559719731375.png)

此处存在正式和快照两部分

区分正式和快照的目的是为团队开发，相互依赖时，但依赖包需要同步进行修改时的处理，配置好发布地址后，maven会根据pom.xml里面的版本后进行区分，如果1.x.x-SNAPSHOT时会发不到快照地址，如果版本号是1.x.x时则发布到正式地址


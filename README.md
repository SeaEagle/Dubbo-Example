# Dubbo-Example

>
作者：Eagle<br/><br/>
此教程参考阿里巴巴Dubbo官方网站（<http://dubbo.io>）的例子进行编写<br/><br/>
代码在提交Github时已通过测试，运行无误

#### 1. 开发环境
> 正所谓工欲善其事，必先利其器。

笔者的开发环境

1. 操作系统：OSX 10.10.5
2. 开发语言：Java
3. 构建工具：Maven
4. 注册中心：ZooKeeper

**验证Java**

在命令行运行 `java -version`:

    eagledeMacBook-Pro:~ eagle$ java -version
	java version "1.7.0_80"
	Java(TM) SE Runtime Environment (build 1.7.0_80-b15)
	Java HotSpot(TM) 64-Bit Server VM (build 24.80-b11, mixed mode)

**验证Maven**

在命令行运行 `mvn -v`:

	eagledeMacBook-Pro:~ eagle$ mvn -v
	Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-15T01:29:23+08:00)
	Maven home: /Users/eagle/ProgramTool/apache-maven-3.2.5
	Java version: 1.7.0_80, vendor: Oracle Corporation
	Java home: /Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre
	Default locale: zh_CN, platform encoding: UTF-8
	OS name: "mac os x", version: "10.10.5", arch: "x86_64", family: "mac"

**简单介绍ZooKeeper的安装及配置**

`获取`

先到官网(<http://zookeeper.apache.org>)下载`stable`版本的`Release`包，发布此教程时，笔者使用的是3.4.6版本。
<br/><br/><br/>

`安装`

将下载下来的包`zookeeper-3.4.6.tar.gz`解压，得到`zookeeper-3.4.6`文件夹之后，将其文件夹复制到个人喜好的位置。
<br/><br/><br/>

`配置` ( *此处在展示单机配置，关于集群配置可自行查阅文档* )

在与文件夹`zookeeper-3.4.6`同个目录下，创建三个文件夹，分别是`data`，`datalog`，`logs`:

	eagledeMacBook-Pro:standalone eagle$ ls
	data		datalog		logs		zookeeper-3.4.6

进入文件夹`zookeeper-3.4.6`下的conf目录，复制`zoo_sample.cfg`文件，并将其命名为`zoo.cfg`，然后打开`zoo.cfg`文件进行编辑:

	默认使用的是`clientPort=2181`，此处暂不要对其修改，以免无法运行笔者提供的代码。
	
在`zoo.cfg`文件里添加两个配置，分别是dataDir和dataLogDir，并指向刚刚创建的data目录和datalog目录对应的路径，如:

	dataDir=/Users/eagle/ProgramTool/zookeeper/standalone/data
	dataLogDir=/Users/eagle/ProgramTool/zookeeper/standalone/datalog

<br/>

`运行`

`测试`

`关闭`

#### 2. 编码
> 说到底，还是要撸代码的……


#### 3. 测试
> 不测试一下，怎么知道做得对不对


#### 5. 结语
>
欢迎指正，互相交流


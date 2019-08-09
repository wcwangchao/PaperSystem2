#PaperSystem
注意点：
1.IDEA上的运行配置
Tomcat的的配置页面，切换到Deployment选项页 点击 + 号选择 Arctifact ，添加 项目名:war exploded 打包 
最后在Application context 中选择 空白 那一项，点击 Apply 应用。 
2.文件夹设置
在SRC /主目录下新建目录资源，右键文件夹，选在Make Directory中选择设置成Rerouce  Root
在src / main目录下新建目录：“java”，并将其设置为“Source Root”（即：此项目默认的代码文件源目录）
在项目的根目录下新建目标文件夹，系统自动将其设置为Source Root”（即：此项目默认的代码文件源目录） 
可以在Modules中来创建和设置文件夹

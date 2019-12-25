# solon weed3 demo

这是一个用户写的demo。

调整了一下变成2个demo：一个注解模式，一个非注解模式。可以对比性的了解框架应用方式。



### 关于solon说明

* 资源路径说明（不用配置）

```
resources/application.properties（或 application.yml） 为应用配置文件
resources/static/ 为静态文件根目标
resources/WEB-INF/view/ 为视图文件根目标（支持多视图共存）
```

* 模板调试模式（或加热加载模式）：

```
启动参数添加：-deubg=1
```



### 关于weed3说明

* 资源路径说明（不用配置）

```
resources/weed3/ 为XMLSQL和模板SQL根目录
```



### 其它说明

* 编译参数添加-parameters
1. meven配置示例：

 ```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-compiler-plugin</artifactId>
	<version>3.7.0</version>
	<configuration>
		<compilerArgument>-parameters</compilerArgument>
		<source>1.8</source>
		<target>1.8</target>
		<encoding>UTF-8</encoding>
	</configuration>
</plugin>
 ```

2. 有些工具可能需要特别的设置，以Eclipse、MyEclipse为例（IDEA不用设置）：
```
菜单：Preferences -> Java -> Compiler:

开启： Store information about method parameters(usable via reflection)
```


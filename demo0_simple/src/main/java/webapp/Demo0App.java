package webapp;

import org.noear.solon.XApp;
import org.noear.weed.DbContext;
import org.noear.weed.WeedConfig;
import webapp.dso.mapper.DemoMapper;
import webapp.model.Demo;

import java.util.Map;

public class Demo0App {

	public static void main(String[] args) throws Exception{
		//启动solon （用于获取配置，或支持注解）
		XApp.start(Demo0App.class, args);

		//打印执行代码（在执行前打印）
		WeedConfig.onExecuteBef((cmd) -> {
			System.out.println(cmd.text);
			System.out.println(cmd.paramMap());
			return true;
		});

		//创建DbContext实例
		DbContext db = new DbContext(XApp.cfg().getProp("test.db"));
		DbContext db2 = new DbContext(XApp.cfg().getProp("test.db2"));

		//执行测试
		test0(db);
		test1(db);

		test0(db2);//另一个数据源
	}

	public static void test0(DbContext db) throws Exception {
		DemoMapper mapper = db.mapper(DemoMapper.class);

		Demo demo = mapper.demo_get2(1);

		System.out.println("test0::" + demo);
	}

	public static void test1(DbContext db) throws Exception {
		Map<String, Object> map = db.table("demo").limit(1).select("*").getMap();

		System.out.println("test1::" + map);
	}
}

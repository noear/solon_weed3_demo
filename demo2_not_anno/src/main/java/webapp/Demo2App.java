package webapp;

import org.noear.solon.XApp;
import org.noear.solon.core.Aop;
import webapp.controller.DemoController;

public class Demo2App {

	public static void main(String[] args) throws Exception{
		XApp.start(Demo2App.class, args);

		//测试
		DemoController tmp = Aop.get(DemoController.class);
		System.out.println(tmp.helloWorld());
	}
}

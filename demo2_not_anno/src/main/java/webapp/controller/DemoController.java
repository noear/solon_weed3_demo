package webapp.controller;

import org.noear.solon.annotation.XController;
import org.noear.solon.annotation.XInject;
import org.noear.solon.annotation.XMapping;
import org.noear.solon.core.ModelAndView;
import org.noear.weed.DbContext;
import webapp.Config;
import webapp.dso.mapper.DemoMapper;
import webapp.dso.service.StatService;
import webapp.model.Demo;

@XController
@XMapping("/demo")
public class DemoController {

	DbContext db = Config.db();
	DemoMapper demoMapper = db.mapper(DemoMapper.class);

	@XMapping("hello")
	public Object helloWorld() throws Exception{

		StatService.stat();

		System.out.println(demoMapper.demo_get3());

		Demo demo = demoMapper.demo_get2(1);

		ModelAndView mv = new ModelAndView("hello.ftl");
		mv.put("m",demo);

		return mv;
	}

}

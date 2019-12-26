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

	DemoMapper demoMapper = Config.db().mapper(DemoMapper.class);

	@XMapping("hello")
	public Object helloWorld() throws Exception {

		StatService.stat();

		System.out.println(demoMapper.demo_get3());

		Demo demo = demoMapper.demo_get2(1);

		ModelAndView mv = new ModelAndView("hello.ftl");
		mv.put("m", demo);

		return mv;
	}

	@XMapping("hello2")
	public Object hello2() throws Exception {
		return Config.db().table("demo").limit(1).select("*").getMap();
	}
}

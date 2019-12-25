package webapp.dso.service;

import org.noear.solon.annotation.XBean;
import org.noear.solon.annotation.XInject;
import webapp.dso.mapper.StatMapper;

//是否继承一个接口，不影响在Controller 被注入
//只在项目内用的话，没必要再定义个Service接口
//
@XBean
public class StatService {
    @XInject
    StatMapper statMapper;

    public void stat(){
        System.out.println("我要统计了:");
        System.out.println(statMapper.tml_test(1));
    }
}

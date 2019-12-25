package webapp.dso.service;

import webapp.Config;
import webapp.dso.mapper.StatMapper;

//是否继承一个接口，不影响在Controller 被注入
//只在项目内用的话，没必要再定义个Service接口
//
public class StatService {

    static StatMapper statMapper = Config.db().mapper(StatMapper.class);

    public static void stat(){
        System.out.println("我要统计了:");
        System.out.println(statMapper.tml_test(1));
    }
}

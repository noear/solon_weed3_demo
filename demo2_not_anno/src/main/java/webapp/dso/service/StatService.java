package webapp.dso.service;

import webapp.Config;
import webapp.dso.mapper.StatMapper;

public class StatService {

    static StatMapper statMapper = Config.db2().mapper(StatMapper.class);

    public static void stat(){
        System.out.println("我要统计了:");
        System.out.println(statMapper.tml_test(1));
    }
}

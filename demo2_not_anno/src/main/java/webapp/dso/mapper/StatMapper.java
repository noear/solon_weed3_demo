package webapp.dso.mapper;

import org.noear.weed.annotation.Sql;
import webapp.model.Demo;

public interface StatMapper {
    //用于处理复杂的统计查询
    @Sql("#tml_test.sql")
    Demo tml_test(int id);
}

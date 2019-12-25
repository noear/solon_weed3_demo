package webapp.dso.mapper;

import org.noear.weed.BaseMapper;
import org.noear.weed.annotation.Db;
import org.noear.weed.xml.Namespace;
import webapp.model.Demo;

import java.util.List;

@Db("test.db")
@Namespace("webapp.dso.mapper")
public interface DemoMapper extends BaseMapper<Demo> {
    Demo demo_get2(int id) throws Exception;

    //测试
    List<Demo> demo_get3() throws Exception;
}

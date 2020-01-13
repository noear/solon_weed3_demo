package webapp.dso.mapper;

import java.math.*;
import java.time.*;
import java.util.*;

import org.noear.weed.BaseMapper;
import org.noear.weed.DataItem;
import org.noear.weed.DataList;
import org.noear.weed.annotation.Db;
import org.noear.weed.xml.Namespace;
import webapp.model.*;

@Namespace("webapp.dso.mapper")
public interface DemoMapper extends BaseMapper<Demo>{
    Demo demo_get2(int id) throws Exception;

    //测试
    List<Demo> demo_get3() throws Exception;
}

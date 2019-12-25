package webapp;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.XApp;
import org.noear.solon.annotation.XBean;
import org.noear.solon.annotation.XConfiguration;
import org.noear.weed.DbContext;
import org.noear.weed.WeedConfig;

import javax.sql.DataSource;
import java.util.Properties;

@XConfiguration
public class Config {
    static {
        //打印执行代码
        WeedConfig.onExecuteBef((cmd) -> {
            System.out.println(cmd.text);
            return true;
        });
    }

    //solon 的 函数XBean，不支持参数（solon 可以方便的拿到配置）
    @XBean("test.db")
    public DbContext db() throws Exception {
        Properties prop = XApp.cfg().getProp("test.db");

        DataSource dataSource = new HikariDataSource(new HikariConfig(prop));

        return new DbContext(prop.getProperty("schema"), dataSource);
    }
}

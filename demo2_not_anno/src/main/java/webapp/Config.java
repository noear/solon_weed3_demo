package webapp;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.XApp;
import org.noear.weed.DbContext;
import org.noear.weed.WeedConfig;

import javax.sql.DataSource;
import java.util.Properties;

public class Config {
    static {
        //打印执行代码
        WeedConfig.onExecuteBef((cmd) -> {
            System.out.println(cmd.text);
            System.out.println(cmd.paramMap());
            return true;
        });
    }

    private static DbContext _db;
    public static DbContext db() {
        if (_db == null) {
            Properties prop = XApp.cfg().getProp("test.db");

            DataSource dataSource = new HikariDataSource(new HikariConfig(prop));

            _db = new DbContext(prop.getProperty("schema"), dataSource);
        }

        return _db;
    }
}

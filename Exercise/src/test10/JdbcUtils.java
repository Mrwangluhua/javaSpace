package test01;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author: wlh
 * @description:
 * @date: 2018/12/10
 * @param:
 */
public class JdbcUtils {
    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(in);
        String jdbcDriver= properties.getProperty("jdbcDriver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        Class.forName(jdbcDriver);
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeAll(AutoCloseable... autoCloseables) {
        for (AutoCloseable autoCloseable : autoCloseables) {
            if(autoCloseable!=null){
                try {
                    autoCloseable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

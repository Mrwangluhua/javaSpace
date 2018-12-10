package test01;

import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: wlh
 * @description:
 * @date: 2018/12/10
 * @param:
 */
public class JdbcTest {
    @Test
    public void test(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = test01.JdbcUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()){
                Object pid = resultSet.getObject("pid");
                Object pname = resultSet.getObject("pname");
                Object price = resultSet.getObject("price");
                Object flag = resultSet.getObject("flag");
                Object category_id = resultSet.getObject("category_id");
                System.out.println(pid+"\t"+pname+"\t"+price+"\t"+flag+"\t"+category_id);
            }
        } catch (Exception e) {

        } finally {
            test01.JdbcUtils.closeAll(resultSet,statement,connection);
        }
    }
}

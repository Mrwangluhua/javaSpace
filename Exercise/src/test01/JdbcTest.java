package test01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: wlh
 * @description:
 * @date: 2018/12/10
 * @param:
 */
public class JdbcTest {
    public static void main(String[] args) {

 /*   }
    @Test
    public void test(){*/
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from products");
            while (resultSet.next()){
                Object pid = resultSet.getObject("pid");
                Object pname = resultSet.getObject("pname");
                Object price = resultSet.getObject("price");
                Object flag = resultSet.getObject("flag");
                Object categoryId = resultSet.getObject("category_id");
                System.out.println(pid+"\t"+pname+"\t"+price+"\t"+flag+"\t"+categoryId);
            }
        } catch (Exception ignored) {

        } finally {
            JdbcUtils.closeAll(resultSet,statement,connection);
        }
    }
}

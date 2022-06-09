package jdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: Waterless
 * @Date: 2022/06/09/14:53
 * @Description:查询操作
 */
public class JDBCContains {
    public static void main(String[] args) throws SQLException {
        //1.获取数据源
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/water_less?characterEncoding=utf8&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        //2.获取连接对象 Connection
        Connection connection = dataSource.getConnection();
        //3.获取Statement对象，就是具体执行SQL的对象
        String sql = "select * from user where username = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"张三");
        //4.执行sql 取得返回值，也是一个对象，存在ResultSet这个对象中
        ResultSet resultSet = statement.executeQuery();
        //5.遍历结果集
        String pass = null;
        while (resultSet.next()) {
            //获取查询结果集中列名为id的属性值，数据库的列是什么类型，咱就用Java中对应的类型来接收
            int id = resultSet.getInt("id");
            //查询结果集中属性名为uesrname的属性值
            String username = resultSet.getString("username");
            //查询结果集中属性名为password的属性值
            String password = resultSet.getString("password");
            System.out.println("id = " + id + ",username = " + username + ",password = " + password);
            //获取查询结果中列名为password的值
//            pass = resultSet.getString("password");
        }
//            if ("1234".equals(pass)) {
//                System.out.println("登陆成功");
//            } else {
//                System.out.println("密码错误，登陆失败");
//            }
            //6.关闭资源
            resultSet.close();
            connection.close();

    }
}

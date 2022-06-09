package jdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: Waterless
 * @Date: 2022/06/08/21:24
 * @Description:
 */
public class JDBCAdd {
    public static void main(String[] args) throws SQLException {
        //1.先获取数据源 数据是从哪个数据库来的
        MysqlDataSource dataSource = new MysqlDataSource();
        //2.配置数据源属性,用户名，密码,连接的ip和端口号
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/ebook?characterEncoding=utf8&&useSSL=false");
        // -u
        dataSource.setUser("root");
        // -p
        dataSource.setPassword("123456");
        //3.获取数据库连接 发起网络请求,根据上面的配置
        // java.sql.Connection 连接对象
        Connection connection = dataSource.getConnection();
        //4.写SQL语句  就是String对象
        String sql = "insert into student(id,name) values(?,?)";
        //5.获取执行SQL的Statement对象，mysql中每一个sql的执行就对应一个Statement对象
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,6);
        statement.setString(2,"吕布");
        //6.执行这个SQL 增删改调用executeUpdate,返回受影响的行数，查询是另外一个
        int rows = statement.executeUpdate();
        System.out.println("插入成功，插入" + rows + "行");
        //7.关闭资源
        connection.close();

    }
}

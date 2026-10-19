import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTest {
    // 注意：这里必须写 main 方法，程序才能运行
    public static void main(String[] args) throws Exception {

        // 1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 获取连接
        // ⚠️ 千万注意：确保你的数据库叫 web01，且密码 1234 是对的
        String url = "jdbc:mysql://localhost:3306/web01?useSSL=false&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "18992509808kjg"; // 换成你真实的 MySQL 密码！

        Connection connection = DriverManager.getConnection(url, username, password);

        // 3. 获取SQL语句执行对象
        Statement statement = connection.createStatement();

        // 4. 执行SQL (把 id=1 的大乔年龄改成 25)
        int i = statement.executeUpdate("update user set age = 25 where id = 1");
        System.out.println("执行成功，受影响的行数：" + i);

        // 5. 释放资源
        statement.close();
        connection.close();
    }
}
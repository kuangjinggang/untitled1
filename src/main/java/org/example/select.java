package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class select {

    // 直接用 main 方法，不需要 @Test，不需要额外的 JUnit 依赖！
    public static void main(String[] args) throws Exception {
        // 1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 获取连接
        String url = "jdbc:mysql://localhost:3306/web01?useSSL=false&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "18992509808kjg"; // ⚠️ 确保这是你真实的 MySQL 密码！
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3. 获取执行对象
        Statement statement = connection.createStatement();

        // 4. 执行查询
        String sql = "select id,username,password,name,age from user where username = 'daqiao' and password = '123456'";
        ResultSet rs = statement.executeQuery(sql);

        // 5. 遍历结果集
        while (rs.next()) {
            User user = new User(); // 确保你已经建好了 User 类！
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));

            // 打印 User 对象
            System.out.println(user);
        }

        // 6. 释放资源
        rs.close();
        statement.close();
        connection.close();
    }
}
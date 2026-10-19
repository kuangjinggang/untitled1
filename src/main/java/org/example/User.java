package org.example;

public class User {
    private Integer id;       // ID
    private String username;  // 用户名
    private String password;  // 密码
    private String name;      // 姓名
    private Integer age;      // 年龄

    // 必须加 Getter/Setter 方法，不然读取不到数据
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    // 必须重写 toString 方法，不然打印出来是内存地址
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
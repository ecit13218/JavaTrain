package com.zhengyao.mybatis;

import com.zhengyao.mybatis.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhengyao3@郑瑶
 * @date : 2020/8/5 17:33
 * @Description: jdbc操作数据库
 */
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        //ABCD
        //测试git123123123
        //改造同一行
        //数据库连接
        String url = "jdbc:mysql://localhost:3306/learn_mybatis?characterEncoding=utf-8";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);
        //sql语句 ？是占位符
        String sql = "select * from user where id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        //设置参数
        pstmt.setString(1, "1");
        //查询结果集
        ResultSet resultSet = pstmt.executeQuery();
        List<User> userList = new ArrayList<User>(10);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("username");
            //封装成User对象
            User user = new User();
            user.setId(id);
            user.setUsername(name);
            userList.add(user);
        }
        //输出结果
        System.out.println(userList);
    }
}

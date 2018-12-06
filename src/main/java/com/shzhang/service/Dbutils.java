package com.shzhang.service;

import java.sql.*;

public class Dbutils {

    // 定义数据库的用户名
    private final String USERNAME = "root";
    // 定义数据库的密码
    private final String PASSWORD = "123456";
    // 定义数据库的驱动信息
    private final String DRIVER = "com.mysql.jdbc.Driver";
    // 定义访问数据库的地址
    private final String URL = "jdbc:mysql://localhost:3306/shzhang";

    // 定义访问数据库的连接
    private Connection connection;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt;
    // 定义查询返回的结果集合
    private ResultSet resultSet;

    public Dbutils() {
        try {
            Class.forName(DRIVER);
            System.out.println("注册驱动成功！！");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("注册驱动失败！！");
        }

    }

    // 定义获得数据库的连接
    public Connection getConnection() {

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if(connection != null) {
                System.out.println("连接数据库成功");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Connection exception !");
        }

        return connection;

    }

    /**关闭数据库访问
     * @throws SQLException
     */
    public void releaseConn() throws SQLException {
        if (resultSet!=null) {
            resultSet.close();
        }
        if (pstmt!=null) {
            pstmt.close();
        }
        if (connection!=null) {
            connection.close();
        }
    }

}


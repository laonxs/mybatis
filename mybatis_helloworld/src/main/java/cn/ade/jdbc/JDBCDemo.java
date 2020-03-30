package cn.ade.jdbc;

import java.sql.*;

/**
 * 需求描述：单独使用jdbc开发程序
 *
 * @author ade
 * @version 1.0，2018-01-10 19:34:07
 */
public class JDBCDemo {

    public static void main(String[] args) {
        // 数据库连接
        Connection conn = null;

        // 预编译的Statement，jdbc和数据库通过statement通信，statement中封装了sql语句及参数
        PreparedStatement pstmt = null;

        // 结果集
        ResultSet rs = null;

        try {
            // 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 通过驱动管理类获取数据库连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "1234");

            // 编写SQL语句
            String sql = "select * from user where username = ?";

            // 获取预编译的Statement
            pstmt = conn.prepareStatement(sql);

            // 设置参数
            pstmt.setString(1, "王五");

            // 向数据库发送sql语句进行查询，并获取结果集
            rs = pstmt.executeQuery();

            // 遍历结果集
            while (rs.next()) {
                System.out.println(rs.getString("username") + "----" + rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 资源释放
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                pstmt = null;
            }

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }
        }
    }

}

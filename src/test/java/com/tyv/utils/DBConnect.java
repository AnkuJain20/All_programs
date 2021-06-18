package com.tyv.utils;

import com.tyv.base.BaseTestClass;
import org.testng.Assert;

import java.sql.*;

public class DBConnect extends BaseTestClass {


    public void connectAndCheck(String user_name) {
        try {
            Connection conn = DriverManager.getConnection(dbUrl, dbUname, dbPwd);
            if (conn != null) {
                String query = "select user_id from user_details where user_name='" + user_name + "'";
                System.out.println("Query:" + query);

                PreparedStatement pst = conn.prepareStatement(query);
                ResultSet rs = pst.executeQuery();

                String userId=null;
                while (rs.next()) {
                    userId = rs.getString("user_id");
                    System.out.println("UserId "+userId);
                }
                Assert.assertNotNull(userId);
            }
            else
                System.out.println("Failed to connect");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        DBConnect dbConnect = new DBConnect();
        dbConnect.connectAndCheck("dfdfkhkdhfkd");
    }
}

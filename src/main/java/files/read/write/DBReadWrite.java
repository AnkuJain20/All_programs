package files.read.write;

import java.sql.*;

public class DBReadWrite {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/contactdb";
        String user = "root";
        String password = "secret";
        Connection conn=null;
        try {
             conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

        }
        catch(Exception e){ System.out.println(e);}
        finally {
            conn.close();
        }

    }
}

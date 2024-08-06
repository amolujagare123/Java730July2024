package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      // 1.  Loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

      // 2. Creating connection
        String url = "jdbc:mysql://localhost:3306/amazon";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,username,password);

      // 3. Creating statement
        Statement st = con.createStatement();

      //  Executing query
     //   DML Queries - Data Manipulation language
        // insert / update / delete
     //   String sql = "insert into student values(10,'ashwini','IT',88)";
      //  String sql = "update student set marks=100 where rno=10";
        String sql = "delete from student where rno=10";

        st.executeUpdate(sql);

        st.close();
        con.close();

    }
}

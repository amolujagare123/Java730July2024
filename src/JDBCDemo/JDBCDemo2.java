package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

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
     //   DDL Queries - Data Definition language

        String sql = "select * from student where marks<80";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t" );
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }


        st.close();
        con.close();

    }
}

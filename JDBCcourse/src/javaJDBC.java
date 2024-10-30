import java.sql.*;

public class javaJDBC {
    public static void main(String[] args) throws Exception {
        /*
            import the package
            load and register
            create connection
            create statement
            execute statement
            process and results
            close
        */
        String url = "jdbc:postgresql://localhost:5432/newdb1";
        String pass = "aniket123";
        String uname = "postgres";
//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
//        String sql = "select * from events";
        String sql = "insert into events values (11,'ywertgwer')";

        System.out.println("Connection Established");

//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        System.out.println(rs.next());
//        rs.next();
//        System.out.println(rs.getString("name"));
//        while(rs.next())
//        {
//            System.out.println(rs.getString("name"));
//        }

        Statement st = con.createStatement();
        boolean status = st.execute(sql);
        System.out.println(status);
        con.close();
        System.out.println("Connection Closed");
//        use preparedstatement it is better than statement
    }
}

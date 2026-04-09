import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseExample1 {
    public static void main(String[] args) throws Exception {
        // Class.forName("")
        String connString = "jdbc:mysql://localhost:3306/db1";
        Connection conn = DriverManager.getConnection(connString, "root", "root");
        if (conn != null)
            System.out.println("Connenction establised");

        Statement stmt = conn.createStatement();
        String sql = "create table course(cid int,sname varchar(20),duration int)";
        if (stmt.execute(sql))
            System.out.println("table created successfully ");

        // String sql = "insert into student values(1,'Priyanshu')";
        // int i = stmt.executeUpdate(sql);
        // System.err.println(i + " Row affected ");
    }
}

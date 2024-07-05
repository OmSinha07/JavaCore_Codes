import java.sql.*;
class Database_4
{
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\KIIT\\sqlite\\univ.db");
        Statement stm=con.createStatement();
        
        stm.executeQuery("drop table temp");
        stm.close();
        con.close();

    }
}
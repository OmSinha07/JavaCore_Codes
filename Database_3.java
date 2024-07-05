import java.sql.*;
class Database_3
{
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\KIIT\\sqlite\\univ.db");
        Statement stm=con.createStatement();
        stm.executeQuery("update dept set dname='chem' where deptno= 50");
        stm.close();
        con.close();

    }
}
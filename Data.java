import java.sql.*;
class Data
{
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("C://Users//KIIT//sqlite//univ.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("Select * from dept");
        int dno;
        String dname;
        while (rs.next()) {
            dno=rs.getInt("deptno");
            dname=rs.getString("dname");
            System.out.println(dno+" "+dname);
            
        }
    }
}
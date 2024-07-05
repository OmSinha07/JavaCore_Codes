import java.sql.*;
class Database
{
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\KIIT\\sqlite\\univ.db");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("Select * from students");
        int dno,roll;
        String name,city;
        while (rs.next()) {
            roll=rs.getInt("roll");
            name=rs.getString("name");
            city=rs.getString("name");
            dno=rs.getInt("roll");
            System.out.println(roll+" "+name+" "+city+" "+roll);
            
        }
        stm.close();
        con.close();

    }
}
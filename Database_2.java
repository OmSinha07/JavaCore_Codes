import java.sql.*;
import java.util.*;
class Database_2
{
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\KIIT\\sqlite\\univ.db");
        PreparedStatement stm=con.prepareStatement("Select * from students where deptno=?");
        
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Dept Number");
        int dno=in.nextInt();
        stm.setInt(1, dno);
        ResultSet rs=stm.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");
            
            
        }
        stm.close();
        con.close();
        
    }
}

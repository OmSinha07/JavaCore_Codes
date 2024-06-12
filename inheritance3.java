 class Super
{
    public void disp()
    {
        System.out.println("super class");
    }
}
class sub extends Super
{
 public void disp()
 {
    System.out.println("sub class");
 }
} 
public class inheritance3 {
    public static void main(String[] args) {
        Super ob=new sub();
        ob.disp();

    }
}

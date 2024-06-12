import java.util.*;
class Readkeyboard
{
public static void main(String[]args)
{
String name;
Scanner in=new Scanner(System.in);
System.out.println("enter your name");
name=in.nextLine();
System.out.println("welcome Mr "+name);
}
}
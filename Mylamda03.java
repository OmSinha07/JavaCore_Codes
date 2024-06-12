class Uselamda 
{
public void callLamda(My Lamda ml)
{
ml.display();
}
}
class Demo
{
public void method1()
{
Uselamda ul=new Uselamda();
ul.callLamda(()->{System.out.println("Hello");});
}
}
public class Mylamda03
{
public static void main(String[] args)
{
Demo d=new Demo();
d.method1();
}
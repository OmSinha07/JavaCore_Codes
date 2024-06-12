@FunctionalInterface
interface Mylamda
{
public int add(int x,int y);
}

public class Mylamda02
{
public static void main(String[] args) {
    Mylamda m=(a,b)->a+b;
    int r=m.add(20,30);
    System.out.println(r);
}
}
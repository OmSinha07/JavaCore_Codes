
interface Mylamda{

    public void display();
}
class My implements Mylamda {
    public void display()
    {
        System.out.println("Hello world");
    }
}
public class Mylamda01
{
public static void main(String[] args) {
    Mylamda m=()->{System.out.println("Hello world");
};
    m.display();
}
}
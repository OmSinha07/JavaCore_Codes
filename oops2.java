class cylinder
{
    int r,h;
    public double lidarea()
    {
        return 3.14*r*r;
    } 
    public double circumferance()
    {
        return 2*3.14*r*r;

    }
    public double surfacearea()
    {
        return 2*lidarea()+circumferance();
    }
    public double volume()
    {
        return lidarea()*h;
    }
}

public class oops2 {
    public static void main(String[] args) {
        
    
    cylinder ob=new cylinder();
    ob.h=2;
    ob.r=4;
    System.out.println(ob.lidarea());
    System.out.println(ob.volume());
    System.out.println(ob.surfacearea());
    }

}

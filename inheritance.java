class circle
{
    public double r;
    public double area()
    {
        return 3.14*r*r;
    }
}
     class cylinder extends circle
    {
        public double h;
        public double volume()
        {
            return area()*h;
        }

    }

public class inheritance 
{
    public static void main(String[] args)
    {
        cylinder ob=new cylinder();
        ob.h=2;
        ob.r=5;
        System.out.println(ob.area());
        System.out.println(ob.volume());
}
}

class cykinder
{
    private int radius;
    private int height;

 public cykinder()
 {
    radius=height=1;
 }
 public cykinder(int r,int h)
{
    radius=r;
    height=h;
}
public int getHeight()
{
return height;
}
public int getRadius()
{
    return radius;
}
public void setHeight(int h)
{
    if(h>=0)
    height=h;
    else
    height=0;
}
public void setRadius(int r)
{
    if(r>=0)
    radius=r;
    else
    radius=0;
}
public void setDimensions(int h,int r)
{
    height=h;
    radius=r;
}
public double lidArea()
{
    return 3.14*radius*radius;
}
public double perimeter()
{
return 2*3.14*radius;
}
public double volume()
{
    return lidArea()*height;
}
}

public class oops6 {
    public static void main(String[] args) {
      cykinder c=new cykinder(10,7);
      c.setHeight(10);
      c.setRadius(7);
      c.setDimensions(10,7);
      System.out.println(c.lidArea());
      System.out.println(c.volume());
      System.out.println(c.getHeight());
      System.out.println(c.getRadius());
    }
    
}

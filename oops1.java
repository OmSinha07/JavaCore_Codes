  class rectangletest {
    public int l;
    public int b;
    int area()
    {
        int area=l*b;
        return area;
    }
    int perimerter()
    {
        int peri=2*(l+b);
        return peri;
    }
    boolean check_square()
    {
    if (l==b)
    return true;
    else
    return false;
    }
}
 public class oops1
{
 public static void main(String[] args) {
    rectangletest ob=new rectangletest();
    ob.l=2;
    ob.b=4;
   int  perimerter=ob.perimerter();
   int area=ob.area();
   boolean square=ob.check_square();
   System.out.println(perimerter);
   System.out.println(area);
   System.out.println(square);
   
 }
}

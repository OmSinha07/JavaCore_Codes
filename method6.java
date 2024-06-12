public class method6 {
    static float area (int l1,int b1)
    {
        float ar=l1*b1;
        return ar;
    }
    static float area(int r)
    {
      float ar=(float)3.14 *r * r;
        return ar;
    }
    public static void main(String arsg[])
    {
        float ar1,ar2;
        ar1=area(11,13);
        ar2=area(4);
        System.out.println(ar1);
        System.out.println(ar2);
    }
}

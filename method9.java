public class method9 {
   static int max(int ...x)
   {
    int d=x[0];
    for (int i=0;i<x.length;i++)
    {
        if(d<x[i])
        d=x[i];
    }
    return d;
   }
    public static void main(String[] args) {
        int g=max(20,30,45,46);
        System.out.println(g);
    }
    
}

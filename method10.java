 public class method10 {
    static int max(int ...x)
    {
        int s=0;
     for (int i=0;i<x.length;i++) 
     {
    s=s+x[i];    
    }
    return s;
}
public static void main(String[] args)
 {
  int sum=max(10,20,34,45);
  System.out.println(sum);  
}
 }

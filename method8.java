//vararg
public class method8 {
    static void validate(int start,String ...s ) 
    {
        for(int i=0;i<s.length;i++)
        {
      System.out.println(start+" "+s[i]);
      start++;
        }
    }
    public static void main(String[] args) {
        validate(0, "bali","om","dany","jaish");
    }
}

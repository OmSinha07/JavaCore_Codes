public class loop15
{
    // 12345
    // 1234
    // 123
    // 12
    // 1
    public static void main(String[] args) 
    {
        int p=0;
        for(int i=5;i>=1;i--)
        {
       
            for(int j=1;j<=i;j++)
            {
                p++;
                System.out.print(j);
            }
              System.out.println("");
        }
    }
}
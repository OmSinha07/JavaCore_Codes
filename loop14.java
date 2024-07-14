public class loop14
{
// 1
// 23
// 456
// 78910
// 1112131415

    public static void main(String[] args) 
    {
        int p=0;
        for(int i=1;i<=5;i++)
        {
       
            for(int j=1;j<=i;j++)
            {
                p++;
                System.out.print(p);
            }
              System.out.println("");
        }
    }
}
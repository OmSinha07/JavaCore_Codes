public class loop11
 {
//     23456
//     34567
//     45678
//     56789
//     678910
    public static void main(String[] args) 
    {
        int n=2;
        for(int i=1;i<=5;i++)
        {
            int p=n;
            for(int j=1;j<=5;j++)
            {
                
                System.out.print(p+"");
                p++;
            }
            n++;
            System.out.println("");
        }
    }
}
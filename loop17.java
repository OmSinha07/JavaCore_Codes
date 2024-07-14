public class loop17
 {
//      *
//     **
//    ***
//   ****
    public static void main(String[] args) 
    {
       int p=0;
        for(int i=4;i>=1;i--)
        {
       p++;
            for(int j=1;j<=i;j++)
            {
            
                System.out.print(" ");
            }
            
              for(int j=1;j<=p;j++)
              {
                
                  System.out.print("*");
                }  
                System.out.println("");
              
            }
        }
      }

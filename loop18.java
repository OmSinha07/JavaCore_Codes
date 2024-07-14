public class loop18
{


//      *
//     ***
//    *****
//   *******
//   *******
//    *****
//     ***
//      *
    public static void main(String[] args) 
    {
       int p=-1;
        for(int i=4;i>=1;i--)
        {
       p+=2;
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

        
        int t=1;
        for(int i=7;i>=1;i-=2)
        {
            for(int j=1;j<=t;j++)
            {
              
                System.out.print(" ");
              }  
            for(int j=1;j<=i;j++)
            {
            
                System.out.print("*");
            }
            
             
                System.out.println("");
                t++;
      }
    }
}
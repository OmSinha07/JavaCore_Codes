import java.util.*;
public class Conditional5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int yr=in.nextInt();
        if(yr%4==0)
        {
            if(yr%100==0)
            {
                if(yr%400==0)
                {
                    System.out.println("Its a leap yr");
                }
                else
                System.out.println("not a Leap Year");
                
            
        }
        else
        {
              System.out.println("Its a Leap Year");

        }
        
    }
    else
    {
        System.out.println("Not a Leap Year");
    }
            }
        }
    

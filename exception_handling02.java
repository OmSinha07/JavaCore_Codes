import java.util.*;
public class exception_handling02 {
    public static void main(String[] args) {

    int A[]={10,4,2,14,0};
    try{
    int c=A[0]/A[3];
        System.out.println(c);
        try
        {
            System.out.println(A[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of index ");
        }
    }
        catch(ArithmeticException e)
        {
            System.out.println("Division by 0");
        }
    System.out.println("bye");
    }
      }

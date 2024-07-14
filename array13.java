import java.util.*;
public class array13 {

    public static void main(String[] args) {
       
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(C[i][j]+" ");
        }
        System.out.println(" ");
    }
    }
}

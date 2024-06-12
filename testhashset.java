import java.util.*;
public class testhashset {

    public boolean isPossibleToSplit(int[] nums) {
    
        Hashset<Integer> h=new Hashset<>();
        for(int i=0;i<nums.length;i++)
        {
        h.add(nums[i]);
        }
        if(h.size()==1)
        return false;
        else
        return true;
    }
}
public static void main(String args[])
{
    Hashset<Integer> h=new Hashset<>();
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]=in.nextInt();
    }
    
}
    


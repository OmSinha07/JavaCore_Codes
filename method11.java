public class method11 {
    static double dis(int ...x)
    {
        double diss=0;
        int s=0;
     for (int i=0;i<x.length;i++) 
     {
    s=s+x[i];    
    }
    if(s<500)
    diss=(0.10)*s;
    else if(s>500 && s<1000)
    diss=(0.15)*s;
    else
    diss=(0.20)*s;
    return diss;
    }
public static void main(String[] args) {
    double discoumt=dis(200,194,200,232,233);
    System.out.println(discoumt);
}
}

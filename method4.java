public class method4 {
 static int gcd(int n,int m)
 {
    while(m!=n)
    {
    if(n>m)
    n=n-m;
    else
    m=m-n;
    }
    return m;      
}
public static void main(String[] args) {

int g=gcd(25,15);
System.out.println(g);
}
}

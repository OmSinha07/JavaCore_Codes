public class method5 {
static int max(int a[])
{
    int l=a[0];
for(int i=0;i<a.length;i++)
{
    
if(l<a[i])
l=a[i];
}
return l;
}
public static void main(String[] args) {
    int a[]={2,45,5,6};
    int gt=max(a);
    System.out.println(gt);
}
}

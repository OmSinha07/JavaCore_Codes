

class student
{
    String name;
    int rollno;
    int m1,m2,m3;
    public int  total_marks()
    {
        return m1+m2+m3;
    }
    public double avg()        {
            return (m1+m2+m3)/3;
        }
        public char grade()
        {
            if(avg()>=90)
            return 'O';
            else if(avg()>=80 && avg()<=90)
            return'E';
            else
            return'A';
        }
}

public class oops3 {
    public static void main(String[] args) {
        student ob=new student();
        ob.name="om sinha";
        ob.rollno=3173;
        ob.m1=91;
        ob.m2=93;
        ob.m3=92;
        System.out.print(ob.name+" "+ob.rollno);
        System.out.println();
        System.out.println(ob.total_marks());
        System.out.println(ob.avg());
        System.out.println(ob.grade());
    }
    
}

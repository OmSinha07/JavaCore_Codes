import java.util.*;
strictfp public class DateDemo
{
    public static void main(String[] args) {
       
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);

        Date d=new Date();
        System.out.println(d.getYear()+1900);
        GregorianCalendar gc=new GregorianCalendar();
       System.out.println( gc.isLeapYear(2020));
       System.out.println( Calendar.DATE);
       gc.setTimeZone(TimeZone.getTimeZone("America/los_Angeles"));
       TimeZone tz=gc.getTimeZone();
       System.out.println( tz.getDisplayName());
       System.out.println( tz.getID());


    } 
    
    
}
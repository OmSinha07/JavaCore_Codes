import java.util.*;
import java.time.*;
import java.time.temporal.*;
public class Joda_DateTime {
    public static void main(String[] args) {
        Date d=new Date();
        d.setHours(21);;
        System.out.println(d); 
        
        LocalDate dt=LocalDate.parse("2020-01-03");
        LocalDate d1=dt.plusMonths(6);
        System.out.println(d1);

        LocalDateTime dt1=LocalDateTime.now();
        System.out.println(dt1);
         
    }
}

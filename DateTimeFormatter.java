import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
strictfp public class DateTimeFormatter 
{
public static void main(String[] args) 
{
   
    ZonedDateTime dt=ZonedDateTime.now();
   System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
   System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
   } 
}
    


    


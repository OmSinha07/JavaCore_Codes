import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
public class Classestime {
public static void main(String[] args) {
    ZonedDateTime zd= ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    OffsetDateTime oft= OffsetDateTime.now();
    System.out.println(zd);
    System.out.println(oft);
Period p=Period.of(2,2,10);
System.out.print(p.addTo(LocalDate.now()));
    Instant i=Instant.now();
System.out.println(i);
}
    
}

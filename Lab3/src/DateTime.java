
import java.time.*;
import java.util.*;

public class DateTime {  
   public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(1998, 06, 19);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.println("Difference in year is: "+diff.getYears()+ " Years " +diff.getMonths()+ " months " +diff.getDays()+ " days");
  }
}
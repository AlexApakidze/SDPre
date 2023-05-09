import java.time.LocalDate;
import java.time.DayOfWeek;


public class Objective2Lab3 {
  public static void main(String[] args) {

    LocalDate today = LocalDate.now();
    DayOfWeek dayOfWeek = today.getDayOfWeek();
    boolean isWeekend = (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);
    int year = 1991;
    String month = "August";

    System.out.println(year);
    System.out.println(month);
    System.out.println(isWeekend);
    

  }
}
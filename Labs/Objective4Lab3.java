import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    currentYear = 2023;
    System.out.println("How old are you?");
    age = input.nextInt();
    System.out.println (">> "+ age);

    birthYear = (currentYear - age);
    
    
    

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
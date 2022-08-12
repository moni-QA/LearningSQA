package practise2;

import java.util.Scanner;
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class EnumDemo {

        Day day;

        // Constructor
        public EnumDemo(Day day) {
            this.day = day;
        }

        // Prints a line about Day using switch
        public void dayIsLike()
        {
            switch (day) {
                case MONDAY:
                    System.out.println("Mondays are bad.");
                    break;
                case FRIDAY:
                    System.out.println("Fridays are better.");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekends are best.");
                    break;
                default:
                    System.out.println("Midweek days are so-so.");
                    break;
            }
        }

        // Driver method
        public static void main(String[] args)
        {
            String str = "MONDAY";
            EnumDemo t1 = new EnumDemo(Day.valueOf(str));
            t1.dayIsLike();
        }
}

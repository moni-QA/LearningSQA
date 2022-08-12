package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Date {

        public static void main(String[] args) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate now = LocalDate.now();
            System.out.println(dtf.format(now));

            String date = "2022 07 15";
            String[] dateArray = date.split(" ");
            System.out.println(Arrays.toString(dateArray));


        }


    }




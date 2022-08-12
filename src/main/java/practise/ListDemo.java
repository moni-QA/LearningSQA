package practise;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

        public static void main(String args[]) {
            List<String> list = new ArrayList<String>();
            list.add("one");
            list.add("two");
            list.add("three");

            System.out.println( list);

            for(String List:list){
                System.out.println(list);
            }


        }


}

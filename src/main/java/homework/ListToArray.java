package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {


    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(33);
        list.add(89);
        list.add(43);
        list.add(99);
        list.add(56);

        Integer[]array = list.toArray(new Integer[list.size()]);

        System.out.println("Printing Array:"+ Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Minimum="+ array[0]);


    }

}

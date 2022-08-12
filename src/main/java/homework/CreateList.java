package homework;

import java.util.ArrayList;
import java.util.List;

public class CreateList {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(33);
        list.add(89);
        list.add(43);
        list.add(99);
        list.add(56);

        int max = list.get(0);
        int n = list.size();

        for (int i = 1; i < n; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Maximum is : " + max);


    }

}

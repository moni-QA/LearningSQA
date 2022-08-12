package homework;

import java.util.Arrays;

public class FindMiddleElement {

    public int[] arrayMiddle(int[]a){

         int[] result ={a[(a.length/2)-1], a[a.length/2]};

         return result;
    }

    public static void main(String[] args) {

        int[] a = {7, 1, 2, 3, 4, 9};

        FindMiddleElement Problem2obj = new FindMiddleElement();

        System.out.println(Arrays.toString(Problem2obj.arrayMiddle(a)));
    }
}

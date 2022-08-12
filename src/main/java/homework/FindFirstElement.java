package homework;

import java.util.Arrays;

public class FindFirstElement {

    public int[] firstElement(int[] a, int[] b) {

        int[] result = {a[0], b[0]};
        return result;
    }

    public static void main(String[] args) {

        int[] a= {1,2,3};
        int[] b = {7,8,9};

        FindFirstElement Problem1obj = new FindFirstElement();

        System.out.println(Arrays.toString(Problem1obj.firstElement( a,b)));


    }

}



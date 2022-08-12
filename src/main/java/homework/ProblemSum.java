package homework;

import java.util.Arrays;

public class ProblemSum {

    public int[] arraySums(int[] a,int[] b) {

        int sum1 = 0, sum2 = 0;
        int i,j;

        for (i = 0; i < a.length; i++) {
            sum1 += a[i];
        }

        for (j = 0; j < b.length; j++) {
            sum2 += b[j];
        }

        int[]result = {sum1,sum2} ;
        return result;

    }

    public static void main(String[] args) {

        int[] a= {1,2,3};
        int[] b = {7,8,9};

        ProblemSum Problemsumobj = new ProblemSum();

        System.out.println(Arrays.toString(Problemsumobj.arraySums(a,b)));
    }


}

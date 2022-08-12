package practise;

import java.util.Arrays;

public class Arraydemo {

    public void sortArray(){

        String[] states ={"Florida","California","Georgia"};
        Arrays.sort(states);

        System.out.println(Arrays.toString(states));
    }

    public static void main(String[]args){
        Arraydemo arrayobj = new Arraydemo();
        arrayobj.sortArray();
    }
}

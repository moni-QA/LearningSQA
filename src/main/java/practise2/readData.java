package practise2;

import java.util.Scanner;

public class readData {

    public void getInputFromUser(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name:");
        String s = in.nextLine();
        System.out.println("Your Entered String " +s);

        System.out.print("Enter Your Age:");
        String a = in.nextLine();
        System.out.println("Your Entered Integer " +a);

        System.out.print("Enter Product Price:");
        String b = in.nextLine();
        System.out.println("Your Entered float " +b);

    }

    public static void main (String[] args){

        readData dataobj =new readData();
        dataobj.getInputFromUser();
    }



}

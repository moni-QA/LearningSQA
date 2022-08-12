package practise2;

public class Student {


    public static void main(String[]Args){

        Student s1 = new Student();
        Student s2= new Student();

        s1.showData();
        s2.showData();
    }
    int a;
    static int b;

    public Student(){
        b++;
    }

    public void showData(){
        System.out.println("value of A is: " +a);
        System.out.println("Value of B is:" +b);
    }

    public static void increment(){

        b++;
    }



}

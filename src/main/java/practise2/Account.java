package practise2;

public class Account {

    int a; // class level variable "a"
    int b; // Class Level Variable "b"

    public void setData(int a, int b){ // parameter "a","b"

        this.a= a;// java takes the value of parameter "a", and assign the value of parameter a
        this.b= b;
    }

    public void showData(){
        System.out.println("Value of A = " +a);
        System.out.println("Value of B = " +b);
    }



}

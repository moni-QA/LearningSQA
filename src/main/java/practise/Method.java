package practise;

public class Method {

    //Method parameter
    public int AddNumbers(int a, int b){

        int sum = a+b;
        return sum;
    }

    //Method Argument

    public static void main(String[]args){

        Method methodobj = new Method();
        int numbers = methodobj.AddNumbers(3,5);
        System.out.println("Total is: "+numbers);

    }

}

package practise;

public class Variables {

    //Local scope
    public void intVariables(){

        int salary =1000;
        System.out.println("My Salary is :"+ salary);
    }


    public void floatVariables(){
        float price = 45.6f;
        System.out.println("My Salary is :"+ price);
    }
    public void booleanVariables(){
        boolean red = true;
        boolean green = false;

        System.out.println("Red light is: "+red + "Green light is :"+green);

    }

    public void characterVariables(){

        char alphabet = 'A';
        System.out.println("Alphabet is: " +alphabet);
    }

    public void stringVariables(){

        String name= "Moniara";
        String city = "Newyork";

        System.out.println("My name is :" +name+ "I live in :" +city);
    }

    //global scope

    int salary = 2000;
    public void moniSalary(){
        System.out.println("My Salary is :" +salary);
    }

}

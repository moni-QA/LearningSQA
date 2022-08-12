package practise;

public class IfElse {

    public void IfStatement(){

        int x=10;
        if(x>5){

            System.out.println("This is if statement");
        }
    }

    public void IfElseStatement(){

        int x=30;
        if(x<20){

            System.out.println("This is if statement");
        }
        else {

            System.out.println("This is if statement");
        }
    }

    public void NestedIfStatement(){

        int x=30;
        int y=10;
        if(x<35) {
            if (y < 15) {

                System.out.println("X= " +x+ "Y= " +y);
            }
        }
    }

    public void SwitchStatements(){

        char grade = 'C';

        switch(grade){
            case'A':
                System.out.println("Excellent!");
                break;
            case'B':
                System.out.println("Very Good");
                break;
            case'C':
                System.out.println("Well Done");
                break;
            case'D':
                System.out.println("You Passed");
                break;
            case'F':
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Invalid Grade");
        }
        System.out.println("Your grade is " +grade);

    }


    public static void main(String[]args){

        IfElse ifobj = new IfElse();
        ifobj.IfStatement();
        ifobj.IfElseStatement();
        ifobj.NestedIfStatement();
        ifobj.SwitchStatements();

    }

}

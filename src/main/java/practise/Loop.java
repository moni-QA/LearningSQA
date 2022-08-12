package practise;

public class Loop {

    public void WhileLoop(){

        int x=10;

        while(x<20){

            System.out.println("Value of x is: "+x);
            x++;
        }
    }

    public void ForLoop(){

        for(int i=1; i<20;i++){
            System.out.println("Value of x is: "+i);
        }
    }

    public static void main(String[]args){

        Loop loopobj = new Loop();
        loopobj.WhileLoop();
        loopobj.ForLoop();
    }
}

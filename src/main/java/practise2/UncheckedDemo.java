package practise2;

public class UncheckedDemo {

    public static void main(String[]args){

        int num[ ] ={1,2,3,4};
        System.out.println(num[5]);

    }

    public void testException(){

        try {
            int num[ ] ={1,2,3,4};
            System.out.println(num[5]);

        }
        catch(Exception e){

            System.out.println(e);

        }
    }


}


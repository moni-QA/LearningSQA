package practise2;

public class Constructor {

    int x;
    public Constructor(int y){
        x=y;
    }

    public static void main(String[]Args){
        Constructor constructorobj = new Constructor(5);
        System.out.println(constructorobj.x);
    }
}

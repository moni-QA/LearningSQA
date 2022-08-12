package practise;

public class MethodString {

    public void IndexOf(){

        String myStr = "Hello Planet Earth, you are a great planet";

        System.out.println(myStr.indexOf("Planet"));
        System.out.println(myStr.indexOf("e",5));

        System.out.println(myStr.indexOf("test"));

    }

    public void SubString(){
        String str = "JavaPoint";
        String substr = str.substring(2);
        String substri = str.substring(0,4);
        System.out.println(substr);
        System.out.println(substri);
    }

    public void length(){
        String text ="Moniara Akter";
        System.out.println(text.length());
    }

    public void replace(){
        String mystr ="Hello";
        System.out.println(mystr.replace('l','p'));

        System.out.println(mystr.trim());
    }



    public static void main(String[]args) {

       MethodString stringobj = new MethodString();
       stringobj.IndexOf();
        stringobj.SubString();
        stringobj.length();
        stringobj.replace();
    }
    
}

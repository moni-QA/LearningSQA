package practise2;

import java.util.HashMap;
public class LearnHashmapWrapper {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Vishal", 10);
        map.put("Sachin", 20);
        map.put("Vibah", 30);

        System.out.println("Size of map is: " +map.size());

        System.out.println(map);

        if(map.containsKey("Vishal")){
            Integer a = map.get("Vishal");
            System.out.println("Value for key" + "\"Vishal\" is : " +a);
        }

    }

}

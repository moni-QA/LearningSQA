package practise2;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    HashMap<String,String> hmap = new HashMap<>();

    public void AddHashMapValue(){
        hmap.put("IE","Internet Explorer");
        hmap.put("Chrome","Chrome Browser");
        hmap.put("Firefox","Mozila Firefox");
        hmap.put("Safari","Macbook Browser");
        hmap.put("Opera","Linux Browser");

        System.out.println("Browser Name: " + hmap.get("Safari"));

        for(Map.Entry map: hmap.entrySet()){

            System.out.println(map.getKey() + " " +map.getValue());
        }

    }

    public static void main(String[]args){
        LearnHashMap objHash = new LearnHashMap();
        objHash.AddHashMapValue();

    }
}

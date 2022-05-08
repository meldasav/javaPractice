package homePractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachElementUsingMap {
    public static void main(String[] args) {
        String str = "Chicago is nice city";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character character : str.toCharArray()) {
            if (!map.containsKey(character)) map.put(character, 1);
            else {
                int count = map.get(character);
                map.put(character, count += 1);
            }
        }
        System.out.println(map);

        String str1 = "Selenium is a a tool";
        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();
        for (Character c : str1.toCharArray()) {
            if (!map1.containsKey(c)) map1.put(c, 1);
            else {
                int count = map1.get(c);
                map1.put(c, count += 1);
            }
        }
        System.out.println(map1);

        String str2 = "Selenium is automation tool";
        LinkedHashMap<Character, Integer> map3 = new LinkedHashMap<>();
        for (Character c : str2.toCharArray()) {
            if (!map3.containsKey(c)) map3.put(c, 1);
            else {
                int count = map3.get(c);
                map3.put(c, count += 1);
            }
        }
        System.out.println(map3);

        String str4="Git is a version control system";
        LinkedHashMap<Character,Integer> map4= new LinkedHashMap<>();
        for(Character c : str4.toCharArray()){
            if(!map4.containsKey(c))map4.put(c,1);
            else{
                int count=map4.get(c);
                map4.put(c,count+=1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map4.entrySet()){
            System.out.println(entry);
        }
        String str5="Git checkout -b branch name";
        LinkedHashMap<Character,Integer> map5=new LinkedHashMap<>();
        for(Character c :str5.toCharArray()){
            if(!map5.containsKey(c))map5.put(c,1);
            else{
                int count=map5.get(c);
                map5.put(c,count+=1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map5.entrySet()){
            System.out.println(entry);
        }
    }
}
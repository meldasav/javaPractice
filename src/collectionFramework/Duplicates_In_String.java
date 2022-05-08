package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Duplicates_In_String {
    public static void main(String[] args) {
        findDuplicatesWord(" hey java is java best language is java");
    }
    // hey java is java best language is java
    //  java repeat 3 times ,is 2 times

    public static void findDuplicatesWord(String inputString) {
        //split
        String[] words = inputString.split(" ");
        //create hashmap
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        // check each word in given array
        for (String word : words) {
            //if word is present
            if (wordCount.containsKey(word)) wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
            else {
                wordCount.put(word, 1);
            }
        }
        Set<String> wordsInString = wordCount.keySet();
        for (String word : wordsInString) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + ":" + wordCount.get(word) + " times repeated");
            }
        }
        String str = "chicago is nice";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else {
                int count = map.get(c);
                map.put(c, count += 1);
            }
        }
        System.out.println(map);
    }
}

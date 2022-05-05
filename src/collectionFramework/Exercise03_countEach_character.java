package collectionFramework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03_countEach_character {
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        String word = "Chicago is a nice city";
        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();
        for (Character c : word.toCharArray()) {
            if (!charCounts.containsKey(c)) charCounts.put(c, 1);
            else charCounts.put(c, charCounts.get(c) + 1);
        }
        //   System.out.println(charCounts);
        //{C=1, h=1, i=4, c=3, a=2, g=1, o=1,  =4, s=1, n=1, e=1, t=1, y=1}
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry);
        }

        String sentence = "Selenium is a testing tool.It works with many programming languages.";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : sentence.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        System.out.println(map);

        String str = "Selenium works with multiple operating system";
        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if (!map1.containsKey(c)) map1.put(c, 1);
            else map1.put(c, map1.get(c) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            System.out.println(entry);
        }

        String str2 = "Selenium is open source testing tool.";
        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<>();
        for (Character c : str2.toCharArray()) {
            if (!map2.containsKey(c)) map2.put(c, 1);
            else map2.put(c, map2.get(c) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            System.out.println(entry);
        }

        String str3 = "Selenium provides parallel testing";
        LinkedHashMap<Character, Integer> map3 = new LinkedHashMap<>();
        for (Character c : str3.toCharArray()) {
            if (!map3.containsKey(c)) map3.put(c, 1);
            else map3.put(c, map3.get(c) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map3.entrySet()) {
            System.out.println(entry);
        }
    }

    /**
     * Write a method that takes a String and counts each character it has
     * NOTE: IGNORE SPACES
     * NOTE: Count all characters as lowercase
     * NOTE: First character appears in the String should be counted first and so on.
     * TEST DATA:
     * Sweet banana
     * EXPECTED OUTPUT:
     * {s=1, w=1, e=2, t=1, b=1, a=3, n=2}
     */
    public static LinkedHashMap<Character, Integer> countCharacter(String str) {
        str = str.toLowerCase().replace(" ", "");
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        return map;
    }

    //["a", "b", "a", "b"]) → {"a": 0, "b": 0}
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }                          //value is strings length

    //"a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.substring(0, 1), (s.substring(s.length() - 1)));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }
        return map;
    }

    //["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String first = s.substring(0, 1);
            map.putIfAbsent(first, "");
            map.put(first, map.get(first) + s);
        }
        return map;
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
            int times = map.get(s);
            if (times % 2 == 0)
                result.append(s);
        }
        return result.toString();
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            String first = s.substring(0, 1);
            if (!map.containsKey(first)) {
                map.put(first, i);
            } else if (map.get(first) >= 0) {
                int lastSeen = map.get(first);
                strings[i] = strings[lastSeen];
                strings[lastSeen] = s;
                map.put(first, -1);

            }
        }
        return strings;
    }
}


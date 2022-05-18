package homePractice.CodingBadString1;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        System.out.println(word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(wordLen(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(wordCount(new String[]{"a", "b", "a", "b"}));
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(wordCount(new String[]{"a", "b", "a", "c","b"}));
    }

    //word0(["a","b","a","b]) replace value with 0  -->["a",0,"a",0]
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    //wordLen(["a","bb","a","bb"])---return the length of key instead of value-->"bb":2,"a":1
    public static Map<String, Integer> wordLen(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            map.put(s, s.length());
        }
        return map;
    }

    //pairs return first character as a key last character as a value
    public static Map<String, String> pairs(String[] str) {
        Map<String, String> map = new HashMap<>();
        for (String s : str) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return map;
    }

    public static Map<String, Integer> wordCount(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

    public static Map<String, String> firstChar(String[] string) {
        Map<String, String> map = new HashMap<>();
        for (String s : string) {
            String first = s.substring(0, 1);
            map.putIfAbsent(first, "");
            map.put(first, map.get(first) + s);
        }
        return map;
    }

    public static Map<String, Boolean> wordMultiple(String[] str) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : str) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
}

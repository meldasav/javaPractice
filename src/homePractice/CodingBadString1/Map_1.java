package homePractice.CodingBadString1;

import java.util.Map;

public class Map_1 {

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String value = map.get("a");
            map.put("b", value);
            map.put("a", "");
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.remove("c");
        }
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
            map.put("bread", "butter");
        }
        return map;
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
            map.replace("spinach", "nuts");
        }
        return map;
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
            if (map.containsKey("salad")) {
                map.put("salad", map.get("spinach"));
            }
        }
        return map;
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("a", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("b", map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (!map.containsKey("a") || !map.containsKey("b")) {
            return map;
        }

        String a = map.get("a"), b = map.get("b");
        if (a.length() == b.length()) {
            map.put("a", "");
            map.put("b", "");
        } else {
            if (a.length() > b.length()) {
                map.put("c", a);
            } else {
                map.put("c", b);
            }
        }
        return map;
    }
}


package stringMethods;

public class _07_indexOf_LastIndexOf {
    public static void main(String[] args) {
       /* Method Task:They are used to find the index or last index of some char or String values in another String
                -They are non-static methods and called with another String object
                -They are return type, and they return int as index
                -They take either String or char as arguments

        NOTE: if the given char or String does not exist, then they return -1
        NOTE: if you are looking for an index of String, and it exists, it will return the first index of found match
        EXAMPLE: sentence.indexOf("Chicago"); // 7
         */
        String nameM="pre-reading";
        int name1=nameM.indexOf("E");//8
        System.out.println(name1);//7
//        System.out.println();
//        String sentence = "I like Chicago and Miami more than any other cities";
//        System.out.println(sentence.indexOf('C'));
//        System.out.println(sentence.indexOf('c'));
//        System.out.println(sentence.lastIndexOf('c'));
//        sentence.indexOf("Chicago");
//        sentence.indexOf("");
//        sentence.indexOf("Chicago"); // 7
//        sentence.indexOf("Miami"); // 19
//
//        System.out.println("The index of empty = " + sentence.indexOf(""));
//
//        sentence.indexOf('C', 50); // -1
//        //if the given char or string does not exist they will return -1
//        String name="banana";
//        System.out.println(name.lastIndexOf('a'));

        String name="They take either String or char as arguments";
        System.out.println(name.indexOf('t'));
        System.out.println(name.substring(name.indexOf('t'),name.indexOf('e',9)));//name.indexOf('t')//name.indexOf('e',8)

    }
}

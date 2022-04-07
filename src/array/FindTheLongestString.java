package array;

public class FindTheLongestString {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};
        String longest = "";
        for (String color : colors)
            if (color.length() > longest.length()) {
                longest = color;
            }
        System.out.println(longest);

        int n1=0,n2=1,n3=0;
        String str="";
        for (int i = 0; i <= 8; i++) {
            str+=n1+"-";
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(str.substring(0,str.length()-1));
    }
}

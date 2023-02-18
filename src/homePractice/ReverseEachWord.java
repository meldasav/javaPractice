package homePractice;

public class ReverseEachWord {
    public static void main(String[] args) {

        String string = "I love java";
        reverseEach(string);

        for (String s : string.split(" ")) {
            for (int j = s.length() - 1; j >= 0; j--) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
        }
     public static void reverseEach(String str){
        StringBuilder sb=new StringBuilder();
        for(String s : str.split(" ")){
            for (int i = s.length()-1; i >=0 ; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(" ");
        }
         System.out.println(sb);
     }

    }


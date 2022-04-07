package forLoops;

public class CountCracterInString {

    public static void main(String[] args) {
//        String str = "TechGlobal School";
//
//        String name = "TechGlobal School";
//        int count = 0;
//        for (int i = 0; i < name.length(); i++)
//            if(name.charAt(i) == 'o') count++;
//        System.out.println(count);

       // String name="melda";


        String name = "TechGlobal School";
        int counter=0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='o'){
                counter++;
            }

        }

        System.out.println(counter);

        String name1 = "TechGlobal School";
        int count=0;
        for (int i = 0; i < name1.length(); i++) {
            if(name.charAt(i)=='l'){
                count++;
            }

        }
        System.out.println(count);

        }


    }


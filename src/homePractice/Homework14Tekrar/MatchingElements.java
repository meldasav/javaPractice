package homePractice.Homework14Tekrar;

public class MatchingElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,5,6};
        int[] arr2 = {2, 4,5,6,1,10};
        //1,2,5,6
        String str="";
        for(int number:arr1){
            for(int numbers:arr2){
                if(number==numbers){
                    str+=number+""+"-";

                }
            }
        }
        System.out.println(str.substring(0,str.length()-1));

        }
    }


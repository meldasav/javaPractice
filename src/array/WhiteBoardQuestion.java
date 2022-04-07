package array;

import java.util.ArrayList;
import java.util.List;

public class WhiteBoardQuestion {
    public static void main(String[] args) {
        //fibonacci
        //max and second max from an array
        //palindrome
        //fizzbazz
        //foobar

        int[] num={4,5,64,345,36,74,32};
        //2 container for max and second max /find the max/create loop/
        //find the second max(if it is not the max and bigger than the rest it is second max

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int j : num) if (max < j) max = j;
        for (int j : num) if (j != max && secondMax < j) secondMax = j;
        System.out.println(max);
        System.out.println(secondMax);
        //palindrome
        String word="civic";
        String rWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            rWord+=word.charAt(i)+" ";//convert to string with double cotation string and char.char turn it to the string
        }
        System.out.println(rWord.equals(word));
        //FizzBazz

        //4 conditions /both by 3 and 5 divided it is "fizzbazz"
        //by 3 it is "bazz"
        //by 5 it is "fizz"
        //by none print the number
        for (int i = 1; i <17 ; i++) {
            if(i%15==0) System.out.println("fizzbazz");
            else if(i%5==0) System.out.println("fizz");
            else if(i%3==0) System.out.println("bazz");
            else System.out.println(i);

        }
        ////fibonacci get 10 numbers start with 0,1 add them 0,1,1
        int n1=0,n2=1,n3=0;
        String s="";
        for (int i = 0; i <10 ; i++) {
            //store the num // get the third //change n1 and n2 for the next time
            s+=n1+"-";
            //get the third
            n3=n1+n2;
            //change n1 and n2 for the next time
            n1=n2;
            n2=n3;
        }
        System.out.println(s.substring(0,s.length()-4));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(50);
        numbers.add(55);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);
        boolean has5=false;
        for (Integer number : numbers) {
            if(number==5){
                has5 =true;
                break;
            }

        }
        System.out.println(has5);





    }
}

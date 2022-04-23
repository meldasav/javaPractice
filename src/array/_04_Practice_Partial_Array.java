package array;

public class _04_Practice_Partial_Array {
    public static void main(String[] args) {
        int[]numbers={10,-3,-7,0,0,7,22};
                for(int num:numbers){
                    System.out.println(num);
                }
                int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.println(sum);

        //PRINT FIRST SUM OF 3 /numbers[0],numbers[1],numbers[2]
        int sum1=0;
        for (int i = 0; i <=2; i++) {
            sum1+= numbers[i];

        }
        System.out.println(sum1);

        int sum2=0;
        for (int i =numbers.length-5 ; i < numbers.length; i++) {
            sum2+=numbers[i];

        }

        int product=1;
        for (int i = numbers.length-4; i <numbers.length; i++) {
            int number=numbers[i];
            if(number!=0) product*=number;

            }
        System.out.println(product);

        boolean isZero = false;
        for (int number : numbers) {
            if (number==0){
                isZero = true;
                break;
            }
        }
        System.out.println(isZero);


        }

    }



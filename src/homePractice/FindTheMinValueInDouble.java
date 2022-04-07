package homePractice;

public class FindTheMinValueInDouble {
    public static void main(String[] args) {
     double[] numbers={ 2.5,9,0.5,0.5,1.5,10.25,100};
     //find first min
     double minValue=Integer.MAX_VALUE;
        for (double number : numbers) {
            if(number<minValue)minValue=number;
        }
        System.out.println(minValue);
     //find second min
     double secondMinValue=Integer.MAX_VALUE;
        for (double number : numbers) {
            if(number!=minValue && number<secondMinValue)secondMinValue=number;
        }
        System.out.println(secondMinValue);

        int[] star={1,8,90,4,2,5,5,74,100};
        //find the greatest
        int valueOfGreatest=Integer.MIN_VALUE;
        for (int i : star) {
            if(i>valueOfGreatest)valueOfGreatest=i;
        }

        System.out.println(valueOfGreatest);
        //find second greatest
        int secondGreatest=Integer.MIN_VALUE;
        for (int i : star) {
            if(i!=valueOfGreatest && i>secondGreatest )secondGreatest=i;
        }
        System.out.println(secondGreatest);

        //FIND first min
        int firstMinValue=Integer.MAX_VALUE;
        for (int i : star) {
            if(i<firstMinValue)firstMinValue=i;
        }
        System.out.println(firstMinValue);
        //find second min
        int secondMinValue1=Integer.MAX_VALUE;
        for (int i : star) {
            if(i!=firstMinValue && i<secondMinValue1)secondMinValue1=i;
        }
        System.out.println(secondMinValue1);
        //find first min second min
        int[] numS={2,3,7,1,1,7};
        int min1=Integer.MAX_VALUE;
        int secondMin1=Integer.MAX_VALUE;
        for (int num : numS) {
            if(num<min1)min1=num;
        }
        System.out.println(min1);
        for (int num : numS) {
            if(num<secondMin1 && num!=min1)secondMin1=num;
        }
        System.out.println(secondMin1);
            }
        }





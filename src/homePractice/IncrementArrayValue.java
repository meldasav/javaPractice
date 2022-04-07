package homePractice;

public class IncrementArrayValue {
    public static void main(String[] args) {
        int[] numS={1,2,3,4,5,6,7,8,9};
        for (int num : numS) {
            System.out.print(num+" ");
        }
        //double the even value triple the odd value
        for (int i = 0; i < numS.length; i++) {
            if(numS[i]%2==0){
              numS[i]= numS[i]*2;
            }else{
                numS[i]=numS[i]*3;
            }
        }
        System.out.println();
        //print values with space separated
        for (int num : numS) {
            System.out.print(num +" ");
        }
    }
}

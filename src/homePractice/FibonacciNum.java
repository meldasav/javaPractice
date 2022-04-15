package homePractice;

public class FibonacciNum {
    public static void main(String[] args) {
        /*Create containers
        create loop
        print out series
              n1   n2   n3
        i =0  0    1    1
        i =1  1    1    2
        i=3   1    2    3
        i=4   2    3    5
         */
        int n1=0,n2=1,n3=0;
        StringBuilder str= new StringBuilder();
        for(int i=0;i<9;i++){
            str.append(n1).append(" - ");
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }
        System.out.println(str.substring(0,str.length()-3));
    }
}

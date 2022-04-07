package loops.whileLoop;

public class PrintNumbersDividedBy3 {
    public static void main(String[] args) {
        int i=1;
        while(i<=30){
            if(i%3==0) System.out.println(i);
            i++;
        }
    }
}

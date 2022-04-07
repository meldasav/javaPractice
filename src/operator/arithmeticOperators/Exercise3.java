package operator.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {
        double avr=90_000.00;              // create the variables
        double monthlyS=avr/12;              //do the equation
        double week=avr/52;              //print them out
        double biWeek=avr/26;

        System.out.println("monthly salary = "+monthlyS);
        System.out.println(week);
        System.out.println(biWeek);
    }
}

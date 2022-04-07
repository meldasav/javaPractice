package ifElseStatements.ifStatements;

import java.util.Scanner;

public class BalanceExample {
    public static void main(String[] args) {
        double balance=150;
        boolean isBalanceLessThan0=balance<0;
        boolean isBalanceEquals100=balance==0;
        boolean isBalanceBiggerOrEqualThan1000=balance>=1000;
        boolean isBalanceNotEqualTo_1=balance!=-1;
        if(isBalanceNotEqualTo_1){
            System.out.println("your balance is not equal to -1");

        }


    }
}

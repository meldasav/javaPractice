package operator.shortHandAssignmentOperators;

public class ShortHandAssignment {
    public static void main(String[] args) {
//        int age = 5;
//        age+=3;
//        System.out.println(age);
//
//        age-=2;
//        System.out.println(age);
//        age*=2;
//
//        age/=3;
//        age%=3;

        int A=8,B=3;
        A+=B;                          // create the variable
        System.out.println(A);         //use shorthand assignments

        A-=3;                          //print them out
        System.out.println(A);
        A*=B;                         //System.out.println((a+=b))
        System.out.println(A);

        A/=B;
        System.out.println(A);

        A%=B;
        System.out.println(A);

        // int a=10;
      //  a+=5;   a=a+5

        // post/pre increment and decrement
        //int a=10
        // ++a ;11
        //a;11
        //--a;10
        //a;10

        //x==4; false //3 is not equal to 4
       // x==3; true
       // x+y==z false
    }

}

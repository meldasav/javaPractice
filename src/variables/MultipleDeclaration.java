package variables;

public class MultipleDeclaration {
    public static void main(String[] args){
//        int myFirstInt;
//        int mySecondInt;
//        int myInt1,myInt2,myInt3,myInt4;

//     String myName = "Melda";
//     String myLastname ="sav";
//        System.out.println("\" Melda sav \"");
//        //String fullName3 = myName.concat(myLastName);
//        String tech = "Tech";
//        String global = "Global";
//
//       // String schoolName1 = tech + global;         //+ operator
//        String schoolName2 = tech.concat(global);   //concat method

      //  System.out.println(schoolName1 + "\n" + schoolName2);

      int i=5;
      int age=(10*i++);
      age=(10*i++);
      age=(10*++i);
      age=(10*--i);
        System.out.println(age);
    }
}

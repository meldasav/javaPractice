package homePractice;

public class Exception_Practice {
    public static void main(String[] args) {
        String name="Melda";
        try {
            System.out.println(name.charAt(10));
        }
        catch (StringIndexOutOfBoundsException s ){
            System.out.println("exception");
        }
        System.out.println("end of the program");

        String[] names={"Melda","Kerem","Tarik"};

       try{
           System.out.println(names[-5]);
    }
       catch (Exception e){
         e.printStackTrace();
       }
        System.out.println("end of the program");

       int number=45;

       try{
           System.out.println(number/0);
       }
       catch (Exception e){
           e.printStackTrace();
       }
        System.out.println("end of the program");
       }
}

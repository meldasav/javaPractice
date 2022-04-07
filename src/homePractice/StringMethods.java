package homePractice;

public class StringMethods {
    public static void main(String [] args){

        String userName="pass";

        if(userName.length()==8){
            System.out.println("valid password");

        }else{
            System.out.println("invalid password");
        }

        String password="woodenSpoon";
        int passwordLength=password.length();
        if(passwordLength>6){
            System.out.println("password good");

        }else{
            System.out.println("invalid password");
        }
        String name="Method signature is method names and arguments";
        System.out.println(name.substring(7,16));


        }
       
    }


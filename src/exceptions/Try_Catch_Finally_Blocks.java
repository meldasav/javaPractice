package exceptions;

public class Try_Catch_Finally_Blocks {
    public static void main(String[] args) {

        try{
        System.out.println(3/1);

    }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            {
                System.out.println("here is the report");
            }
        }
        System.out.println("End of the program");
        }
}

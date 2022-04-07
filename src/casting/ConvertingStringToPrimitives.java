package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {
        String num1="23";
        String num2= "12";
        //23+12=33
        int num1Int=Integer.parseInt(num1);
        int num2Int=Integer.parseInt(num2);
        System.out.println(num1Int);
        System.out.println(num2Int);
        Integer num1Integer=Integer.valueOf(num1);
        Integer numInteger=Integer.valueOf(num2);
        System.out.println(num1Integer);
        System.out.println(numInteger);



    }
}

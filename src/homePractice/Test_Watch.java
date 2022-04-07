package homePractice;

public class Test_Watch {
    public static void main(String[] args) {
        Watch watch1=new Watch();
        watch1.brand="rolex";
        watch1.color="Gold";
        Watch watch2=new Watch();
        watch2.price=999.99;
        watch2.color="black";
        System.out.println(watch1.color);
        watch1.tick();
        System.out.println( watch2.price);






    }
}

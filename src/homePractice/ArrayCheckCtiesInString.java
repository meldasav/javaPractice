package homePractice;

public class ArrayCheckCtiesInString {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "New York", "Madison", "Miami", "Washington"};
        boolean check = true;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals("Chicago")) {
                System.out.println("Cities found");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("cities not found");
        }
        String[] cities1 = {"Chicago", "New York", "Madison", "Miami", "Washington"};
        int counter = 0;
        String theseCity = " ";
        for (int i = 0; i < cities1.length; i++) {

            if (cities[i].contains("on")) {

                theseCity += " " + cities1[i];
                counter++;
            }
        }
        System.out.println(counter + " " + theseCity);

        String[] names = {"Adam", "Alex", "James", "John", "Jordan", "Lionel", "Tom"};
        boolean hasJennifer=false;
        for(String name:names){
            if(name.equals("jennifer")){
                hasJennifer=true;
                break;
            }
        }if(hasJennifer)
        System.out.println(false);

        }


    }



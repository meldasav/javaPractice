package collections.arraylist;

import java.util.ArrayList;

public class AddingAllRemovingAll {
    public static void main(String[] args) {
        ArrayList<String> germanCars=new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        System.out.println("German cars = " + germanCars);

        ArrayList<String> japaneseCars=new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");
        System.out.println("Japanese cars = " + japaneseCars);

        ArrayList<String> luxuryCars=new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");
        System.out.println("luxuryCars = " + luxuryCars);


        // adding all german cars
        ArrayList<String> inventory=new ArrayList<>();
        inventory.addAll(germanCars);
        System.out.println("inventory after adding german cars = " + inventory);
        //adding all luxury
        inventory.addAll(luxuryCars);
        System.out.println("inventory after adding luxury cars = " + inventory);
        inventory.addAll(japaneseCars);
        System.out.println("inventory after adding japanese cars = " + inventory);

        inventory.addAll(japaneseCars);
        //remove all japanese car
        inventory.removeAll(japaneseCars);
        System.out.println("inventory after removing japanese cars =" + inventory );
        //remove Tesla, Audi and Bmw

        inventory.remove("Audi");
        inventory.remove("Tesla");
        inventory.remove("Bmw");

        ArrayList<String>carsTobeRemove =new ArrayList<>();
        carsTobeRemove.add("BMW");
        carsTobeRemove.add("Tesla");
        inventory.addAll(carsTobeRemove);
        System.out.println(carsTobeRemove);

    }
}

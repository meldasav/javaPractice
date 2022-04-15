package homePractice.encapsulation;

public class BMW {

    private String model;
    private int year;
    private String color;
    private int price;
    static int totalCars;

    public BMW(String model, int year) {
        this.model = model;
        setYear(year);
        totalCars += 1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2019)
            this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0 && price <= 1000000) {
            this.price = price;
        }
    }

    public void drive() {
        System.out.println(this.model + "is driving");
    }

    public void stop() {
        System.out.println(this.model + "is stopping");
    }

    public static void wash(BMW bmw) {
        System.out.println(bmw.model + "is washed");
    }
}
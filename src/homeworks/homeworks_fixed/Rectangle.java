package homeworks.homeworks_fixed;

public class Rectangle implements Shape {
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /*
        Define instance variables of rectangle as below
        Instance variables must be encapsulated
        double width
        double height
         */
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*
        Override area and perimeter methods here
        REMEMBER:
        Area of a rectangle can be found as => width * height
        Perimeter of a rectangle can be found as => 2 * (width + height)
        */
    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }


    //Override toString() method here

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


}

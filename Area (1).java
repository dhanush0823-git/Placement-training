import java.util.Scanner;

abstract class Circle {
    protected double area;
    abstract void calc_area();
}

class Area extends Circle {
    private double r;
    private double area1; 

    public Area() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = in.nextDouble();
    }

    void calc_area() {
        area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }

    void calc_area1() {
        area1 = 2 * 3.14 * r;  
        System.out.println("Circumference of Circle = " + area1); 
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.calc_area();
        obj.calc_area1();
    }
}

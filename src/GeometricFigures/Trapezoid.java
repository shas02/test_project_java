package GeometricFigures;

public class Trapezoid extends GeometricFigure {

    private int a;
    private int b;
    private int c;
    private int d;
    private int h;
    private int perimeter;
    private double area;
    private String color = "brown";

    public Trapezoid() {
    }

    public Trapezoid(int a, int b, int c, int d, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.perimeter = a+b+c+d;
        this.area = ((a + b) * h) / 2;
    }

    public Trapezoid(int a, int b, int c, int d, int h, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.perimeter = a+b+c+d;
        this.area = ((a + b) * h) / 2;
        this.color = color;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Trapezoid was printed!");
    }

    @Override
    public void showInformation() {
        System.out.println("Geometric figure: Trapezoid\n" +
                "Sides length: " + a + ", " + b + ", " + c + ", " + d + "\n" +
                "Height: " + h + "\n" +
                "Perimeter: " + perimeter + "\n" +
                "Area: " + area + "\n" +
                "Color: " + color + "\n" +
                "_____________________________________________");

    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", h=" + h +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}

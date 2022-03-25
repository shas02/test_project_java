package GeometricFigures;

public class Triangle extends GeometricFigure {

    private int a;
    private int b;
    private int c;
    private int perimeter;
    private double area;
    private String color = "green";

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        int perimeter = a+b+c;
        int area = (int) Math.sqrt((perimeter / 2) * ((perimeter / 2) - a) * ((perimeter / 2) - b) * ((perimeter / 2) - c));
        if (area <= 0) {
            System.out.println("A triangle with such sides cannot exist!");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Triangle(int a, int b, int c, String color) {
        int perimeter = a+b+c;
        int area = (int) Math.sqrt((perimeter / 2) * ((perimeter / 2) - a) * ((perimeter / 2) - b) * ((perimeter / 2) - c));
        if (area <= 0) {
            System.out.println("A triangle with such sides cannot exist!");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = perimeter;
        this.area = area;
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Triangle was printed!");
    }

    @Override
    public void showInformation() {
        System.out.println("Geometric figure: Triangle\n" +
                "Sides length: " + a + ", " + b + ", " + c + "\n" +
                "Perimeter: " + perimeter + "\n" +
                "Area: " + area + "\n" +
                "Color: " + color + "\n" +
                "_____________________________________________");

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}

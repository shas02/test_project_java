package GeometricFigures;

public class Circle extends GeometricFigure{
    private int r;
    private double perimeter;
    private double area;
    private String color = "green";

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
        this.perimeter = 2 * Math.PI * r;
        this.area = Math.PI * r * r;
    }

    public Circle(int r, String color) {
        this.r = r;
        this.perimeter = 2 * Math.PI * r;
        this.area = Math.PI * r * r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPerimeter() {
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
        System.out.println("Circle was printed!");
    }

    @Override
    public void showInformation() {
        System.out.println("Geometric figure: Circle\n" +
                "Radius: " + r + "\n" +
                "Perimeter: " + perimeter + "\n" +
                "Area: " + area + "\n" +
                "Color: " + color +"\n" +
                "_____________________________________________");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}

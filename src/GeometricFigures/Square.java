package GeometricFigures;

public class Square extends GeometricFigure{

    private int a;
    private int perimeter;
    private int area;
    private String color = "red";

    public Square() {
    }

    public Square(int a) {
        this.a = a;
        this.perimeter = a*4;
        this.area = a*a;
    }

    public Square(int a, String color) {
        this.a = a;
        this.perimeter = a*4;
        this.area = a*a;
        this.color = color;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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
        System.out.println("Square was printed!");
    }

    @Override
    public void showInformation() {
        System.out.println("Geometric figure: Square\n" +
                "Side length: " + a + "\n" +
                "Perimeter: " + perimeter + "\n" +
                "Area: " + area + "\n" +
                "Color: " + color +"\n" +
                "_____________________________________________");

    }


    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}

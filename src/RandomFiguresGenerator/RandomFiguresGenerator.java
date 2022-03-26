package RandomFiguresGenerator;

import GeometricFigures.*;

import java.util.Arrays;

public class RandomFiguresGenerator {

    private final GeometricFigure[] randomGeometricFigures;

    public RandomFiguresGenerator(int numberOfFigures) {

        GeometricFigure[] arrayOfFigures = new GeometricFigure[numberOfFigures];

        int[] array = new int[numberOfFigures];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 4);
//            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
            arrayOfFigures[i] = new Circle((int)(Math.random() * (100 - 50)) + 50);
            }

            if (array[i] == 1) {
                arrayOfFigures[i] = new Square((int)(Math.random() * (100 - 50)) + 50);
            }

            if (array[i] == 2) {
                arrayOfFigures[i] = new Trapezoid((int)(Math.random() * (100 - 50)) + 50, (int)(Math.random() * (100 - 50)) + 50, (int)(Math.random() * (100 - 50)) + 50, (int)(Math.random() * (100 - 50)) + 50, (int)(Math.random() * (100 - 50)) + 50);
            }

            if (array[i] == 3) {
                arrayOfFigures[i] = new Triangle( (int)(Math.random() * (100 - 50)) + 50, (int)(Math.random() * (100 - 50)) + 50, (int)(Math.random() * (100 - 50)) + 50);
            }
        }

        this.randomGeometricFigures = arrayOfFigures;
    }



    public GeometricFigure[] getRandomGeometricFigures() {
        return randomGeometricFigures;
    }



    public void printAll() {
        for (GeometricFigure randomGeometricFigure : randomGeometricFigures) {
            randomGeometricFigure.print();
        }
    }

    public void showAll() {
        for (GeometricFigure randomGeometricFigure : randomGeometricFigures) {
            randomGeometricFigure.showInformation();
        }
    }

    @Override
    public String toString() {
        return "FiguresGenerator{" +
                "randomGeometricFigures=" + Arrays.toString(randomGeometricFigures) +
                '}';
    }
}

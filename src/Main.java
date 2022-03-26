import GeometricFigures.GeometricFigure;
import RandomFiguresGenerator.RandomFiguresGenerator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        RandomFiguresGenerator figures1 = new RandomFiguresGenerator(100);

        System.out.println(Arrays.toString(figures1.getRandomGeometricFigures()));

        System.out.println(figures1.getRandomGeometricFigures().length);

        figures1.printAll();

        figures1.showAll();

        System.out.println(figures1.getRandomGeometricFigures()[1].getArea());

    }
}

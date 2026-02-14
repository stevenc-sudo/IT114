package l03_datatypes;

public class DataTypeExercises {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        double z = 2.5;
        double a;

        a = x / y;
        System.out.printf("%f%n", a);

        a = x / 2.0 * y;
        System.out.printf("%f%n", a);

        a = y / z;
        System.out.printf("%f%n", a);

        a = x % 3;
        System.out.printf("%f%n", a);

    }
}

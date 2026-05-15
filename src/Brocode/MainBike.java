package Brocode;

public class MainBike {
    public static void main(String[] args) {

        Bike b1 = new Bike("Cinelli", "red", 1990, 666.00, true);
        Bike b2 = new Bike("Trek", "blue", 2026, 990.00,
                false);


        System.out.println(b1.year);
        System.out.println(b1.color);
        System.out.println(b1.year);
        System.out.println(b1.price);
        System.out.println(b1.isNew);
        System.out.println(b2.year);

        b2.start();
        b2.stop();
        b1.start();
        b1.stop();
    }
}
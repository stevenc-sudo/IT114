package Brocode;

public class Bike {

    String brand;
    String color;
    int year;
    double price;
    boolean isNew;

    Bike(String brand, String color, int year, double price, boolean isNew){
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.isNew = isNew;


    }

    void start() {
        System.out.println("steve started pedaling " + this.brand);
    }
    void stop() {
        System.out.println("you stop pedaling");
    }
}

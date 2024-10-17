package test2.Auto;

public class Auto implements Comparable<Auto> {
    private int year;
    private String brand;
    private String model;
    private String engine;

    public Auto(int year, String brand, String model, String engine){
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.engine = engine;
    }

    public void getCar(){
        System.out.println( "Car: " + brand + " " + model + " " + year + " " + engine);
    }

    @Override
    public int compareTo(Auto other){
        return this.brand.compareTo(other.brand);
    }
}

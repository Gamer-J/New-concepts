package Interfaces;

public class Test {
    public static void main(String[] args) {
        //instantiate objects
        House house = new House();
        Car car = new Car();

        //do stuff
        house.getInsured();
        house.payInsuranceFee();
        car.getInsured();
        car.payInsuranceFee();
    }
}
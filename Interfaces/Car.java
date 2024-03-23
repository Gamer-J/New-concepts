package Interfaces;

public class Car implements Insurable{
    public void getInsured(){
        System.out.println("Car is insured $100");
    }
    public void payInsuranceFee(){
        System.out.println("Insurance fee is paid");
    }
}

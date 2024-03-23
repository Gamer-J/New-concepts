package Interfaces;

public class House implements Insurable{
    public void getInsured(){
        System.out.println("House is insured $300");
    }
    public void payInsuranceFee(){
        System.out.println("Insurance fee is paid");
    }
    
}

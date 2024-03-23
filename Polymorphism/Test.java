package Polymorphism;

public class Test{
    public static void main(String[] args) {

        //Same parent class, different child classes
        Animal a;
        a = new Elephant();
        a.run();

        //act like a horse
        a = new Horse();
        a.run();
        
        System.out.println(a);
    }
}
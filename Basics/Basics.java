package Basics;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Variables
        //strings, whole numbers, decimals, and true/false
        String name = "Jomi";
        int age = 25;
        double height = 5.9;
        boolean isAdult = true;

        // Operators
        // +, -, *, /, %
        age=age+1;
        System.out.println(age);
        age=age-1;
        System.out.println(age);
        age=age*2;
        System.out.println(age);
        age=age/2;
        System.out.println(age);

        // Conditionals
        // if, else if, else
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        // Loops
        // for, while, do while
        //start at i=0 and while i is less than 5, execute the while loop statement. i++ just makes i go up
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //arrays
        //you can also have arrays of Objects
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

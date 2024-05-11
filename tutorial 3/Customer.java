public class Customer {
    String name;
    int age;
    float money;

    public Customer(String n, int a, float m) {
    name = n;
    age = a;
    money = m;
    }
    public String toString() {
    return "Customer " + name + ": a " + age + " year old with $" + money;
    }
}
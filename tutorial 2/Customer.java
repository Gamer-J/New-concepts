public class Customer {
    String name;
    int age;
    float money;
    public Customer(String initName, int initAge, float initMoney) {
        name = initName;
        age = initAge;
        money = initMoney;
    }
    public Customer() {
        name = "";
        age = 0;
        money = 0f;
    }
    public Customer(String initName) {
        name = initName;
        age = 0;
        money = 0f;
    }
    public Customer(String initName, int initAge) {
        name = initName;
        age = initAge;
        money = 0f;
    }
    public float computeFee() {
        if (age <= 3) {
            return 0.0f; // Children 3 and under have no fee
        } else if (age >= 65) {
            return 12.75f * 0.5f; // Age 65 or older receives a 50% discount
        } else if (age >= 4 && age <= 17) {
            return 8.50f; // Children and youths (age 4 to 17) pay $8.50
        } else {
            return 12.75f; // Basic adult fee of $12.75
        }
    }
    public void spend(float amount) {
        if (amount <= money) {
        money -= amount; // Deduct amount from money if customer has enough money
        System.out.println(name + " spent $" + amount);
        } else {
        System.out.println(name + " does not have enough money to spend $" + amount);
        }
    public boolean hasMoreMoneyThan(Customer c) {
        return this.money > c.money;
    }
        
            
    }


    
    }
    
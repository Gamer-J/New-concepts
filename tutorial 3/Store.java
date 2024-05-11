public class Store {
    public static final int MAX_CUSTOMERS = 500;
    String name;
    Customer[] customers;
    int customerCount;
    public Store(String n) {
    name = n;
    customers = new Customer[MAX_CUSTOMERS];
    customerCount = 0;
    }
    public void addCustomer(Customer c) {
    if (customerCount < MAX_CUSTOMERS)
    customers[customerCount++] = c;
    }
    public void listCustomers() {
    for (int i=0; i<customerCount; i++)
    System.out.println(customers[i]);

    }
    public double averageCustomerAge(){
        //create a variable to store the total customer ages(sum)
        //get sum value
        //divide the sum by numer of customers
        int sum=0;
        for (int i=0; i<customerCount; i++){
            sum+=(customers[i].age)
        }

    }
    }
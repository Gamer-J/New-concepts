    public class CustomerTestProgram {
        public static void main(String args[]) {
            Customer    c;
            Customer    d;
            
            c = new Customer("Customer");
            c.age = 27;
            c.money = 50.0f;
            d = new Customer("Customer");
            d.name = "Jomi";
            d.age = 14;
            d.money = 50000.0f;
            System.out.println(c.name);
            System.out.println(c.age);
            System.out.println(c.money);
            System.out.println(d.name);
            System.out.println(d.age);
            System.out.println(d.money);
            
        }

    }

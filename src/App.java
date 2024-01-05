public class App {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Peter",123456789);
        System.out.println(customer1.toString());
        Customer customer2 = new Customer("Peter",123456789);
        System.out.println(customer2.toString());
        Customer customer3 = new Customer();
        customer3 = customer1;
        System.out.println(customer3.toString());

        System.out.println(customer1 == customer2);
        System.out.println(customer1 == customer3);

        boolean flag = customer1.equals(customer2)? true: false;
        if (flag){
            System.out.println("customer1 is equal customer2");
        }else {
            System.out.println("customer1 is not equal customer2");
        }
    }
}

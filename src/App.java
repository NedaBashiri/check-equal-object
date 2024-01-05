public class App {

     /*نحوه مقایسه دو آبجکت در جاوا را توضیح دهید؟
    استفاده از عملگرهای برابری (== و !=): این عملگرها می توانند برای بررسی اینکه دو آبجکت برابر هستند یا خیر استفاده شوند. آیا دو متغیر به یک آدرس حافظه اشاره می‌کنند یا خیر.
    استفاده از متد equals(): متد equals() یک متد قالبی است که می تواند برای مقایسه دو آبجکت استفاده شود.این متد معمولاً در کلاسهای پایه مانند Object تعریف می شود.
    به طور پیش‌فرض، این متد از Object به ارث برده می‌شود و تنها reference equality را بررسی می‌کند. اما برای کلاس‌هایی که این متد را override کرده‌اند، می‌تواند مقایسه‌ی دلخواهی بین دو آبجکت انجام دهد.
    */

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

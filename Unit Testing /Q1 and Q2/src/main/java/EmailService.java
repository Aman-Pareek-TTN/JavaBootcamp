/**
 * @author Dhanendra Kumar
 */


public class EmailService {

    private static EmailService instance;

    private static class Email{
        public String message;
        public Order order;

        public Email(){}

        public Email(String message,Order order)
        {
            this.message=message;
            this.order=order;
        }

    }


    private EmailService() {}

    public static EmailService getInstance() {
        if(instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

    void sendEmail(Order order) throws RuntimeException {
        if (order.getItemName()!=null && order.getQuantity()!=0 && order.getPrice()!=0.0 ) {
            System.out.println("Subject: Showing order");
            System.out.println("Order details: {" +
                    " ItemName: " + order.getItemName() +
                    ", Price: " + order.getPrice() +
                    ", ItemQuantity: " + order.getQuantity() +
                    " }");

            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("Regards...");
        }

        else {
            throw new RuntimeException();
        }
    }
    boolean sendEmail(Order order, String cc) {

        if( order.getItemName()!=null && order.getQuantity()!=0 && order.getPrice()!=0.0  && cc!=null) {
            System.out.println("Carbon Copy: " + cc);
            System.out.println("Subject: Showing order");
            System.out.println("Order details: { ItemName: " +
                    order.getItemName() + ", Price: " + order.getPrice() + ", ItemQuantity: " + order.getQuantity() + " }");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Regards...");

            return true;
        }
        else {
            return false;
        }
    }
}
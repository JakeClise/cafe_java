public class CafeJava {
    public static void main(String[] args) {
        //App Variables
        //Lines of text that will appear in the app
        String generalGreeting = "Welcome to cafe java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = " ,your total is $";

        //Menu Variables (add below)
        double mochaPrice = 3.5;
        double dripPrice = 4.5;
        int lattePrice = 5;
        double cappucinoPrice = 6.25;

        //Customer name variables(add below)
        String customer1 = "Jake";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        //Order completions(add below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        //App interaction simualtion(Add code for challenges)
        System.out.println(isReadyOrder1 ? customer1 + readyMessage : customer1 + pendingMessage);
        System.out.println(isReadyOrder2 ? customer4 + readyMessage : customer4 + pendingMessage);
        System.out.println(customer2 + displayTotalMessage + lattePrice * 2);
        System.out.println(isReadyOrder3 ? customer2 + readyMessage : customer2 + pendingMessage);
        System.out.println(customer3 + displayTotalMessage + (lattePrice - mochaPrice));
    }
}
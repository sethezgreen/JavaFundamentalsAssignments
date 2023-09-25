public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 2.5;
        double lattePrice = 4;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        // Cindhuri's order output:
        System.out.println(generalGreeting + customer1 + pendingMessage);
        // Noah's order output:
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }
        // Sam's order output:
        System.out.println(displayTotalMessage + 2 * (lattePrice));
        if (isReadyOrder2) {
            System.out.println(generalGreeting + customer2 + readyMessage);
        }
        else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }
        // Jimmy's order output:
        System.out.println(displayTotalMessage + (lattePrice - dripPrice));
    }
}

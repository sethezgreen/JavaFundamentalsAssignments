import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();

        // Test cases:
        System.out.println("\n---- Streak Goal Test ----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        System.out.println("\n---- Streak Goal Custom Test ----");
        int weeks = 20;
        System.out.printf("Purchases needed by week %o: %s \n\n", weeks, appTest.getStreakGoal(weeks));

        System.out.println("\n---- Order Total Test ----");
        double[] myOrders = {5.3, 6.0, 4.25};
        double orderTotal = appTest.getOrderTotal(myOrders);
        System.out.println(orderTotal);
        
        System.out.println("\n---- Menu Items Test ----");
        ArrayList<String> menuItems = new ArrayList<String>(Arrays.asList("drip coffee", "cappucino","latte","mocha"));
        appTest.displayMenu(menuItems);

        System.out.println("\n---- Add Customers Test ----");
        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Dale");
        customers.add("Bob");
        appTest.addCustomer(customers);

        System.out.println("\n---- Print Price Chart Test ----");
        appTest.printPriceChart("Arabian Beans", 4.00, 5);

        System.out.println("\n---- Display Menu Overload Test ----");
        ArrayList<Double> prices = new ArrayList<Double>(Arrays.asList(4.00, 5.25, 3.00, 4.50));
        appTest.displayMenu(menuItems, prices);
    }
}
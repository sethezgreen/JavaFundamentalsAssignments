import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    public int getStreakGoal(int weeks) {
        int sum = 0;
        for (int i = 1; i <= weeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double orderTotal = 0;
        for (int i = 0; i < prices.length; i++) {
            orderTotal += prices[i];
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String customerName = System.console().readLine();
        customers.add(customerName);
        System.out.printf("Hello %s! \n", customerName);
        if (customers.size() == 1) {
            System.out.println("You're first in line!");
        }
        else if (customers.size() == 2) {
            System.out.println("There is 1 person in front of you.");
        }
        else {
            System.out.printf("There are %o people in front of you. \n", (customers.size() - 1));
        }
        System.out.println(customers);
    }

    // Ninja Bonuses
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 0; i <= maxQuantity; i++) {
            // gives a .50 cent discount with each quantity increase
            System.out.printf("%o -- $%.2f \n", (i+1), (price*(i+1) - (i*0.50)));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            double price = prices.get(i);
            System.out.printf("%o %s -- $%.2f \n", i, item, price);
        }
        return true;
    }
}
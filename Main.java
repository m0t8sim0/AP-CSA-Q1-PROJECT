import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter traveler's name: ");
        String travelerName = input.nextLine();
        System.out.print("Enter destination: ");
        String destination = input.nextLine();
        System.out.print("Enter number of days: ");
        int numDays = input.nextInt();
        System.out.print("Enter hotel cost per day: ");
        double hotelCostPerDay = input.nextDouble();
        System.out.print("Enter food cost per day: ");
        double foodCostPerDay = input.nextDouble();
        System.out.print("Enter transportation cost: ");
        double transportationCost = input.nextDouble();
        System.out.print("Enter activity cost: ");
        double activityCost = input.nextDouble();

        // Sub-totals
        double totalHotelCost = hotelCostPerDay * numDays;
        double totalFoodCost = foodCostPerDay * numDays;

        // Grand total using compound assignment operators
        double totalTripCost = 0.0;
        totalTripCost += totalHotelCost;
        totalTripCost += totalFoodCost;
        totalTripCost += transportationCost;
        totalTripCost += activityCost;

        // Average per day (int cast to double before dividing)
        double averageCostPerDay = totalTripCost / (double) numDays;

        // Whole-dollar estimate (rounds to nearest dollar)
        int roundedTotal = (int) (totalTripCost + 0.5);

        // Output
        System.out.println();
        System.out.println("========================================");
        System.out.println("TRAVEL SUMMARY");
        System.out.println("========================================");
        System.out.println("Traveler: " + travelerName);
        System.out.println("Destination: " + destination);
        System.out.print("Duration: ");
        System.out.print(numDays);
        System.out.println(" days");
        System.out.println("--- Breakdown of Expenses ---");
        System.out.println("Total Hotel Cost: $" + totalHotelCost);
        System.out.println("Total Food Cost: $" + totalFoodCost);
        System.out.println("Transportation: $" + transportationCost);
        System.out.println("Activities: $" + activityCost);
        System.out.println("--- Totals ---");
        System.out.println("Grand Total Trip Cost: $" + totalTripCost);
        System.out.println("Average Cost Per Day: $" + averageCostPerDay);
        System.out.println("Estimated Whole Dollar Total: $" + roundedTotal);
        System.out.println("========================================");
    }
}

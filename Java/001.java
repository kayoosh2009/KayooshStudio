import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] dishes = new String[10];
        double[] prices = new double[10];
        double sum = 0;
        double max;

        for (int i = 0; i < dishes.length; i++) {
            System.out.println("Enter name of dish:");
            dishes[i] = scan.nextLine();

            System.out.println("Enter the dish price:");
            prices[i] = scan.nextDouble();
            sum += prices[i];
            scan.nextLine(); 
        }

        double avg = sum / dishes.length;
        System.out.println("Avg price = " + avg);

        String maxName = "";
        max = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                maxName = dishes[i];
            }

            if (prices[i] > avg) {
                System.out.println("Name above avg = " + dishes[i]);
            }
        }

        System.out.println("Max price: " + max + " Name: " + maxName);
    }
} 

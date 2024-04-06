import java.util.Scanner;

public class salesaverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to count salaries in each range
        int[] salaryRanges = new int[9];

        int grossSales;

        // Input sales data until a negative number is entered
        do {
            System.out.print("Enter gross sales (or a negative number to end): $");
            grossSales = scanner.nextInt();

            // Check the sales range and update the corresponding element in the array
            if (grossSales >= 200 && grossSales <= 299) {
                salaryRanges[0]++;
            } else if (grossSales >= 300 && grossSales <= 399) {
                salaryRanges[1]++;
            } else if (grossSales >= 400 && grossSales <= 499) {
                salaryRanges[2]++;
            } else if (grossSales >= 500 && grossSales <= 599) {
                salaryRanges[3]++;
            } else if (grossSales >= 600 && grossSales <= 699) {
                salaryRanges[4]++;
            } else if (grossSales >= 700 && grossSales <= 799) {
                salaryRanges[5]++;
            } else if (grossSales >= 800 && grossSales <= 899) {
                salaryRanges[6]++;
            } else if (grossSales >= 900 && grossSales <= 999) {
                salaryRanges[7]++;
            } else if (grossSales >= 1000) {
                salaryRanges[8]++;
            }

        } while (grossSales >= 0);

        // Display the sales distribution
        for (int i = 0; i < salaryRanges.length; i++) {
            int lowerBound = i * 100 + 200;
            int upperBound = lowerBound + 99;
            System.out.printf("$%d-%d: %d%n", lowerBound, upperBound, salaryRanges[i]);
        }
    }
}

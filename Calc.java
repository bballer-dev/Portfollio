import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("enter the first interger: ");
        int num = scanner.nextInt();


        System.out.print("enter the second interger: ");
        int val = scanner.nextInt();

        System.out.println("Choose which operation you want to do:");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. muliplacation");
        System.out.println(" 4. Divison");


        System.out.println("Enter your choice 1-4:");
        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 1:
                System.out.print("The Numbers adds up to: " + (num + val));
                break;
            case 2:
                System.out.print("The Numbers Subtracts  to: " + (num - val));
                break;
            case 3:
                System.out.print("The Numbers Multiply to: " + (num * val));
                break;
            case 4:
                if (val != 0) {
                    System.out.print("The Numbers divide to: " + (double) num / val);
                }else{
                        System.out.print("This Number cannot be divided");
                        break;

                    }

                }


        }
    }



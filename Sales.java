import java.util.Scanner;
public class Sales {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);


        int month = 4;
        switch (month) {
            case 1:
                System.out.println("month is" + "januray");
                break;
            case 2:
                System.out.println("month is "+ "Feb");
                break;
            case 3:
                System.out.println("Month is"+ "March");
            case 4:

                System.out.print("enter a month");
                int num = scanner.nextInt();
                //System.out.print(num);

                        for( int g = 1;g<=12; g++) {
                            System.out.println("This month is " + g);

                        }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double comm;
        double disc;
        double extraDisc;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your sales figures: ");
        float sales = Integer.parseInt(scanner.nextLine());

        System.out.println("My sale is $" + sales);

        if (sales > 10000) {
            comm = sales * 0.3;
            System.out.println("Commision: $" + comm);
        } else if (sales >= 5001 && sales <= 9999) {
            comm = sales * 0.2;
            System.out.println("Commision: $" + comm);
        } else if (sales >= 1001 && sales <= 4999) {
            comm = sales * 0.1;
            System.out.println("Commision: $" + comm);
        } else if (sales < 1000) {
            System.out.println("N/A");
        }


        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("How many tickets?");
        int noOfTix = Integer.parseInt(scanner.nextLine());


        if (age < 5) {
            if (noOfTix >= 2) {
                disc = 7 * 0.4;
                extraDisc = disc * 0.7;
                System.out.println("Price: E" + extraDisc);
                System.out.println("Price: E" + (extraDisc * noOfTix));

            } else {
                disc = 7 * 0.4;
                System.out.println("Discount: E" + disc);
            }
        } else if (age > 60) {
            if (noOfTix >= 2) {
                disc = 7 * 0.4;
                extraDisc = disc * 0.7;
                System.out.println("Price: E" + extraDisc);
                System.out.println("Price: E" + (extraDisc * noOfTix));
            } else {
                disc = 7 * 0.45;
                System.out.println("Discount: E" + disc);
            }
        }else {
            if (noOfTix >= 2) {
                disc = 7 * 0.4;
                extraDisc = disc * 0.7;
                System.out.println("Price: E" + extraDisc);
                System.out.println("Price: E" + (extraDisc * noOfTix));
            } else {
                System.out.println("7 euros");
            }

        }

    }

}


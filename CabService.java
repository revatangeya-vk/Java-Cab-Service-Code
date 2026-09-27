import java.util.Scanner;

class Cab {
    String type;
    double fare;

    Cab(String type, double fare) {
        this.type = type;
        this.fare = fare;
    }
}

public class CabService {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] cabs = {"Mini", "Sedan", "SUV"};

        try {
            System.out.println("1. Mini - Rs.15/km");
            System.out.println("2. Sedan - Rs.20/km");
            System.out.println("3. SUV - Rs.25/km");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter distance: ");
            double distance = sc.nextDouble();

            double rate;

            switch (choice) {
                case 1:
                    rate = 15;
                    break;
                case 2:
                    rate = 20;
                    break;
                case 3:
                    rate = 25;
                    break;
                default:
                    throw new Exception("Invalid choice");
            }

            Cab cab = new Cab(cabs[choice - 1], rate);
            double total = cab.fare * distance;

            if (distance > 20) {
                total = total * 0.90;
            }

            for (int i = 1; i <= 2; i++) {
                System.out.println("Booking step " + i);
            }

            System.out.println("Cab: " + cab.type);
            System.out.println("Total Fare: Rs." + total);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
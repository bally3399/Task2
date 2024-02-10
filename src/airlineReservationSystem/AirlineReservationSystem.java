package airlineReservationSystem;

import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10];

        while (true) {
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 1) {
                assignSeat(seats, 1, 5, "First Class");
            } else if (choice == 2) {
                assignSeat(seats, 6, 10, "Economy");
            } else {
                System.out.println("Invalid choice. Please enter 1 for First Class or 2 for Economy.");
            }
        }
    }
    private static void assignSeat(boolean[] seats, int start, int end, String section) {
        for (int index = start - 1; index < end; index++) {
            if (!seats[index]) {
                seats[index] = true;
                displayBoardingPass(index + 1, section);
                return;
            }
        }

        System.out.println("The " + section + " section is full. Would you like to be placed in the other section? (1 for Yes, 2 for No)");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            assignSeat(seats, (section.equals("First Class") ? 6 : 1), (section.equals("First Class") ? 10 : 5), (section.equals("First Class") ? "Economy" : "First Class"));
        } else {
            System.out.println("Next flight leaves in 3 hours.");
        }
    }

    private static void displayBoardingPass(int seatNumber, String section) {
        System.out.println("\nBoarding Pass");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Section: " + section);
        System.out.println("Enjoy your flight!\n");
    }
}


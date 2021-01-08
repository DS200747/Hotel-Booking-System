package hotelbookingsystem;

import java.util.Scanner;

public class HotelBookingSystem {

    public static Scanner input = new Scanner(System.in);

    public static int nights;
    public static double board;
    public static int rooms;

    public static void GetRoom() {
        while (true) {
            System.out.println("\nWhat room would you like to purchase?");
            String userInput = input.nextLine();
            if (userInput.equals("single") || userInput.equals("1")) {
                System.out.println("You have selected a single room for £50 per night. Do you want to continue?");
                String userAnswer = input.nextLine();
                if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                    System.out.println("Thank you for purchasing a single room.");
                    rooms = 1;
                    break;
                } else {
                    System.out.println("Please select again.");
                }
            } else if (userInput.equals("double") || userInput.equals("2")) {
                System.out.println("You have selected a double room for £75 per night. Do you want to continue?");
                String userAnswer = input.nextLine();
                if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                    System.out.println("Thank you for purchasing a double room.");
                    rooms = 2;
                    break;
                } else {
                    System.out.println("Please select again.");
                }
            } else if (userInput.equals("family") || userInput.equals("4")) {
                System.out.println("You have selected a family room for £105 per night. Do you want to continue?");
                String userAnswer = input.nextLine();
                if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                    System.out.println("Thank you for purchasing a family room.");
                    rooms = 3;
                    break;
                } else {
                    System.out.println("Please select again.");
                }

            } else {
                System.out.println("That is not a valid answer! Please try again!");
            }

        }
    }

    public static void GetBoard() {
        while (true) {
            System.out.println("\nWhat board would you like to purchase?");
            String userInput = input.nextLine();
            if (userInput.contains("self") || userInput.equals("1")) {
                System.out.println("You have selected self-catering for free. Do you want to continue?");
                String userAnswer = input.nextLine();
                if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                    System.out.println("Thank you for using self-catering.");
                    board = 0;
                    break;
                } else {
                    System.out.println("Please select again.");
                }
            } else if (userInput.contains("half") || userInput.equals("2")) {
                System.out.println("You have selected half-board catering for £10 per night. Do you want to continue?");
                String userAnswer = input.nextLine();
                if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                    System.out.println("Thank you for purchasing half-board catering.");
                    board = 10;
                    break;
                } else {
                    System.out.println("Please select again.");
                }
            } else if (userInput.contains("full") || userInput.equals("3")) {
                System.out.println("You have selected full-board catering for £20 per night. Do you want to continue?");
                String userAnswer = input.nextLine();
                if (userAnswer.equals("yes") || userAnswer.equals("y")) {
                    System.out.println("Thank you for purchasing full-board catering.");
                    board = 20;
                    break;
                } else {
                    System.out.println("Please select again.");
                }
            } else {
                System.out.println("That is not a valid answer! Please select again.");
            }
        }
    }

    public static void GetNights() {
        System.out.println("How many nights will you be staying with us?");
        nights = input.nextInt();
    }

    public static void CalculateTotal() {
        GetRoom();
        if (rooms == 1) {
            GetNights();
            GetBoard();
            if (nights > 7) {
                double total = (50 * 7) + (board * 7);
                for (int i = nights - 7; i > 0; i--) {
                    double extraTotal = (50 + board) - (((50 + board) / 100) * 20);
                    total = total + extraTotal;
                }
                System.out.println("With the offer, your total has come to £" + total);
                double otherTotal = ((50 * nights) + (board * nights)) - total;
                System.out.println("You have saved a total of £" + otherTotal);
            } else {
                double total = (50 * nights) + (board * nights);
                System.out.println("Your total has come to £" + total);
            }
        } else if (rooms == 2) {
            GetNights();
            GetBoard();
            if (nights > 7) {
                double total = (75 * 7) + (board * 7);
                for (int i = nights - 7; i > 0; i--) {
                    double extraTotal = (75 + board) - (((75 + board) / 100) * 20);
                    total = total + extraTotal;
                }
                System.out.println("With the offer, your total has come to £" + total);
                double otherTotal = ((75 * nights) + (board * nights)) - total;
                System.out.println("You have saved a total of £" + otherTotal);
            } else {
                double total = (75 * nights) + (board * nights);
                System.out.println("Your total has come to £" + total);
            }
        } else if (rooms == 3) {
            GetNights();
            GetBoard();
            if (nights > 7) {
                double total = (105 * 7) + (board * 7);
                for (int i = nights - 7; i > 0; i--) {
                    double extraTotal = (105 + board) - (((105 + board) / 100) * 20);
                    total = total + extraTotal;
                }
                System.out.println("With the offer, your total has come to £" + total);
                double otherTotal = ((105 * nights) + (board * nights)) - total;
                System.out.println("You have saved a total of £" + otherTotal);
            } else {
                double total = (50 * nights) + (board * nights);
                System.out.println("Your total has come to £" + total);
            }
        }else{
            System.out.println("ERROR: Something went wrong.");
        }
    }

    public static void main(String[] args) {

        double singleRoom = 50.0;
        double doubleRoom = 75.0;
        double familyRoom = 105.0;

        double halfBoard = 10.0;
        double fullBoard = 20.0;

        System.out.println("Welcome to the hotel!");
        System.out.println("\nThere is an offer on where for every day you stay with us over a week, you can get 20% off each day!\n");
        System.out.println("\t- Menu -");
        System.out.println("\t- Room Types -");
        System.out.println("- Single (1) : £" + singleRoom);
        System.out.println("- Double (2) : £" + doubleRoom);
        System.out.println("- Family (4) : £" + familyRoom);
        System.out.println("\t- Board -");
        System.out.println("- Self catering : free");
        System.out.println("- Half Board : £" + halfBoard);
        System.out.println("- Full Board : £" + fullBoard);
        
        CalculateTotal();

    }
}

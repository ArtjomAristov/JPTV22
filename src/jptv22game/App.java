package jptv22game;

import java.util.Random;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("/////Game/////");
        Random random = new Random();
        boolean repeat = true;
        int attempts = 3;
        int myNumber = random.nextInt(10); // Generate the random number outside the loop

        do {
            System.out.print("Try to guess the random number from 0 - 9: ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            scanner.nextLine();

            if (myNumber == userNumber) {
                System.out.println("You won");
                attempts = 3;
            } else {
                attempts--;
                System.out.println("Wrong number. Attempts left: " + attempts);

                if (attempts == 0) {
                    repeat = false;
                }
            }
        } while (repeat);

        System.out.println("/////End Game/////");
    }
}

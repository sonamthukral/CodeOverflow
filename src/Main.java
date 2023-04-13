import java.util.Scanner;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        clearScreen();

        BinSort b = new BinSort();
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to our trash organizing game!");
        System.out.print("Would you like to see the instructions (i) or start the game (s): ");
        String ans = s.nextLine();
        String validAns = "is";

        while (!validAns.contains(ans)) {
            clearScreen();
            System.out.println("Invalid choice");
            System.out.print("Input (i) for instructions and (s) to start the game: ");
            ans = s.nextLine();
        }

        clearScreen();

        if (ans.equals("i")) {
            System.out.println(b.getInstructions());

            s.nextLine();
        }

        clearScreen();

        b.start();

        ArrayList<Item> itemsToBeSorted = b.getListOfRandItems();


        for(int i = 0; i < 40; i++) {
            Item x = itemsToBeSorted.get(i);

            System.out.println("Item #" + (i + 1) + " is " + x);
            System.out.println("What bin does this item go in: green, blue, red, grey ");
            String input = s.nextLine();

            if (b.checkInput(x, input)) {
                System.out.println("Correct");
                System.out.println("Your score is: " + b.getScore());

                Thread.sleep(3500);
            } else {
                System.out.println("That is the wrong bin. It belongs in the "+ x.getBinColor() + " bin");
                System.out.println("Your score is: " + b.getScore());

                Thread.sleep(3500);
            }

            clearScreen();
        }
        System.out.println("Congrats! Your final score is " + b.getScore());

        s.close();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}

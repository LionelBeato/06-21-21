import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WhileExample {

    public static void whileLoop() {

        int x = 0;
        while (x < 5) {
            System.out.println("In a typical while loop!");
            x++;
        }

    }

    public static void doWhileLoop() {

        int x = 0;

        /*
        unlike while loops, do-while loops evaluate at least once
         */
        do {
            System.out.println("In a typical do-while loop!");
        } while (x > 5);
    }

    public static void doWhileInput() {
        Scanner input = new Scanner(System.in);
        char character = 'c';

        do {
            System.out.println("Enter another char command or q to quit: ");
            character = input.next().charAt(0);
        } while (character != 'q' && character != 'Q');

        System.out.println("Quit command entered!");

    }

    public static void whileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line = reader.readLine();

        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }

    }
}

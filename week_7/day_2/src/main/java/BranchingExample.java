import java.util.Random;

public class BranchingExample {

    public static void breakFor() {

        Random random = new Random();
        int breakAt = random.nextInt(100);

        for (int i = 0; i < 100 ; i++) {
            if ( i == breakAt) {
                System.out.println("Random number was: " + breakAt);
                break;
            }
            System.out.println("Index: " + i);
        }

    }

    public static void breakForLabled() {

        Random random = new Random();
        int breakAt = random.nextInt(100);

        outer:
        for (int x = 1; x <= 5 ; x++) {
            System.out.println("Starting point for x: " + x);
            inner:
            for (int i = 0; i < 100; i++) {
                if ( i == breakAt) {
                    System.out.println("Random number was: " + breakAt);
                    break outer;
                } else {
                    break;
                }
            }
        }

    }

    public static void continueFor() {


        // this for loop will print only odd numbers
        // due to the continue used inside of the if statement
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println("the value of index is: " + i);
        }

    }

    public static void returnNothing(int x) {

        if (x > 3) {
            System.out.println("X is greater than 3, exiting method...");
            return;
        }

        System.out.println("This is below my return");

    }

    public static int returnXorReturnZero(int x) {

        if (x > 3) {
            System.out.println("X is greater than 3, exiting method with value...");
            return x;
        }

        return 0;
    }


}

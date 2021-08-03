import java.io.IOException;
import java.util.List;

public class Main {

    public static void elseIf(String name) {

        if (name.length() > 8) {
            System.out.println("Your name is huge!");
        } else if (name.length() > 5) {
            System.out.println("Your name is really big");
        } else if (name.length() > 2) {
            System.out.println("Your name is big");

        }
    }
    public static void checkId(boolean validId, int age, boolean buyingAlc) {

        if (validId) {
            System.out.println("Valid ID presented");
            /* below our if statement has two expressions that
               evaluate to a condition and we link these expressions
               with an && meaning both have to be true
             */
            if ((age > 21) && buyingAlc) {
                System.out.println("Customer legal to purchase alcohol");
            } else {
                System.out.println("No alcohol sale to this person");
            }
        } else {
            System.out.println("Error: invalid license");
        }

    }
    public static void ifStatements(int x, int count) {
          /* this if statement is
        the simplest decision statement we can write
         */
        if (true) {
            System.out.println("Hello world!");
        }

        /*
        We can use the if statement to evaluate expressions
        that would resolve to a boolean value
         */
        if (3 > 2) {
            System.out.println("3 is indeed bigger than 2");
        }

//        int x = 6;

        if (5 > x) {
            System.out.println("5 is bigger than x");
        }

//        int count = 44;
        if (count > 20) {

            String msg = "Count is large";

            if (count > 50) {
                msg = msg + "\ncount is VERY large";
            }

            System.out.println(msg);
        }
    }

    // below is our entry point
    // this is our main method which
    // the jvm will use to start our program
    public static void main(String[] args) throws IOException {

        int x = 3;
        int count = 20;

        if (x < 20 ) System.out.println("x is lesser than 20!");

        ifStatements(x, count);
        checkId(true, 22, true);

        elseIf("Lionel");

//        SwitchExample.printShirtSize('S');
//        SwitchExample.enhancedSwitch('b');
//        LoopExample.forLoop();
//        LoopExample.enhancedFor(List.of(2,6,89,1387,4));
//        WhileExample.whileLoop();
//        WhileExample.doWhileLoop();
        WhileExample.doWhileInput();
//        WhileExample.whileReader();
//
//        BranchingExample.breakFor();
//        BranchingExample.breakForLabled();
//        BranchingExample.continueFor();
//        BranchingExample.returnNothing(2);
//       int myInt =  BranchingExample.returnXorReturnZero(1);
//       System.out.println("here is the value returned from my method: " + myInt);
    }





}

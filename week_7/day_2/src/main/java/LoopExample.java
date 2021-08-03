import java.util.List;

public class LoopExample {

    public static void forLoop() {

        /*
        this is your traditional for loop
        it's composed of three statements
        that will result in a looping block of code
         */
        for (int i = 0; i < 10 ; i++) {
            System.out.println("the value of i is: " + i);
        }

        for (int i = 10; i > 0 ; i--) {
            System.out.println("the value of i is: " + i);
        }

//        for ( ; ; ) {
//            System.out.println("this loop runs forever");
//        }

    }

    public static void enhancedFor(List<Integer> myList) {

        for (Integer integer : myList) {
            System.out.println("Here is the value of integer: " + integer);
        }

    }
}

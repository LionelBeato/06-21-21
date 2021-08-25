import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    This is our driver class that will house our main method
    one thing to note is that you can have multiple main methods in a projects
 */
public class Main {

    /*
       in order to run a java project,
       we need a main method, otherwise
       known as an entrypoint
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] myArr = {"hello"};
        /*
            we can invoke a main method inside a main method like so
         */
        OtherMain.main(myArr);
//        Main main = new Main();
//        main.main(myArr);

//        Parent parent = new Parent() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
//        };

        /*
            This is an example of polymorphism
         */
        ArrayList<String> strings = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        Playable puppy = new Puppy();
        Playable child = new Child();

        child.doPlay();
//        child.doThing();
//        child.isThisAChildClass();

        // below we have an anonymous class
        Parent parent = new Parent() {
            @Override
            public void doThing() {
                System.out.println("this is from an anonymous class");
            }
        };

        Playable playable = new Playable() {
            @Override
            public void doPlay() {
                System.out.println("this is from an anonymous class");
            }
        };

        Playable playableLambda = () -> System.out.println("this is from an anonymous class");
        playableLambda.doPlay();

        Stream.of(1,2,3,4,5)
                .map(el -> el + 2)
//                .forEach(el -> System.out.println(el));
                .forEach(System.out::println);

    }
}

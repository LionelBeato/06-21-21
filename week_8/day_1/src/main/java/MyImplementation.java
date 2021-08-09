public class MyImplementation implements MyInterface {

    @Override
    public void sayHello() {
        System.out.println("Hello there from an interface method");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye for now!");
    }

    @Override
    public String toString() {
        return "MyImplementation{}";
    }
}

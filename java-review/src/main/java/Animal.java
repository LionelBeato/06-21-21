public class Animal extends Life {

    private String name;
    private String color;
    private Integer amountOfLegs;

    /*
        When I extend from an abstract class
        I have to explicity follow a contract between the child and parent class
        Either I implement the parents abstract methods or I declare the child abstract
     */
    @Override
    public void isAlive() {
        System.out.println("this animal is alive!");
    }

}

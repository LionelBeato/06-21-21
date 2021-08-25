public class Child extends Parent implements Playable {

    public void isThisAChildClass() {
        System.out.println("Yes, this is a child class");
    }

    @Override
    public void doThing() {
        System.out.println("this child did a thing!");
    }

    @Override
    public void doPlay() {
        System.out.println("this child is playing");
    }

}

public class Guitar extends Instrument {


    public Guitar(String name, String type) {
        super(name, type);
    }

    @Override
    public void createSound() {
        System.out.println("Strumming");
    }

    public void strum() {
        System.out.println("strumming guitar~");
    }




}

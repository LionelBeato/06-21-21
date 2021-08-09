public abstract class Instrument {

    private String name;
    private String type;

    // this method needs to be overriden
    // by subclasses
    public abstract void createSound();

    // overriding the concrete method below
    // is  completely optional
    public void doThing() {
        System.out.println("This instrument did a thing");
    }

    public Instrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

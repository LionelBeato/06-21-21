package cutable;

public class Director implements Cutable {
    @Override
    public void doCut() {
        System.out.println("This director yelled cut!");
    }
}

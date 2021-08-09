package eatable;

import eatable.Eatable;

public class Hamburger implements Eatable {


    @Override
    public void getsAte() {
        System.out.println("eatable.Hamburger has been eaten");
    }

    @Override
    public void setUpCondiments(String condiments) {
        System.out.println("Added the following to my burger: " + condiments);
    }
}

package vehicle;

import vehicle.Vehicle;

public class LightTruck extends Vehicle {

    public final boolean is4wd;

    // below is an internal or nested class
    // this class is entirely dependent on the lifecycle
    // of vehicle.LightTruck
    public class TransferCase {

        private int numGears;

        public TransferCase(int numGears) {
            this.numGears = numGears;
        }

        public TransferCase() {

        }

        public int getNumGears() {
            return numGears;
        }

        public void setNumGears(int numGears) {
            this.numGears = numGears;
        }
    }

    public TransferCase transferCase;

    public LightTruck(boolean is4wd) {
        this.is4wd = is4wd;
        if (this.is4wd) {
            this.transferCase = new TransferCase();
        }
    }





}

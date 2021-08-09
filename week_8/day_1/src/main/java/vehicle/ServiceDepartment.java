package vehicle;

public class ServiceDepartment implements Department {

    public boolean changeEngineOil(Vehicle vehicle) {

        if (vehicle != null) {
            // do some logic to change the oil
            System.out.println("Changing oil!");
            return true;
        }
        return false;

    }

}

package vehicle;

public enum VehicleClassification {
    // enums in Java can be thought of
    // as class instances
    // note how we must satisfy the constructor
    // to declare an enum
    NEW(true, true),
    USED(false, true),
    OFF_LEASE(true, true),
    SHUTTLE(true, false),
    LOANER(false, false),
    PARTS_RUNNER(true, true);

    private boolean warranty;
    private boolean freeService;

    public boolean isWarranty() {
        return warranty;
    }

    public boolean isFreeService() {
        return freeService;
    }

    VehicleClassification(boolean warranty, boolean freeService) {
        this.warranty = warranty;
        this.freeService = freeService;
    }
}

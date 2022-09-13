public enum CarTypes {
    CAR("Combustion engine", 4),
    ELECTRIC_CAR("Electric motor", 4),
    HYBRID_CAR("Combustion and electrical motor", 3),
    HOVER_CAR("Propeller", 0);

    private final String motor;
    private final int numberOfWheels;

    CarTypes( String motor, int numberOfWheels) {
        this.motor = motor;
        this.numberOfWheels = numberOfWheels;
    }



    public String getMotor(){
        return this.motor;
    }


}

public class Tanker extends CargoShip {
    private String cargoType;

    public Tanker(String name, int capacity, String cargoType) {
        super(name, capacity);
        this.cargoType = cargoType;
    }
    

    /**
     * @return String return the cargoType
     */
    public String getCargoType() {
        return cargoType;
    }

    @Override
    public String toString()
    {
        return super.toString()+" Cargo type: "+cargoType;
    }

}

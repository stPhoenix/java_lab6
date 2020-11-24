public class CargoShip implements Ship {
    private String name;
    private int capacity;
    private int cargo;

    public CargoShip(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
        this.cargo = 0;
    }

    @Override
    public String toString()
    {
        return getClass().getName()+" Name: "+name+" Capacity: "+capacity+" Load: "+cargo;
    }

    public void loadCargo(int amount)
    {
        if (cargo+amount > capacity)
        {
            System.out.println("Ship is overloaded");
        }
        else
        {
            this.cargo += amount;
        }
    }

    public void unloadCargo(int amount)
    {
        this.cargo -= amount;
        if (this.cargo < 0)
        {
            this.cargo = 0;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");

    }

    @Override
    public void dropAnchor() {
        System.out.println("Anchor dropped");

    }

    @Override
    public void takeAnchor() {
        System.out.println("Took anchor");

    }
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return int return the cargo
     */
    public int getCargo() {
        return cargo;
    }



}

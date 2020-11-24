public class App {
    public static void main(String[] args) throws Exception {
        CargoShip cShip = new CargoShip("Meverik", 10000);
        Tanker tanker = new Tanker("Ilfa", 4000000, "fluel");

        cShip.loadCargo(400);
        tanker.loadCargo(3000);

        System.out.println(cShip.toString());
        System.out.print(tanker.toString());
    }
}

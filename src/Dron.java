public class Dron extends Vehiculo{
    public Dron(String id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Vuela");
    }
}

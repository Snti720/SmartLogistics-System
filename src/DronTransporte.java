public class DronTransporte extends Vehiculo implements IConectable{
    public DronTransporte(String id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Vuela");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("Dron sincronizando GPS");
    }
}

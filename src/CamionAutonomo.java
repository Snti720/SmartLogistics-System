public class CamionAutonomo extends Vehiculo{
    public CamionAutonomo(String id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Se maneja por carretera");
    }
}

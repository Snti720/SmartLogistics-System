import java.util.ArrayList;
public class CentroControl {
    private ArrayList<Vehiculo> listaVehiculos;
    public CentroControl(){
        listaVehiculos = new ArrayList<>();
    }
    public void registrarUnidad(Vehiculo v){
        listaVehiculos.add(v);
    }
    public void monitorearFlota(){
        for(Vehiculo v: listaVehiculos){
            v.patronMovimiento();
        }
    }
}

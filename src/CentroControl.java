import java.util.ArrayList;
public class CentroControl {
    private ArrayList<Vehiculo> listaVehiculos;
    public CentroControl(){
        listaVehiculos = new ArrayList<>();
    }
    /**
     * Registra una nueva unidad de transporte en el centro de control.
     * Representa una relación de agregación, ya que las unidades externas
     * se añaden a la flota existente.
     * * @param v El vehículo a registrar (puede ser Dron o Camión).
     */
    public void registrarUnidad(Vehiculo v){
        listaVehiculos.add(v);
    }
    /**
     * Recorre la flota y ejecuta el polimorfismo en cada unidad.
     * No importa el tipo de vehículo, todos responden a patronMovimiento().
     */
    public void monitorearFlota(){
        for(Vehiculo v: listaVehiculos){
            v.patronMovimiento();
        }
    }
}

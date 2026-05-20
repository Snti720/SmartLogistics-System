/**
 * Subclase concreta que representa un vehículo terrestre dentro del ecosistema.
 */
public class CamionAutonomo extends Vehiculo{
    public CamionAutonomo(String id){
        super(id);
    }

    /**
     * Implementa el movimiento específico de un camión,
     * simulando un desplazamiento por carretera.
     */
    @Override
    public void patronMovimiento() {
        System.out.println("Se maneja por carretera");
    }

    @Override
    public String toString() {
        return "Vehiculo [ID=" + getId() + ", Conectable=" + isConectable() + "]";
    }
}

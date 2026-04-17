/**
 * Subclase concreta que representa un vehículo aéreo dentro del ecosistema.
 */
public class DronTransporte extends Vehiculo implements IConectable{
    public DronTransporte(String id){
        super(id);
    }

    /**
     * Implementa el movimiento específico de un dron,
     * simulando un desplazamiento aéreo.
     */
    @Override
    public void patronMovimiento() {
        System.out.println("Vuela");
    }

    /**
     * Establece conexión con el sistema de rastreo satelital aéreo.
     * Simula la sincronización de coordenadas para la navegación
     * segura del dron.
     */
    @Override
    public void sincronizarGPS() {
        System.out.println("Dron " + getId() + ": Sincronizando GPS... Estableciendo coordenadas de vuelo y altitud de seguridad.");
    }
}

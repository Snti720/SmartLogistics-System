/**
 * Subclase concreta que representa un vehículo terrestre dentro del ecosistema.
 */
public class CamionAutonomo extends Vehiculo implements IConectable{
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

    /**
     * Conecta el sistema de navegación del camión con la red de rutas terrestres.
     * Simula la actualización de datos de tráfico y posicionamiento en carretera.
     */
    @Override
    public void sincronizarGPS() {
        System.out.println("Camión " + getId() + ": Sincronizando GPS... Calculando mejores rutas.");
    }
}

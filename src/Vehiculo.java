/**
 * Representa la unidad base del sistema logístico.
 * Define la identidad y obliga a las subclases a implementar un movimiento.
 */
public abstract class Vehiculo {
    private String id;

    protected Vehiculo(String id){
        this.id = id;
    }

    /**
     * Obtiene el identificador único del vehículo.
     * Implementado en la clase abstracta para fomentar la reutilización de código.
     * * @return El ID del vehículo.
     */
    public String getId(){
        return id;
    }

    protected abstract void patronMovimiento();

}

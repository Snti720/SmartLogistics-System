public abstract class Vehiculo {
    //se necesita logica para poder crear herencia en Dron y Camion
    private String id;

    protected Vehiculo(String id){
        this.id = id;
    }

    protected String getId(){
        return id;
    }

    protected abstract void patronMovimiento();

}

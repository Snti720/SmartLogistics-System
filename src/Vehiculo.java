public abstract class Vehiculo {
    //se necesita logica para poder crear herencia en Dron y Camion
    private String id;

    public Vehiculo(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public abstract void patronMovimiento();

}

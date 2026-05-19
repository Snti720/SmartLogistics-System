public abstract class Vehiculo {
    //se necesita logica para poder crear herencia en Dron y Camion
    private String id;
    private String tipo;
    protected boolean conectable;

    public Vehiculo(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setConectable(boolean conectable) {
        this.conectable = conectable;
    }
    public abstract void patronMovimiento();

}

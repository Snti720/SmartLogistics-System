public abstract class Vehiculo {
    private String id;

    protected Vehiculo(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    protected abstract void patronMovimiento();

}

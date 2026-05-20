public abstract class Vehiculo {
    private String id;
    private String tipo;
    protected boolean conectable;

    public Vehiculo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setConectable(boolean conectable) {
        this.conectable = conectable;
    }

    public boolean isConectable() {
        return conectable;
    }

    public abstract void patronMovimiento();
}
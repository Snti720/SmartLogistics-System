public class Main {
    public static void main(String[] args) {
        VehiculosCRUD crud = new VehiculosCRUD();
        Vehiculo dron1 = new DronTransporte("D01");
        dron1.setTipo("Dron");
        dron1.setConectable(true);
        Vehiculo camion1 = new CamionAutonomo("C01");
        camion1.setTipo("Camion");
        camion1.setConectable(false);
        Vehiculo dron2 = new DronTransporte("D02");
        dron2.setTipo("Dron");
        dron2.setConectable(true);
        crud.crearVehiculo(dron1);
        crud.crearVehiculo(camion1);
        crud.crearVehiculo(dron2);
        crud.listarVehiculos();
        System.out.println("Vehículos conectables:");
        crud.filtrarConectables();
        System.out.println("Lista de IDs registrados: " + crud.obtenerListaIDs());
        System.out.println("Cantidad total de vehículos: " + crud.contarVehiculos());
        System.out.println("Buscar solo drones: " + crud.buscarPorTipo("Dron").size() + " encontrados.");
        crud.ordenarPorTipo();
        crud.listarVehiculos();
        crud.modificarVehiculo("C01", "Camion Avanzado", true);
        crud.eliminarVehiculo("D02");
        crud.listarVehiculos();
    }
}

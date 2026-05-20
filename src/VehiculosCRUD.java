import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Gestión de datos de vehiculos - Practica 2
public class VehiculosCRUD {
    private final List<Vehiculo> vehiculos;

    public VehiculosCRUD() {
        this.vehiculos = new ArrayList<>();
    }

    // Crear Vehiculo
    public void crearVehiculo(Vehiculo v) {
        vehiculos.add(v);
        System.out.println("Vehiculo agregado correctamente");
    }

    // Listar Vehiculos
    public void listarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados");
            return;
        }
        vehiculos.forEach(System.out::println);
    }

    // Buscar Vehículo por ID
    public Vehiculo buscarVehiculo(String id) {
        return vehiculos.stream().filter(v -> v.getId().equals(id)).findFirst().orElse(null);
    }

    // Modificar Vehículo
    public void modificarVehiculo(String id, String nuevoTipo, boolean conectable) {
        Vehiculo v = buscarVehiculo(id);
        if (v != null) {
            v.setTipo(nuevoTipo);
            v.setConectable(conectable);
            System.out.println("Vehiculo modificado correctamente");
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }

    // Eliminar Vehículo
    public void eliminarVehiculo(String id) {
        Vehiculo v = buscarVehiculo(id);
        if (v != null) {
            vehiculos.remove(v);
            System.out.println("Vehiculo eliminado correctamente");
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }


    // Filtrar vehículos conectables
    public void filtrarConectables() {
        List<Vehiculo> conectables = vehiculos.stream().filter(Vehiculo::isConectable).collect(Collectors.toList());
        if (conectables.isEmpty()) {
            System.out.println("No hay vehículos conectables disponibles.");
        } else {
            conectables.forEach(System.out::println);
        }
    }

    // Obtener lista de IDs
    public List<String> obtenerListaIDs() {
        return vehiculos.stream().map(Vehiculo::getId).collect(Collectors.toList());
    }

    // Contar vehículos
    public long contarVehiculos() {
        return vehiculos.stream().count();
    }

    // Buscar vehículos por tipo
    public List<Vehiculo> buscarPorTipo(String tipo) {
        return vehiculos.stream().filter(v -> v.getTipo() != null && v.getTipo().equalsIgnoreCase(tipo)).collect(Collectors.toList());
    }

    // Ordenar por ID
    public void ordenarPorId() {
        vehiculos.sort(Comparator.comparing(Vehiculo::getId));
        System.out.println("Coleccion ordenada por ID");
    }

    // Ordenar por tipo
    public void ordenarPorTipo() {
        vehiculos.sort(Comparator.comparing(Vehiculo::getTipo, Comparator.nullsFirst(String::compareTo)));
        System.out.println("Coleccion ordenada por Tipo");
    }

    // Getter para que CentroControl o el Main interactuen con la lista base
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
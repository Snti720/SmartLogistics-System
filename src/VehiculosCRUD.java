import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//gestion de datos de vehiculos
public class VehiculosCRUD{
    private List<Vehiculo> vehiculos;
    public VehiculosCRUD(){
        vehiculos = new ArrayList<>();
    }

    // creacion de vehiculo
    public void crearVehiculo(Vehiculo v){
        vehiculos.add(v);
        System.out.println("Vehiculo agregado correctamente!!.");
    }

    // lista de vehiculos
    public void listarVehiculos(){
        if (vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados.");
            return;
        }
        vehiculos.forEach(System.out::println); // expresion lambda q se solicito en ej2
    }

    // busqueda
    public Vehiculo buscarVehiculo(String id){
        Vehiculo encontrado = null;
        for (Vehiculo v : vehiculos){
            if (v.getId().equals(id)){
                encontrado = v;
            }
        }
        return encontrado;
    }

    // editar vehiculo
    public void modificarVehiculo(String id, String nuevoTipo, boolean conectable){
        Vehiculo v = buscarVehiculo(id);
        if (v != null){
            v.setTipo(nuevoTipo);
            v.setConectable(conectable);
            System.out.println("Vehiculo modificado correctamente!! .");
        } else{
            System.out.println("Vehiculo no encontrado.");
        }
    }

    // eliminar vehiculo
    public void eliminarVehiculo(String id){
        Vehiculo v = buscarVehiculo(id);
        if (v != null) {
            vehiculos.remove(v);
            System.out.println("Vehiculo eliminado correctamente!.");
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
    }
}

# Sistema de Ecosistema Logístico Inteligente - Versión 2

Este proyecto ha sido desarrollado y ampliado de forma colaborativa como parte de la **Práctica de Integración - Versión 2 de Programación II** en la carrera de **Ingeniería Informática** de la **Facultad de Ingeniería de la Universidad Nacional de Itapúa (FIUNI)**.

## Descripción del Proyecto
El sistema modela un entorno logístico automatizado y, en esta segunda etapa, se enfoca en la **gestión masiva y manipulación eficiente de datos de la flota de vehículos** (Drones y Camiones Autónomos). El núcleo del desarrollo se centra en la arquitectura de un controlador persistente en memoria (CRUD) y en la aplicación de características avanzadas de programación funcional en Java.

## Conceptos de Programación Avanzada Aplicados
Para cumplir con las nuevas competencias evaluadas por la cátedra (Estructuras modernas de procesamiento), el diseño de software incorpora:

* **Operaciones CRUD Completas:** Implementación de un patrón de persistencia en memoria estructurado en la clase `VehiculosCRUD` para el registro (**C**reate), listado (**R**ead), actualización (**U**pdate) y eliminación (**D**elete) de unidades logísticas.
* **Expresiones Lambda:** Uso de sintaxis moderna y referencias a métodos (`System.out::println`) optimizando el recorrido de colecciones mediante estructuras como `.forEach()` sin recurrir a iteradores tradicionales.
* **API Streams (Java 8+):** Implementación de flujos de datos funcionales para resolver operaciones complejas de manera declarativa:
    * **Filtrado dinámico:** Procesamiento de unidades filtradas por estado de red mediante `.filter(Vehiculo::isConectable)`.
    * **Transformación y Mapeo:** Extracción selectiva de identificadores (`List<String>`) mapeando los atributos de la colección base.
    * **Reducción y Conteo:** Cálculo y cuantificación exacta del tamaño de la flota a través de operaciones terminales `.count()`.
* **Criterios de Ordenamiento Avanzado:** Uso de la interfaz `java.util.Comparator` combinada con el API de Streams para reordenar la colección dinámicamente bajo múltiples condiciones, tales como el identificador único o el tipo de vehículo asignado.
* **Refactorización de Encapsulamiento:** Ajustes en los niveles de visibilidad (`protected` y `private`) y adición de métodos accesores (`getTipo()`) en la jerarquía de herencia para garantizar una comunicación limpia entre capas de software.

## Estructura de Clases Actualizada
* `Vehiculo.java`: Clase abstracta base que encapsula las propiedades compartidas (ID, Tipo, Estado de Conexión) y define el contrato polimórfico `patronMovimiento()`.
* `IConectable.java`: Interfaz que define las capacidades de geolocalización.
* `DronTransporte.java` y `CamionAutonomo.java`: Clases concretas que modelan los comportamientos físicos específicos de la flota.
* `VehiculosCRUD.java`: Nueva entidad controladora y gestora del ecosistema, encargada de centralizar la base de datos en memoria, ordenamientos y flujos Streams.
* `Main.java`: Módulo de integración desarrollado para verificar secuencialmente el cumplimiento técnico de cada uno de los ejercicios de la guía de trabajos.

## Autores (Desarrollo en Dupla)
* **Santiago Arce** - [Snti720](https://github.com/Snti720)
* **Yesica Villamil** - [Yezz26](https://github.com/Yezz26)

## Docentes
* **Ma. Nieves Florentín**
* **Arnaldo Ocampo**

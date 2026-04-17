# Sistema de Ecosistema Logístico Inteligente 🚚🛸

Este proyecto ha sido desarrollado como parte de la **Práctica de Integración de Programación II** en la carrera de **Ingeniería Informática** de la **Facultad de Ingeniería de la Universidad Nacional de Itapúa (FIUNI)**.

## 📋 Descripción del Proyecto
El sistema modela un entorno logístico automatizado donde un **Centro de Control** gestiona una flota mixta de vehículos (Drones y Camiones Autónomos). El enfoque principal del proyecto es la aplicación rigurosa de los principios de la Programación Orientada a Objetos (POO) para crear un modelo de software escalable, organizado y basado en el principio de abstracción.

## 🛠️ Conceptos de Programación Aplicados
Para cumplir con los objetivos académicos establecidos por la cátedra, el diseño implementa:

* **Abstracción:** Uso de la clase abstracta `Vehiculo` para definir la identidad esencial de la flota, ocultando la complejidad del movimiento específico.
* **Interfaces:** Implementación de `IConectable` como un contrato tecnológico que garantiza que cualquier unidad pueda sincronizarse con el sistema GPS.
* **Polimorfismo:** Implementación de métodos que permiten a cada vehículo responder de manera única a `patronMovimiento()` y `sincronizarGPS()` según su naturaleza (aérea o terrestre).
* **Relaciones de Objetos:** * **Composición:** El `CentroControl` gestiona la estructura interna de la flota mediante un `ArrayList`.
    * **Agregación:** El sistema permite el registro dinámico de unidades externas al ecosistema.
* **Herencia:** Reutilización de lógica y atributos comunes en las subclases `DronTransporte` y `CamionAutonomo`.

## 🏗️ Estructura de Clases
* `Vehiculo.java`: Clase abstracta base que actúa como plantilla para todos los transportes.
* `IConectable.java`: Interfaz que define las capacidades de conectividad del sistema.
* `DronTransporte.java`: Clase concreta que implementa la lógica de navegación tridimensional.
* `CamionAutonomo.java`: Clase concreta que implementa la lógica de rutas viales terrestres.
* `CentroControl.java`: Clase gestora encargada del monitoreo y la administración de la flota.

## 👨‍💻 Autores
* **Santiago Arce** - [Snti720](https://github.com/Snti720)
* **Yesica Villamil** - [Yezz26](https://github.com/Yezz26)

## 🎓 Docentes
* **Ma. Nieves Florentín**
* **Arnaldo Ocampo**

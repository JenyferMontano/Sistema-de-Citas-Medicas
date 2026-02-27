
# Sistema de Citas Médicas

Este repositorio contiene una aplicación de escritorio **Java Swing** para gestionar las citas de la Clínica de la Universidad Nacional. El software implementa un modelo MVC que permite crear, leer, actualizar y borrar datos de **pacientes**, **médicos**, **usuarios** y **citas** almacenados en archivos XML.

### Funcionalidades principales

- Registro y búsqueda de pacientes, médicos y usuarios.
- Gestión de citas médicas (alta, modificación, eliminación).
- Autenticación básica de usuarios.
- Persistencia en XML.
- Interfaz gráfica construida con formularios Swing generados por NetBeans.
- Validaciones sencillas y mensajes de respuesta en controladores.
- Pruebas unitarias con JUnit para componentes DAO y controllers.

###  Estructura del proyecto

Se organiza en paquetes `controller`, `model`, `view` y `utilities`. Los DAOs heredan de `XmlAdapter` y usan DOM para manipular documentos.

###  Tecnologías y herramientas

- Java SE 8+ .
- Swing / NetBeans GUI Builder para la interfaz.
- Manipulación de XML con DOM .
- Maven para compilación y gestión de dependencias.
- JUnit 5 para tests.

### Competencias obtenidas (para CV)

- Desarrollo de aplicaciones desktop en Java con arquitectura MVC.
- Diseño e implementación de capas de acceso a datos usando archivos XML.
- Uso de patrones de diseño simples (DAO, Adapter, Controller).
- Creación de interfaces gráficas ricas con Java Swing y NetBeans.
- Escritura de pruebas unitarias y ejecución con Maven Surefire.
- Manejo de control de versiones y proyectos con Maven.
- Gestión de fechas (`java.time.LocalDate`) y validaciones básicas.
- Interpretación y extensión de código legado generado por IDE.

###  Cómo ejecutar

1. Clonar el repositorio.
2. Abrir en NetBeans o ejecutar con Maven:
   ```bash
   mvn compile exec:java -Dexec.mainClass="com.una.proyectoprogramadoiiv2.Main"
   ```
3. Los archivos XML se crean/actualizan en la raíz del proyecto.

> NOTA: Es un proyecto académico desarrollado para el curso de Programación II (I Ciclo 2024). No está pensado para producción.

###  Notas adicionales

- El código fuente incluye `test` con ejemplos de uso de los controladores.
- Se recomienda revisar `utilities` para adaptadores de XML y normalización de documentos.
- Cualquier mejora en validaciones, navegación o seguridad puede ser un buen ejercicio de extensión.


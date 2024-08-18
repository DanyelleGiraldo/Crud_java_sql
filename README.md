# Sistema de Gestión de Estudiantes en Java con MySQL

## Descripción

Este proyecto tiene como objetivo desarrollar un sistema robusto para la gestión integral de estudiantes. Utiliza JDBC en Java y una base de datos MySQL para permitir la creación, actualización, eliminación y visualización de registros de estudiantes. La solución está diseñada para garantizar la integridad de los datos y proporcionar una interfaz intuitiva para los usuarios, facilitando la administración de información estudiantil de manera efectiva y segura.

## Funcionalidades

- **Inserción de Estudiantes**: Permite añadir nuevos registros de estudiantes a la base de datos a través de campos de texto en una interfaz gráfica.
- **Visualización de Estudiantes**: Muestra una tabla con todos los estudiantes registrados en la base de datos, con la opción de ordenar y filtrar los datos.
- **Selección de Estudiantes**: Permite seleccionar un estudiante de la tabla para ver y editar sus detalles.
- **Modificación de Estudiantes**: Permite actualizar los detalles de un estudiante existente en la base de datos.
- **Eliminación de Estudiantes**: Permite eliminar un estudiante de la base de datos a través de su identificador.

## Clases Principales

### `CAlumnos`

La clase `CAlumnos` gestiona las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para los estudiantes. A continuación se detallan los métodos principales:

- **`InsertarAlumno(JTextField paramNombres, JTextField paramApellidos)`**: Inserta un nuevo estudiante en la base de datos utilizando los valores proporcionados en los campos de texto.
- **`MostrarAlumnos(JTable paramTablaTotalAlumnos)`**: Muestra todos los estudiantes en una tabla, cargando los datos desde la base de datos.
- **`SeleccionarAlumno(JTable paramTablaAlumnos, JTextField paramId, JTextField paramNombres, JTextField paramApellidos)`**: Selecciona un estudiante de la tabla y muestra sus datos en los campos de texto para edición.
- **`ModificarAlumnos(JTextField paramCodigo, JTextField paramNombres, JTextField paramApellidos)`**: Actualiza los detalles de un estudiante existente en la base de datos.
- **`EliminarAlumnos(JTextField paramCodigo)`**: Elimina un estudiante de la base de datos utilizando su identificador.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- MySQL Server.
- JDBC Driver para MySQL (`mysql-connector-java`).


## Uso
- Abre la aplicación y utiliza la interfaz gráfica para gestionar estudiantes.
- Utiliza los formularios para insertar, modificar, o eliminar registros de estudiantes.
- Visualiza todos los estudiantes en la tabla proporcionada y usa las funcionalidades de selección y filtrado para administrar la información.

![CRUDJAVA](https://github.com/user-attachments/assets/a0bcf0f9-4f7a-4e86-b042-1ea97823ee2a)

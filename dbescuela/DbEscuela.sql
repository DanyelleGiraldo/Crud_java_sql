CREATE DATABASE IF NOT EXISTS gestion_estudiantes;

USE gestion_estudiantes;

CREATE TABLE IF NOT EXISTS Alumnos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL
);

INSERT INTO Alumnos (nombres, apellidos) VALUES ('Carlos', 'Pérez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('María', 'González');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Juan', 'Rodríguez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Ana', 'Martínez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Luis', 'López');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Sofía', 'Hernández');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Jorge', 'Díaz');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Valeria', 'Fernández');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('David', 'Sánchez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Camila', 'Ramírez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Miguel', 'Torres');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Isabel', 'Vargas');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Ricardo', 'Castillo');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Lucía', 'Morales');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Andrés', 'Ortiz');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Gabriela', 'Ramos');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Francisco', 'Reyes');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Daniela', 'Gutiérrez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Pedro', 'Jiménez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Carolina', 'Mendoza');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Santiago', 'Ruiz');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Laura', 'Guerrero');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Álvaro', 'Vargas');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Elena', 'Navarro');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Tomás', 'Suárez');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Patricia', 'Paredes');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Fernando', 'Rojas');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Alejandra', 'Cruz');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Enrique', 'Molina');
INSERT INTO Alumnos (nombres, apellidos) VALUES ('Raquel', 'Silva');

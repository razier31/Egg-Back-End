DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );

/*
2.1. ¿Cuántas columnas posee la tabla “creador”?

 2

2.2. ¿Cuántas columnas numéricas posee la tabla “personaje”?

6

2.3. ¿Cuántas columnas de la tabla “personaje” pueden ser nulas?
a. Todas las columnas

 1

2.4. ¿Qué significa la primera línea del script?

Elimina la base de datos en caso de ya estar creada.

*/

DROP DATABASE superheroes;
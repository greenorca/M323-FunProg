/*
    Script zur Erstellung der Datenbank sowie Tabelle
    Author: Patrick Meier
    DB-Typ: MySQL
*/

CREATE DATABASE `m323_sq3a`;

USE `m323_sq3a`;

CREATE TABLE `spiel` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titel` varchar(50) DEFAULT NULL,
  `genre` varchar(50) DEFAULT NULL,
  `preis` float(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
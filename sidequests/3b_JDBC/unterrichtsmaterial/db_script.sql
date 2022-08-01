/*
    Script zur Erstellung der Datenbank sowie Tabelle
    Author: Patrick Meier
    DB-Typ: MySQL
*/

CREATE DATABASE `m323_sq3b`;

USE `m323_sq3b`;

CREATE TABLE `game` (
  id int NOT NULL AUTO_INCREMENT,
  title varchar(50),
  genre varchar(50),
  price float,
  releaseDate date,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `game`
  (id, title, genre, price, releaseDate)
VALUES
  (1,'Frostpunk','Aufbau & Strategie',25,'2018-04-24'),
  (2,'Mortal Kombat','Beat-em-up',10,'1992-10-08'),
  (3,'Need for Speed: Underground','Rennspiel',25,'2003-11-21'),
  (6,'World of Warcraft','MMO',50,'2005-02-11'),
  (7,'Battlefield 1942','Shooter',15,'2002-09-20'),
  (8,'XCOM: Enemy Unknown','Taktik-Shooter',29,'2012-10-12'),
  (9,'Age of Empires 4','Aufbau & Strategie',74,'2021-10-28'),
  (10,'Elden Ring','Rollenspiel',69.9,'2022-02-25');
# SQ3A - JDBC

## Zeit

* 60 Minuten

## Lernart bzw. Sozialform

* Einzelarbeit

## HANOKs

\-

## Einführung LP in das Basiswissen

* Was ist JDBC?
* Wie verwendet man JDBC?
* SQLite als mini DBMS

### Weitere Literatur zum Thema

1. BMU-Docker für Einsteiger:

## Ausgangslage

Du bringst bereits Erfahrungen im Umgang mit Datenbanken und grundlegende JAVA-Kenntnisse mit. Dies wollen wir uns nun zu Nutze machen um Datensätze aus einer Applikation permanentn abzuspeichern und weiter zu verarbeiten.  
Die EDUGames AG möchte die grundlegenden Information von Spielen applikatorisch in einer Datenbank ablegen und daraus auch auslesen können. Hierfür legen wir eine kleine Datenbank samt einer Tabelle Game an und greifen darauf aus einer Konsolenapplikation zu.  
  
ERD der Datenbank m232_sq3a:  
![TODO INSERT ERD]()

## Ziel

* Du sollst wissen mit welchen Mitteln du aus einem Programm auf eine Datenbank zugreifen kannst
* Du kannst Datensätze aus einer Datenbank herauslesen und in JAVA-Objekte umwandeln
* Du kannst JAVA-Objekte permanent in einer Datenbank ablegen

## Auftrag

1. Folge dem Link [Anleitung SQLite installieren](TODO_ADD_LINK) und installiere das SQLite Datenbanksystem
1. Erstelle eine Datenbank **m323_sq3a** und gemäss obiger Anleitung ob die Verbindung darauf klappt
1. Importiere das angehängte Projekt in deine IDE, das grundlegende Setup ist bereits gemacht
1. Konfiguriere das Projekt so um, dass du damit einen Verbindugnstest zur Datenbank durchführen kannst
    * Frage die Lehrperson, falls es Probleme gibt
1. Erstelle in der Datenbank eine Tabelle **spiel** mit den in der Ausgangslage beschriebenen Spalten
1. Implementiere im Projekt eine Modell-Klasse **Spiel** mit den Feldern, welche in der Datenbank vorkommen
1. Implementiere im Programm den Code um alle Spiele aus der Datenbank auszulesen und gib diese in der Konsole aus
1. Implementiere im Programm den Code um der Datenbank 3 weitere Spiele hinzuzufügen
1. Teste ob die Spiele in der Datenbank angekommen sind entweder mit der Ausgabe in der Konsole (Read der Datenbank) oder im entsprechenden DB-Verwaltungstool

## Wissens-Check

* Welche Abfolge Durchläuft der Prozess um Daten zu laden bei der Verwendung von JDBC? <!-- 2 -->
* Weshalb sollten Datenbankverbindung nach beendigter Arbeit stets geschlossen werden?

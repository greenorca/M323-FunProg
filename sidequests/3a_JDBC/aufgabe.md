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

## Literatur zum Thema

1. Praehofer "Funktionale Programmierung" Kapitel

## Ausgangslage

Du bringst bereits Erfahrungen im Umgang mit Datenbanken und grundlegende JAVA-Kenntnisse mit. Dies wollen wir uns nun zu Nutze machen um Datensätze aus einer Applikation permanentn abzuspeichern und weiter zu verarbeiten.  
Die EDUGames AG möchte die grundlegenden Information von Spielen applikatorisch in einer Datenbank ablegen und daraus auch auslesen können. Hierfür legen wir eine kleine Datenbank samt einer Tabelle Game an und greifen darauf aus einer Konsolenapplikation zu.  

ERD der Datenbank m232_sq3a:  
![ERD](images/erd.jpg)

## Ziel

* Du sollst wissen mit welchen Mitteln du aus einem Programm auf eine Datenbank zugreifen kannst
* Du kannst Datensätze aus einer Datenbank herauslesen und in JAVA-Objekte umwandeln
* Du kannst JAVA-Objekte permanent in einer Datenbank ablegen

## Auftrag

1. Erstelle eine Datenbank **m323_sq3a** und teste ob die Verbindung darauf klappt
1. Importiere das Projekt **sidequest3a** des Unterrichtsmittels in deine IDE, das grundlegende Setup ist bereits gemacht
    * In der Klasse **Programm** läuft das Programm, hier fügst du generellen Code ein
    * In der Klasse **DBHelper** sind bereits Methodenrümpfe vorbereitet, hier fügst du datenbankspezifischen Code hinzu (Kommentare beachten)
1. Konfiguriere das Projekt so, dass du damit einen Verbindugnstest mit der Datenbank durchführen kannst
    * Frage die Lehrperson, falls es Probleme gibt
1. Erstelle in der Datenbank eine Tabelle **spiel** mit den in der Ausgangslage beschriebenen Spalten
1. Implementiere im Projekt eine Modell-Klasse **Spiel** mit den Feldern, welche in der Datenbank vorkommen
1. Implementiere im **Programm** den Code um alle Spiele aus der Datenbank auszulesen und gib diese in der Konsole aus
1. Implementiere im **Programm** den Code um der Datenbank 3 weitere Spiele hinzuzufügen
1. Teste ob die Spiele in der Datenbank angekommen sind entweder mit der Ausgabe in der Konsole (Read der Datenbank) oder im entsprechenden DB-Verwaltungstool

## Wissens-Check

* Welche Abfolge Durchläuft der Prozess um Daten zu laden bei der Verwendung von JDBC? <!-- 2 -->
* Weshalb sollten Datenbankverbindung nach beendigter Arbeit stets geschlossen werden? <!-- Es können nur eine bestimmte Anzahl vor Verbindungen gleichzeitig offen sein. Ist dieses Limit erreicht können keine neuen Verbindungen geöffnet werden und Anfragen werden fehlschlagen. -->

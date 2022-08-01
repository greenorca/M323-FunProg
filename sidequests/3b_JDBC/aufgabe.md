# SQ3B - JDBC

## Zeit

* 60 Minuten
  * 5 Minuten Einführung
  * 45 Minuten Bearbeitung der Aufgabe
  * 10 Minuten Besprechung

## Lernart bzw. Sozialform

* Einzelarbeit

## HANOKs & Lernziele

HANOKs: 1.1, 1.3, 1.4, 2.2, 3.2

* Kennt den Unterschied zwischen imperativer und deklarativer/funktionaler Programmierung (deklaratives Programmierparadigma).
* Kennt Vor- und Nachteile funktionaler Programmierung.
* Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden.
* Kennt funktionale Programmierkonzepte (z.B. Filter-Map-Reduce) und passende Entwurfsmuster (z.B. Builder-Pattern).
* Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln.

Lernziele:

* Du kannst mittels einer Business-Klasse Logik vom Programm und der Datenbank entkoppelt
* Du kannst funktionale Programmierung einsetzen um Datenbank-Objekte zu Verarbeiten

## Einführung LP in das Basiswissen

* kurzer Anriss der 3-Schicht Architektur
  * Application Layer _(App)_
  * Business Layer _(Business Logik)_
  * Database Layer _(Datenbank Logik)_

## Literatur zum Thema

* [Baeldung - Guide to Java 8 groupingBy](https://www.baeldung.com/java-groupingby-collector)

## Ausgangslage

Die Auswertung der Datenbank soll bei der EduGames AG mehr über Programmcode als über Datenbankzugriffe passieren. Hierzu soll ein kleiner Prototyp entwickelt werden, welche gewisse rudimentäre Use-Cases abdeckt.

Im Unterrichtsmaterial findest du ein vorgefertigtes Projekt samt SQL-Script für die Datenbank samt Daten. Dieses Programm gilt es nun so zu erweitern, dass damit Auswertungen via Programmcode getätigt werden können.

## Ziel

* Deine Applikation wertet Daten aus Datenbank aus ohne mit SQL-Statements zu arbeiten
* Du hast funktionale Methoden in deinem Programm eingesetzt

## Auftrag

1. Erweitere das Programm um eine Klasse **GameService**, diese wird die funktionalen Methoden beinhalten
2. Erstelle die folgenden Methodenrümpfe in der **GameService**-Klasse.

```java
public Game getCheapestGame(){} // gibt das billigste Spiel zurück
public Game getMostExpensiveGame(){} // gibt das teuerste Spiel zurück
public double getAverageGamePrice(){} // gibt den Durchschnittspreis aller Spiele zurück
public Map<String, Double> getAveragePriceByGenre(){ } // gibt den Durchschnittspreis je Genre zurück
public Map<String, List<Game>> getGamesByGenre(){} // gibt alle Spiele je Genre zurück
```

3. Rufe diese Methoden in der **App**-Klasse auf und erzeuge einen sinnvollen Output in die Konsole.
4. Implementiere nun die Logik der oben gegebenen Methodenrümpfe und verwende dabei lediglich die **getGames**-Methode der **GameDao**-Klasse ohne diese anzupassen.

_**Hinweis:**  
Du brauchst keine Anpassungen an der **GameDao**-Klasse vorzunehmen, alles passiert in der Service-Klasse._

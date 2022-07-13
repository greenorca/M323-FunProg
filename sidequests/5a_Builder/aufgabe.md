# SQ5A - Builder-Pattern


## Zeit

* 45 Minuten

## Lernart bzw. Sozialform

* Partnerarbeit

## HANOKs

## Einführung LP in das Basiswissen

## Literatur zum Thema

1. Praehofer "Funktionale Programmierung" Kapitel
2. https://java-design-patterns.com/patterns/builder/

## Ausgangslage

Unter Umständen werden beim Anlegen von Objekten einer Klasse unterschiedliche Attribute bzw. Eigenschaften angegeben. Manche Attribute sind notwendig, andere freiwillig. Würde man für jede Variante einen eigenen Konstruktor schreiben, kommen schnell dutzende Konstruktoren zusammen, und der Code wird schlecht wartbar. An dieser Stelle hilft das Builder-Pattern weiter.

## Ziel

Durch Anwendung des Builder-Patterns flexibel Objekte einer Klasse mit unterschiedlichen Eigenschaften erstellen

## Auftrag

Arbeite mit zwei oder drei Kollegen die Inhalte der folgenden Webseite durch: https://java-design-patterns.com/patterns/builder/

Dann erstellt ihr ein kleines Java-Projekt *M323_BuilderPattern* mit folgender Funktionalität:

* Erstelle eine Klasse *Flugzeug*, mit den folgenden Eigenschaften
  - typ-bezeichnung (Zeichenkette, notwendig)
  - besatzung (ganzahl, notwendig)
  - leergewicht (in kg, notwendig)
  - geschwindigkeit (in mph, freiwillig)
  - passagiere (ganzzahl, freiwillig)
  - reichweite (in meilen, freiwillig)
* Erstelle für diese Anforderungen ein entsprechende Builder-Klasse
* Teste deinen Code, in dem Du die folgenden Flugzeug-Objekte erstellst:
  - "Cesna 172" mit 2 Besatzung,  736kg, 302km/h und 1270km Reichweite
  - "Airbus A300" mit 2 Besatzung, 266 Passagiere, 78200kg Leergewicht

## Wissens-Check

* Wozu dient das Builder-Pattern?
* Wie implementiert man das Builder-Pattern?

<!-- TODO: Lösung -->

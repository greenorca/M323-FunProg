# SQ6A - Builder-Pattern


## Zeit

* 45 Minuten

## Lernart bzw. Sozialform

* Partnerarbeit

## HANOKs

1.4	Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden. 

1.5	Kennt Möglichkeiten zur Erarbeitung eines für die funktionale Programmierung geeigneten Realisierungskonzeptes. 

2.2	Kennt funktionale Programmierkonzepte (z.B. Filter-Map-Reduce) und passende Entwurfsmuster (z.B. Builder-Pattern). 

3.2	Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln. 


## Einführung LP in das Basiswissen

## Literatur zum Thema

1. Praehofer "Funktionale Programmierung" Kapitel 5.1
2. [https://java-design-patterns.com/patterns/builder/](https://java-design-patterns.com/patterns/builder/)
3. https://www.baeldung.com/java-optional (für den eleganten Umgang mit optionalen Attributen)

## Ausgangslage

Unter Umständen gibt man beim Anlegen von Objekten einer Klasse unterschiedliche Attribute bzw. Eigenschaften an. Manche Attribute sind notwendig, andere freiwillig.

Würde man für jede Variante einen eigenen Konstruktor schreiben, kommen schnell dutzende Konstruktoren zusammen, und der Code wird schlecht wartbar. An dieser Stelle hilft das Builder-Pattern weiter.

## Ziel

Durch Anwendung des Builder-Patterns flexibel Objekte einer Klasse mit unterschiedlichen Eigenschaften erstellen.

Das Prinzip der Builder wird gewissermassen in der Streaming-API angewandt: Streaming-Funktionen geben wieder Streams zurück, die wiederum mit Funktionen weiter verarbeitet werden können.

## Auftrag

Arbeite mit zwei oder drei Kollegen die Inhalte der folgenden Webseite durch: [https://java-design-patterns.com/patterns/builder/](https://java-design-patterns.com/patterns/builder/)

Dann erstellt ihr ein kleines Java-Projekt *M323_BuilderPattern* mit folgender Funktionalität:

* Erstelle eine Klasse *Flugzeug*, mit den folgenden Eigenschaften
  - typ-bezeichnung (Zeichenkette, notwendig)
  - besatzung (ganzahl, notwendig)
  - leergewicht (in kg, notwendig)
  - geschwindigkeit (in mph, freiwillig)
  - passagiere (ganzzahl, freiwillig)
  - reichweite (in meilen, freiwillig)
* Erstelle für diese Anforderungen ein entsprechende Builder-Klasse
* Prüfe die Funktionalität, in dem Du die folgenden Flugzeug-Objekte in einer *public static void main*-Funktion erstellst:
  - "Cesna 172" mit 2 Besatzung,  736kg, 302km/h und 1270km Reichweite
  - "Airbus A300" mit 2 Besatzung, 266 Passagiere, 78200kg Leergewicht
* Zusatz für Fortgeschrittene: Teste deinen Code mit geeigneten JUnit-Tests


Als Beispiel kann die java-StringBuilder-Klasse (Praehofer 5.1) angesehen werden. Damit bei den optionalen Attributen nicht mit Null-Pointer oder Excetions programmiert werden muss, ist es ein eleganter Weg dies mit der Klasse Optional zu tun (evtl. nur für Fortgeschrittene).

## Wissens-Check

* Wozu dient das Builder-Pattern?
* Wie implementiert man das Builder-Pattern?

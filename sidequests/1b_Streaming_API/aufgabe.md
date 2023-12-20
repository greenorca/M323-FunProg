# SQ1B - Streaming API

## Zeit - 45 Minuten

* 10 Minuten Einführung
* 30 Minuten Bearbeitung des Auftrags
* 5 Minuten Besprechung

## Lernart bzw. Sozialform

* praktische Einzelarbeit

## HANOKs

HANOK: 1.1, 1.3, 1.4, 2.2, 3.2

* Kennt den Unterschied zwischen imperativer und deklarativer/funktionaler Programmierung (deklaratives Programmierparadigma).
* Kennt Vor- und Nachteile funktionaler Programmierung.
* Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden.
* Kennt funktionale Programmierkonzepte (z.B. Filter-Map-Reduce) und passende Entwurfsmuster (z.B. Builder-Pattern).
* Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln.

Lernziele:

* Anwenden von einfachen Filtern über eine Liste mit Hilfe der Streaming API.

## Einführung LP in das Basiswissen

### Streaming API

Mit Hilfe der Stream API lassen sich Collections (wie z.B. Listen) verarbeiten.

Die Stream Operationen verändern die originale Collection nicht, sondern liefern eine neue Collection als Resultat.

Jede Operation findet "Lazy" statt, dh. Es können mehrere "Intermediate" Operationen miteinander kombiniert werden, um am Schluss das passende Resultat zu erhalten.

Dabei sind verschiedene "Intermediate" Operationen möglich, zB:

* Filtern
* Mappen -> Einzelne Werte von Objekten auswählen, Objekte übersetzen
* Sortieren

Die Stream Operationen verändern die originale Collection nicht, sondern liefern eine neue Collection als Resultat.

Jede Operation findet "Lazy" statt, dh. Es können mehrere Operationen miteinander kombiniert werden, um am Schluss das passende Resultat zu erhalten.

Sogenannte Terminal Operations die letzten Operationen einer Pipeline, welche die gesamte Kombination der Operationen auswerten und ein Resultat zurückliefern.

* Collect: Sammeln der Resultate und Rückgabe einer Liste, Collection, Set, etc…
* forEach: Iteration über alle durch die Operationen veränderten Elementen
* Reduce: Kombiniert alle Elemente einer Collection/Stream in einem Wert -> Summe aller Werte berechnen, Mittelwert berechnen, etc…

### einfache Streaming API Beispiele

```java
// Filtern von geraden Zahlen
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> even = numbers.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());

// Summe aller Zahlen berechnen
Integer result = numbers.stream().reduce(0, (a,b) -> a+b);

// Alternativ Summe über eingebaute Funktionen
Integer sum = numbers.stream().reduce(0, Integer::sum);

// Alternative 2 Summe über "collect"
Integer collectSum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));

// Alternative 3 Summe über Map und intSum
Integer mapSum = numbers.stream().mapToInt(Integer::intValue).sum();

// Produkt aller Zahlen berechnen
Integer prod = numbers.stream().reduce(1, (a,b) -> a*b);

// Elemente Mappen -> Quadrieren aller Zahlen
List<Integer> square = numbers.stream().map(x->x*x).collect(Collectors.toList());

// Elemente filtern -> Nur Element die mit S beginnen
List<String> names = Arrays.asList("Reflection","Collection","Stream");
List<String> results = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

// Elemente sortieren
List<String> results2 = names.stream().sorted().collect(Collectors.toList());
```

### Weitere Literatur zum Thema

* Generelle Grundlagen zur Stream API: <https://www.baeldung.com/java-8-streams>
* Zahlen Filtern: <http://www.java2s.com/Tutorials/Java/Stream_How_to/Stream_Filter/Filter_Integer_list_for_even_number.htm>
* Erklärung Streams: <https://www.geeksforgeeks.org/stream-in-java/>

## Ausgangslage

* Die Studierenden haben eine Einführung in die Stream API erhalten
* Eine laufende IDE mit Java 8+

## Ziele / erwartete Lernergebnisse

Die Lernenden können einfache Operationen wie filter, range, collect, forEach und evtl boxed anwenden.

## Auftrag

* Es soll eine Liste von Integer von 0 bis 100 mit Hilfe von IntStream.range() erstellt werden.
* Es soll eine Methode "filterNumbers" erstellt werden, welche zwei Argumente entgegen nimmt: Eine Liste von Integer und eine Zahl.
* Die erstellte Methode soll eine neue Liste mit Integer zurückgeben, welche durch die Zahl teilbar sind
  * Z.B. filterNumbers(liste, 3) -> 3,6,9,12, ….
* Es sollen 3 Listen ausgegeben werden:
  * Alle Zahlen, die durch 2 Teilbar sind
  * Alle Zahlen, die durch 3 Teilbar sind
  * Alle Zahlen, die durch 5 Teilbar sind

## Evaluation Lernende

Ein paar Lernende präsentieren ihre Ergebnisse vor der ganzen Klasse.

## Benötigte Software

* IDE (IntelliJ, Eclipse, VSCode, od.ä.)

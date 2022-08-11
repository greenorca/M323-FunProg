# SQ4B - Begriffe und Konzepte

## Richtzeit

* 20 Minuten

## Punkte

* 16 Punkte

## HANOKs

1.4	Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden. 

1.5	Kennt Möglichkeiten zur Erarbeitung eines für die funktionale Programmierung geeigneten Realisierungskonzeptes. 

3.2	Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln. 


## Auftrag

### 1: Theorie

Beantworte die folgenden Fragen stichpunktartig:

1. Was versteht man unter Pure Functions? (2 Punkte) <!-- Funktionen ohne Seiteneffekte, also ohne Zugriff auf externe Daten -->

1. Wie können elementare Daten schreibgeschützt gespeichert werden? (2 Punkte) <!-- mit Schlüsselwort final, z.B. final int x = 42 -->

1. Wie können Listen schreibgeschützt gespeichert werden? (2 Punkte) <!-- via Collections.unmodifiableList(list); -->

1. Was ist der Sinn von `Optional<T>`? (2 Punkte)
<!--
  vermeiden von Null-Pointer-Exceptions, Alternative zum Elvis-Operator (?) in anderen Programmiersprachen
-->

### 2. Praktische Umsetzung

Erstelle im LB-Projekt eine neue Klasse `LB_SQ4B` und implementiere die folgenden Anforderungen in der `public static void main(String[] args)`:

1. Implementiere das java.util.Function-Interface so, dass ein übergebener Integer-Wert verdoppelt zurück gegeben wird. Dieses Function-Objekt speicherst du unter dem Namen *myDoubleFun* ab. (3 Punkte)
2. Prüfe die korrekte Funktionalität des *myDoubleFun*-Objekts. Dazu übergibst Du den Wert 2 und gibst das Ergebnis auf der Console aus. (2 Punkte)
3. Erstelle eine Optional-Variable *myLuckyOption* für eine ganze Zahl mit dem Wert 42. Gib den Wert der Variable auf der Console aus (3 Punkte)


## Bewertungsraster

| Teilaufgabe | Punkte  |
|-------|------- |
| Teil 1: Theoriefragen | 8  |
| Teil 2 |   |
| Function-Objekt erstellen | 3  |
| Function-Objekt testen | 2  |
| Optional erstellen | 3  |
|  |   |
| Summe | 16 |


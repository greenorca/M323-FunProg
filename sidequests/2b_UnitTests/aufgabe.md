# SQ2B - Unit Tests

## Zeit - 60 Minuten

* 10 Minuten Einführung
* 40 Minuten Bearbeitung der Aufgabe
* 10 Minuten Besprechung

## Lernart bzw. Sozialform

* Einzelarbeit

## HANOKs & Lernziele

HANOKs: 1.1, 1.3, 1.4, 2.2, 3.2, 4,1, 4.2, 4.3

* Kennt den Unterschied zwischen imperativer und deklarativer/funktionaler Programmierung (deklaratives Programmierparadigma).
* Kennt Vor- und Nachteile funktionaler Programmierung.
* Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden.
* Kennt funktionale Programmierkonzepte (z.B. Filter-Map-Reduce) und passende Entwurfsmuster (z.B. Builder-Pattern).
* Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln.
* Kennt Mittel, um funktional implementierten Code zu testen (z.B. UnitTests).
* Kennt geeignete Coderichtlinien und hält diese konsequent ein.
* Kennt Best-Practices für funktionale Programmierung und kann diese anwenden.

Lernziele

* Du kannst ein bestehendes Programm mittels UnitTests gegen unerwartete Ergebnisse absichern
* Du kannst auch funktionale Programme mittels UnitTests absichern

## Einführung LP in das Basiswissen

* Kurze Auffrischung zum Thema UnitTests verfassen: Die 3 A's
  * Arrange - Vorbereiten
  * Act - Ausführen
  * Assert - Überprüfen

Ein Unit Test besteht immer aus 3 Elementen: Arrange, Act, Assert. Wobei das Arrange unter Umständen auch weggelassen werden kann, sofern keine Daten vorbereiten werden müssen. Die 3 A's sind aber eine gute Orientierungshilfe beim Verfassen von Unit Tests.

### Beispiel

#### Klasse Rechner

```java
public class Rechner {
  
  public int addition(int zahl1, int zahl2) {
    return zahl1 + zahl2;
  }

}
```

#### Unit Test - RechnerTest

```java
public class RechnerTest {
  
  @Test
  public void given11And22_whenAddition_thenReturns33() {
    // Arrange
    int number1 = 11;
    int number2 = 22;
    int expectedResult = 33;

    // Act
    int actualResult = new Rechner().addition(number1, number2);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

}
```

### Literatur zum Thema

* [Baeldung - Best Practices for Unit Testing](https://www.baeldung.com/java-unit-testing-best-practices)
* [Baeldung - Assertions in JUnit 4 and JUnit 5](https://www.baeldung.com/junit-assertions)
* [Baeldung - A Guide to JUnit 5](https://www.baeldung.com/junit-5)

## Ausgangslage

Für diese Aufgabe wurde der Lösungsvorschlag aus dem vorherigen Sidequest leicht angepasst. Neue gibt es eine Klasse **LibraryService** welche für die effektiven Auswertungen zuständig sein soll. Damit die Migration vom vorherigen Programmcode erfolgreich ist, wurde auch eine Klasse **LibraryServiceTest** implementiert worin vor der Migration UnitTests verfasst werden sollen.

Zum leichteren Einstieg wurde in der **LibraryServiceTest**-Klasse bereits ein Test für das Zählen der Bibliothekseinträge implementiert. Dies wird neu über die Methode **getBookCount** über den **LibraryService** bereitgestellt. Der entsprechende Aufruf wurde im Programm ebenfalls angepasst und kommentiert (siehe **Programm.java**).

## Ziele / erwartete Lernergebnisse

Mit UnitTests soll abgesichert werden, dass deine zuvor gemachten Arbeiten nach der Migration ein erwartetes Ergebnis liefern. Gewollt ist auch der Nebeneffekt, dass bei allfälliger Änderungen deiner Implementierungen die UnitTests fehlschlagen und somit die Veränderung erkannt wird.

## Auftrag

1. Importiere das Beispielprojekt aus den Unterrichtsmaterialien in deine IDE
1. Analysiere die Klasse **LibraryService** und **LibraryServiceTest**
1. Implementiere für alle Auswertungen in der **Programm**-Klasse entsprechende **Methodenrümpfe** (Methoden, ohne innere Logik, bei Wertrückgabe _NULL_ oder einen Standartwert verwenden) in der **LibraryService**-Klasse
1. Implementiere nun in der **LibraryServiceTest**-Klasse für jeden Methodenrumpf eine entsprechende Testmethode. Diese sollen sicherstellen, dass nach der Migration noch alles so läuft wie vorher.
1. Sobald du alle Testmethoden verfasst hast, **übertrage** die Auswertungen aus der **Programm**-Klasse in ihre jeweilige Methode der **LibraryService**-Klasse
1. Lasse die Tests durchlaufen und passe etwaige Fehler noch an
1. Wenn alle Tests erfolgreich sind, kann man mit gutem gewissen die **LibraryService**-Klasse einsetzen. Passe die Auswertungen in der **Programm**-Klasse an, so dass dies die Methoden der **LibraryService**-Klasse verwenden (analog dem getBookCount)

## Evaluation Lernende

Peer-to-Peer Austausch zwischen den Lernenden (z.B. Tischnachbarn oder in Kleingruppen) 

## Benötigte Software

aktuelles Eclipse + JDK17 + Zeal


# SQ6B - Callbacks

## Zeit

* 60 Minuten

## Lernart bzw. Sozialform

* Partnerarbeit

## HANOKs

1.4	Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden. 

1.5	Kennt Möglichkeiten zur Erarbeitung eines für die funktionale Programmierung geeigneten Realisierungskonzeptes. 

2.2	Kennt funktionale Programmierkonzepte (z.B. Filter-Map-Reduce) und passende Entwurfsmuster (z.B. Builder-Pattern). 

3.2	Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln. 

## Einführung LP in das Basiswissen

Die Aufgabenstellung kann gemeinsam im Tutorial-Stil durchgearbeitet werden.

## Literatur zum Thema

1. Praehofer "Funktionale Programmierung" Kapitel 9
2. [https://www.tutorialspoint.com/Callback-using-Interfaces-in-Java](https://www.tutorialspoint.com/Callback-using-Interfaces-in-Java)
3. [https://java-design-patterns.com/patterns/callback/](https://java-design-patterns.com/patterns/callback/)
4. [https://www.baeldung.com/java-executor-service-tutorial](https://www.baeldung.com/java-executor-service-tutorial)

## Ausgangslage

Programme (und auch Webseiten) zeigen häufig Daten von externen Diensten an (z.b. Datenbanken, externe REST-Schnittstellen etc.).

Solche Zugriffe sind ziemlich langsam und können die eigene App blockieren. Dann muss der Benutzer lange warten, bis er weiter arbeiten kann.

Um solche lästigen Wartezeiten zu vermeiden, werden *langsame* Funktionen oft asynchron ausgeführt. Dadurch kann das Programm (und der Benutzer) weiter arbeiten. Wenn die aufgerufene Funktion fertig ist, benachrichtigt sie das Programm über ein sogenanntes *Callback*. Das ist im Grunde nichts anderes als eine Funktion innerhalb unseres Hauptprogramms, der bei Beendigung der asynchronen Funktion ausgeführt wird.

## Ziel

Du lernst, mit asynchronen Funktionen zu arbeiten und Callbacks zu erstellen.  

## Auftrag

1. Erstelle ein neues Java-Projekt *SQ5B_Callback*
1. Erstelle eine neue Klasse *Task* mit einem `Optional<Integer>`-Attribut *result* und der folgenden absichtlich langsam arbeitenden Funktion:
    ```java
    public void slowSum(int a , int b) {
      try {
        Thread.sleep(5000);
        result=Optional.of(a+b);
        System.out.println("DEBUG::internes Ergebnis: "+(a+b));
      } catch (Exception e) {
        System.out.println("Maschine kaputt");
      }
    }
    ```
1. Erstelle zudem eine Hauptklasse *Demo* mit der folgenden *main* Methode zum Demonstrieren eines blockierenden Aufrufs:
    ```java
    public static void main(String[] args) {
      int a = 1, b = 2;
      System.out.println("Berechne ...");
      Task task = new Task();
      task.slowSum(a, b);
      System.out.println(task.result.get());
  	}
    ```
    Analysiere den Code. Was genau passiert hier? <!-- das Programm blockiert, bis die Berechnung fertig ist -->
1. Nun verpacken wir den Aufruf der  Berechnungsfunktion in einen *asynchronen Programmaufruf*. Dazu nutzen wir die `ExecutorService`-Klasse, und verpacken die eigentliche Berechnung in ein *Runnable*-Objekt:

    ```java
    public static void main(String[] args) {
      int a = 1, b = 2;
      System.out.println("Berechne...");
      Task task = new Task();

      ExecutorService exServer = Executors.newSingleThreadExecutor();
      exServer.execute(()->{
        task.slowSum(a, b);
      });

      try {
        int i = 0;
        while (i < 6) {
          System.out.println("Busy with other stuff");
          Thread.sleep(1000);
          i += 1;
    		}
      } catch (Exception ex) {
      }

      System.out.println(task.result.get());
    }
    ```
    Wie du siehst, läuft das Hauptprogramm weiter, während die Berechnung im Gange ist.
1. Nun kommt das Sahnehäubchen - wir wollen im Hauptprogramm benachrichtigt werden, wenn die Berechnung fertig ist. Das erledigen wir über ein sogenanntes *Callback*-Interface:

    ```java
    @FunctionalInterface
    interface Callback {
      public void call();
    }
    ```

    Wie du siehst, ist das wieder ein funktionales Interface. Dieses Interface definieren wir als zusätzlichen Parameter callMe in unserer Berechnungsfunktion der Klasse *Task*-Klasse und rufen es mit callMe.call() auf, sobald die Berechnung fertig ist:
    
    ```java
    public void slowSum(int a , int b, Callback callMe) {
      try {
        Thread.sleep(5000);
        result=Optional.of(a+b);
        System.out.println("DEBUG::internes Ergebnis: "+(a+b));

        if (callMe != null) {
          callMe.call();
        }
      } catch (Exception e) {
        System.out.println("Maschine kaputt");
      }
    }
    ```
    
    Jetzt können wir beim Aufruf der *slowSum*-Funktion in unserer **main* ein Callback-Objekt (als Lambda-Ausdruck) übergeben, mit dem wir das fertige Ergebnis abholen:
    
    ```Java
    exServer.execute(()->{
      task.slowSum(a, b,
          //Callback-Objekt
          () -> System.out.println("Callback, Ergebnis: "
            +task.result.get())
        );
    });
    ```

Dieses Codebeispiel ist eine stark vereinfachte Version zur Demonstration asynchroner Prozesse mit Callbacks. Im richtigen Programmierer-Alltag findest Du statt der `Tread.sleep` oft REST-API-Aufrufe, und statt der Konsolenausgaben wirst Du wohl eher Daten in die GUI schreiben.

Übrigens - das bei GUI-Frameworks oft genutzte Observer-Pattern (Observer Entwurfsmuster) basiert auf dem Callback-Prinzip.

## Wissens-Check

* Wozu dienen Callbacks? <!-- dient der Benachrichtigung des Aufrufers, dass asynchrone Ablauf beendet ist -->
* Wie kann man langsame Programmaufrufe so gestalten, dass der Programmablauf nicht blockiert wird? <!-- als asynchrone Aufrufe mittels ExecutorService -->

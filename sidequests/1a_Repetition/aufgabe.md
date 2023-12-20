# SQ1A - Listen, Arrays, If und For

## Zeit - 45 Minuten

* 5 Minuten Einführung
* 30 Minuten Bearbeitung des Auftrags
* 10 Minuten Besprechung

## Lernart bzw. Sozialform

* praktische Einzelarbeit

## HANOKs

HANOK: 1.1, 1.3, 3.2

* Kennt den Unterschied zwischen imperativer und deklarativer/funktionaler Programmierung (deklaratives Programmierparadigma).
* Kennt Vor- und Nachteile funktionaler Programmierung.
* Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln.

Lernziele:  

* Repetition der bekannten Kontrollstrukturen (IF, FOR)
* Anwenden von Listen in Zusammenhang mit Schleifen

## Einführung LP in das Basiswissen

Die Lernenden benötigen allenfalls einen Refresh zu den Konzepten von Listen, Arrays, If und For

### Arrays

Arrays können mehrere Werte des gleichen Type in einer Variablen speichern. Dabei ist die Grösse fix vorgegeben. Das Zählen beginnt bei der Indexierung bei 0.

#### Beispiele

Array erstellen:

```java
String[] names = { "Peter", "Bruce", "Tony", "Natasha" }; 
```

Auf Array Elemente zugreifen:

```java
String currentName= names[0]; 
```

### Listen

Listen können ebenfalls mehrere Werte des gleichen Type in einer Variablen speichern. Anders als bei Arrays ist hier aber die Grösse dynamisch, d.h. man kann Elemente auch später (zur Laufzeit) hinzufügen.

#### Beispiele

```java
// Liste erstellen:
ArrayList<String> names = new ArrayList<>(); 

// Liste auffüllen:
names.add("Peter"); 
names.add("Bruce"); 

// Elemente löschen:
names.remove(1); 

// Auf List Elemente zugreifen:
names.get(1); 
```

### IF/Else

Ifs überprüfen eine Aussage auf ihren Wahrheitsgehalt (z.B. 3 > 4 -> Falsch). Dabei wird die Aussage als Boolean formuliert. Dabei können mehrere solcher Aussagen mit UND oder ODER kombiniert werden.

#### Beispiele

```java
int x = 7; 

if(x < 5){ 
   System.out.println("Die Zahl ist kleiner 5"); 
} 

if(x < 5 && x != 0){ 
   System.out.println("Die Zahl ist kleiner 5 und nicht 0"); 
} 
```

### For

For sind Schleifen, die mit einem Zähler durchlaufen. Es gibt auch die Variation foreach, welche durch alle Elemente einer Liste oder eines Arrays durchloopt.

#### Beispiele

```java
// Gibt alle Zahlen von 0 bis 99 auf der Konsole aus
for(int i = 0; i < 100; i++){
    System.out.println(i);
}

// Alle Namen einer Liste ausgeben mit For
ArrayList<String> names = new ArrayList<>();
// hier namen einfügen ...
for(int i = 0; i < names.size(); i++){
    System.out.println(names.get(i));
}

// Alle Namen einer Liste ausgeben mit Foreach
ArrayList<String> names = new ArrayList<>();
// hier namen einfügen ...
for(String name: names){
    System.out.println(name)
}
```

## Ausgangslage

* Eine lauffähige Entwicklungsumgebung
* Die Lehrperson hat einige Unittests bereitgestellt in einem DemoProjekt für die Lernenden (Nur Unit-Tests und Main-Klasse)
  * Test für das Filtern von bestimmter Klasse
  * Test für das Filtern von Altersgrenze

## Ziele / erwartete Lernergebnisse

* Zwei gefilterte Klassen werden in der Konsole angezeigt.
* Die Unit-Tests laufen erfolgreich durch.

## Auftrag

* Du musst eine Liste mit 10 Studenten in der Main Klasse befüllen. Dabei sollen einige Abweichungen bei den Attributen bestehen (verschiedene Namen, Klassen und Alter).
* Die Lernenden müssen diese Listen filtern:
  * Es soll eine Methode erstellt werden, welche die Liste von Studenten so filtert, dass nur noch Studenten in einer bestimmten Altersgruppe (älter als oder gleich alt wie ...) in einer Liste zurückgegeben werden (Alter als Parameter).
  * Es soll eine Methode erstellt werden, welche die Liste von Studenten so filtert, dass nur noch Studenten der selben Klasse zurückgegeben werden (Klasse als Parameter).
* Die Main Klasse soll auf diese Methoden zugreifen und zwei gefilterte Listen in der Konsole anzeigen.

## Evaluation Lernende

Peer-to-Peer Austausch zwischen einzelnen Lernenden (od. ähnlich)

## Benötigte Software

* IDE (IntelliJ, Eclipse, VSCode, od.ä.)
* Maven

# SQ5B - Lambda - Funktionen mit Seiteneffekten

## Zeit

* 80 Minuten

## Lernart bzw. Sozialform

* Partnerarbeit

## HANOKs

1.4	Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden. 

1.5	Kennt Möglichkeiten zur Erarbeitung eines für die funktionale Programmierung geeigneten Realisierungskonzeptes. 

3.2	Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln. 

## Einführung LP in das Basiswissen



## Literatur zum Thema

1. Praehofer "Funktionale Programmierung" Kapitel 2.3.4
2. [https://de.wikipedia.org/wiki/Closure_(Funktion)#Java](https://de.wikipedia.org/wiki/Closure_(Funktion)#Java)

## Ausgangslage

Du hast bereits gelernt, funktionale Interfaces mit Lambda-Ausdrücken zu implementieren. Dabei wurde bisher auf *pure functions* ohne Seiteneffekte und ohne freie Variablen geachtet. In diesem Sidequest lernst Du, auch Funktionale Interfaces mit gewünschten bzw. erforderlichen  Seiteneffekten zu implementieren.

## Ziele / erwartete Lernergebnisse

Du kannst innerhalb von Lambda-Ausdrücken lesend und schreibend auf externe Variablen zugreifen, und auch eigene Status-Variablen implementieren.

## Auftrag


Im nächsten Beispiel soll ein Programm in einem ersten Schritt prüfen, ob eine Zahl durch 2 geteilt werden kann. In einem weiteren Schritt möchte man dann zum Bsp. den Teiler schrittweise erhöhen, um zu prüfen ob die Zahl auch durch 3,4,5... teilbar wäre. Analysiere dazu die folgenden Codeausschnitte:

### Lesender Zugriff auf freie Variablen

Innerhalb von Lambda-Ausdrücken kann man sehr wohl auf externe (bzw. *freie*) Variablen zugreifen. Dieser Zugriff ist **für primitive Datentypen** (wie int, double, boolean) **automatisch *nur lesend*** möglich. 

```java
@FunctionalInterface
interface MyFun{
	public boolean istTeilbar(int zahl);
}

public class Lambda_w_ReadOnlyVars {
	
    /**
    * prüft, ob Zahl durch 2 teilbar ist
    */
	public static boolean istTeilbarDurch2(int zahl) {
		int teiler = 2; // innerhalb des Lambda-Ausdrucks lesbar
		
		MyFun teilbar2 = (z) -> z % teiler == 0;
		
		return teilbar2.istTeilbar(zahl);
	}
	
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(
			(x) -> System.out.println(x 
					+ " ist "+(istTeilbarDurch2(x)?"":"nicht ") 
					+ "durch 2 teilbar")
		);
	}
}
```


Der Compiler verweigert nun im folgenden Code alle Versuche, innerhalb des Lambda-Ausdrucks die Werte einer freien Variablen zu verändern:

```java
public static boolean istTeilbarDurch2(int zahl) {
    int teiler = 2;
    
    MyFun teilbar2 = (z) -> {
        teiler++; // hier gibt es einen Compilerfehler
        return z % teiler == 0;
    };
    
    return teilbar2.istTeilbar(zahl);
}
```

### Veränderbare freie Variablen

Angenommen, wir wollten mit einem funktionalen Interface die Summe aller übergebenen Array-Elemente bestimmen, oder einen Array anhand bestimmter Kriterien filtern. In diesem Fall brauchen wir doch zwangsläufig änderbare externe Variablen in unseren Lambda-Ausdrücken.

Tatsächlich geht das relativ einfach, indem man die primitiven Datentypen dieser Variablen in passenden Wrapper-Klassen kapselt (hier *IntRef*):

```java
class IntRef{
	int value;
	public IntRef(int z) { value = z; }
}

public class Lambda_Closure {
	
	public static void main(String[] args) {
		List<Integer> liste = IntStream.range(0, 10)
				.boxed()
				.collect(Collectors.toList());
		
		IntRef counter = new IntRef(0);
		
        //Wert der counter-Variable wird im Lambda verändert
		liste.forEach((i) -> counter.value = counter.value + i);		
		
		System.out.println(counter.value);		
	}
}
```

### Dein Auftrag

Erstelle eine neue Klasse *SQ5B_FilterClosure* mit *main*-Funktion. In der Main-Funktion erstellst du den zu filternden Array *sourceValues* mit Int-Werten von 0 bis 100: 

```java
List<Integer> liste = IntStream.range(0, 100)
.boxed() //konvertiert die 'atomaren' ints in Integer-Objekte 
.collect(Collectors.toList());`
```

Weiterhin erstellst Du in der *main* eine ArrayListe *filteredValues* für Integer-Werte.

Erstelle eine *forEach*-Funktion für die *sourceArray*-Liste mit einem Lambda- bzw. Closure-Ausdruck, welches die durch zwei teilbaren Werte in der *filteredValues*-Liste ablegt.

Am Ende gibst du alle *filteredValues*-Elemente auf der Konsole aus.


## Wissens-Check

1. Was versteht man unter freien Variablen im Zusammenhang mit Lambda-Funktionen? <!-- sind Variablen, die ausserhalb der Lambda-Funktion deklariert wurden und innerhalb der Lambda genutzt werden, ohne dass sie als Parameter übergeben wurden  -->
1. Welche Art von freien Variablen sind innerhalb von Lambda- bzw. Closures nur lesbar? <!-- primitive Datentypen -->
1. Welche Art von freien Variablen sind innerhalb von Lambda- bzw. Closures auch änderbar? <!-- Objektreferenzen, z.B. List etc. -->
1. Sind freie String-Variablen in Closures änderbar? <!-- nein -->

## Für Fortgeschrittene
Nun weisst Du wie man eine nummerierte Personenliste aus Sidequest 5A erstellen kann. Setzte dies als Closure um und teste diese aus. Gibt es auch alternative Implementierungs-Möglichkeiten für diese Closure? 

## Evaluation Lernende

Peer-to-Peer Austausch zwischen den Lernenden (z.B. Tischnachbarn oder in Kleingruppen) 

## Benötigte Software

aktuelles Eclipse + JDK17 + Zeal


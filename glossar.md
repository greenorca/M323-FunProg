

## Lambda-Ausdruck

* Funktion mit formalen Argumenten und einem definierenden Ausdruck. Die beiden Seiten sind üblicherweise mit einem Pfeilsymbol1 getrennt. Der definierende Ausdruck legt den Funktionswert fest und hat keine Seiteneffekte, e.g `(a,b) -> a + b`
* ist ein *first-class* Funktionsobjekt

### Schreibweisen

* Explizit typisiert, Anweisungsrumpf: `(int x, int y) -> {return x + y;}`
* Implizit typisiert, Anweisungsrumpf: `(x, y) -> {return x + y;}`
* Implizit typisiert, Ausdrucksrumpf: `(x, y) -> x + y`


## Parametrischer Polymorphismus

Typparameter dienen zur Definition von Funktionen und Datentypen, bei denen bestimmte Typen unbestimmt sind. In funktionalen Programmiersprachen heisst das *parametrischer Polymorphismus*, bei Java und anderen Sprachen *Generizität*

## Typinferenz

* Datentyp eines Ausdrucks einer Variablen (oder die Signatur einer Funktion) wird automatisch abgeleitet (und nicht vom Programmierer angegeben)
* Bei Lambda-Ausdrücken werden üblicherweise die Typen der Argumente und des Rückgabewertes nicht angegeben, sondern durch Typinferenz
abgeleitet. Zum Beispiel sind bei unserem einfachen Lambda-Ausdruck `x -> x + y` keine Typen für den Parameter x, die freie Variable y oder den Rückgabewert angegeben. Darüber hinaus ist der Operator + überladen und somit die Typen der Operanden nicht eindeutig. In Java könnten die Typen für Argument und Ergebnis beliebige Zahlen als auch Zeichenketten sein.

## Typparameter

```java
//legt den Datentyp für die Liste fest
List<Order> orders;

//Generics definieren beliebigen Datentyp für die Liste, das Suchobjekt und das Ergebnis
public static <T> T find(List<T> list, T item) {
  return ...
}
```

## Typconstraints

Erlaubten Typen einschränken, so dass durch einen Typparameter bestimmter generischer Typ ein Subtyp oder Supertyp eines Typs ist. Dies erfolgt mit den Schlüsselwörtern *extends* bzw. *super*. Mit der Einschränkung `S extends B` wird verlangt, dass der Typ S spezieller oder gleich dem Typ B ist.
Im Beispiel wird für eine SortedList verlangt, dass der Typ E das Interface Comparable<E> implementiert. Damit ist auch sichergestellt, dass man in der Methode add für die Elemente die compareTo-Methode verwenden kann:
```java
public class SortedList<E extends Comparable<E>> {
  public void add(E elem) {
  ...
    while (elem.compareTo(this.get(i)) < 0) { ... }
  }
  ...
}
```

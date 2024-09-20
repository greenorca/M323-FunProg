# Auftrag

Studiert die angegebenen Quellen zum Thema **Function** und beantwortet die folgenden Fragen gemeinsam. Die Ergebnisse stellt ihr eurer Klasse in einer kurzen (5 Minuten) Präsentation vor.

## Quellen

* [https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)
* [https://www.geeksforgeeks.org/function-interface-in-java-with-examples/](https://www.geeksforgeeks.org/function-interface-in-java-with-examples/)
* Praehofer, Funprog, Kap. 2.4 (sehr detailiert)

## Fragen

* Wie funktioniert das *Function*-Interface? <!-- man muss die apply-Funktion implementieren -->
* Wie kann man ein *Function*-Objekt als Variable ablegen?
* Wie implementiert man das Function-Interface?
* Wie kann man mehrere solcher Funktionen verketten (also hintereinander ausführen)?

## Lösungsvorschlag

```java
  Function<Double, Double> square = new Function<Double, Double>() {
			@Override
			public Double apply(Double n) {
				return n * n;
			}
		};

		Function<Double, Double> half = (t) -> t/2.0;

		square = square.andThen(half).andThen(half);
		half = half.andThen(square);

		for (Double x = 0.0; x <  10; x++) {
			double r1 = square.apply(x);
			double r2 = half.apply(x);
			System.out.println(x+":\t" + r1 + "\t" +  r2);
		}
```
<!-- Zeitaufwand: sehr hoch, Schwierigkeit ebenfalls nicht zu unterschätzen -->

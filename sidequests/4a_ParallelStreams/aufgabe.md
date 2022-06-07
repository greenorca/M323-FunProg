# SQxyz - Titel

## Zeit

* 45 Minuten

## Lernart bzw. Sozialform

* Partnerarbeit

<!--
  ## Notizen

  * sinnvoller Aufhänger nach einfachem Beispiel: GROUP BY nachbauen
-->

## HANOKs

1.2	Kennt Vorgehensweisen zur deklarativen Beschreibung von Problemen und Endzuständen. 

1.3	Kennt Vor- und Nachteile funktionaler Programmierung. 

1.4	Kennt die Begriffe aus dem funktionalen Programmieren (z.B. Pure-Function, Immutable Data, Lambda-Expression, Function, Closure, Callback, Functor) und versteht diese, um sie korrekt anzuwenden. 

2.2	Kennt funktionale Programmierkonzepte (z.B. Filter-Map-Reduce) und passende Entwurfsmuster (z.B. Builder-Pattern). 

2.3	Kennt Wege um funktionalen Code verteilt, parallel und nebenläufig auszuführen. 

3.2	Kennt die funktionalen Elemente einer Programmiersprache und kann so Applikationen mit imperativen und deklarativen Programmierparadigma entwickeln. 


## Einführung LP in das Basiswissen

* Fallbeispiel:
  - gegeben: Liste von gegnerischen Raumschiffen in 2D-Game
  - gesucht: Liste von gegnerischen Raumschiffen, die nicht abgeschossen wurden (z.B. energy>0)
  - Naiver Ansatz: Liste von gegnerischen Raumschiffen durchlaufen und alle Raumschiffe mit energy <= 0 entfernen) --> Seiteneffekt, der Array selbst wird verändert.
  - Besser: alle Raumschiffe mit energy > 0 in neuen Array kopieren, und zum Schluss alten durch neuen Array ersetzen
* sequentiell vs. parallele Bearbeitung: teile und herrsche -> lange Listen aufsplitten und mit mehreren Threads die Teil-Listen parallel durchsuchen
* Speed-up, Stolpersteine (geht nur mit Pure Functions)



### Weitere Literatur zum Thema

* Praehofer, Funprog, Kap. 8.1

## Ausgangslage

## Ziel

## Auftrag


## Wissens-Check


## Lösung:
```java
int[] data = IntStream.range(0, 100000000).toArray();
Calendar cal0 = Calendar.getInstance();
long elems = IntStream.of(data).filter(x -> x%2 == 0).count();
long tDelta = Calendar.getInstance().getTimeInMillis() - cal0.getTimeInMillis();

System.out.println("anzahl gefilterter Elemente: "+ elems);
System.out.println("sequential processing time: "+tDelta+" ms");

cal0 = Calendar.getInstance();
elems = IntStream.of(data).parallel().filter(x -> x%2 == 0).count();
tDelta = Calendar.getInstance().getTimeInMillis() - cal0.getTimeInMillis();

System.out.println("anzahl gefilterter Elemente: "+ elems);
System.out.println("parallel processing time: "+tDelta+" ms");
```

<img alt="sq4a_parallelstreams-f92771ee.png" src="img/sq4a_parallelstreams-f92771ee.png" width="" height="" >

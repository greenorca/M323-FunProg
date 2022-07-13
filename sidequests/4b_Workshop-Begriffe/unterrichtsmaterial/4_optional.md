# Auftrag

Studiert die angegebenen Quellen zum Thema **Optional** und beantwortet die folgenden Fragen gemeinsam. Die Ergebnisse stellt ihr eurer Klasse in einer kurzen (5 Minuten) Präsentation vor.

## Quellen

* Buch Kap. 2.3.3
* https://www.oracle.com/technical-resources/articles/java/java8-optional.html

## Fragen

* Was ist der Sinn von `Optional<T>`?
<!--
  vermeiden von Null-Pointer-Exceptions, Alternative zum Elvis-Oprator (?) in anderen Programmiersprachen
-->
* Welche Funktionen haben `Optional`-Objekte?  
<!--
SoundCard soundcard = new Soundcard();
Optional<Soundcard> sc = Optional.of(soundcard);

Optional<Soundcard> soundcard = ...;
soundcard.ifPresent(System.out::println);
-->
* Wie reagiert man in Lambda-Ausdrücken auf Exceptions? <!-- return Optional.empty() im catch-Teil -->


<!-- Geschätzter Zeitaufwand: 15 Minuten -->

# Auftrag

Studiert die angegebenen Quellen zum Thema **closure** und beantwortet die folgenden Fragen gemeinsam. Die Ergebnisse stellt ihr eurer Klasse in einer kurzen (5 Minuten) Präsentation vor.

## Quellen

* [https://de.wikipedia.org/wiki/Closure_(Funktion)#Java](https://de.wikipedia.org/wiki/Closure_(Funktion)#Java)
* [https://www.javatpoint.com/java-closure](https://www.javatpoint.com/java-closure)
* Buch Kapitel 2.3.4 geht auch, ist aber biz komplizierter

## Fragen

* Was versteht man unter Closures? <!-- is a function (or method) that refers to free variables in their lexical context. A free variable is an identifier used but not defined by the closure. It can be used without being a method or a class. It means that closure can access variables that are not defined in the parameter list and also assigned to a variable. We can also parse the closure as a parameter. In other words, a lambda expression becomes a closure when it is able to access the variables that are outside of this scope. It means a lambda can access its outer scope. -->
* Was versteht man unter freien Variablen im Zusammenhang mit Lambda-Funktionen? <!-- sind Variblen, die ausserhalb der Lambda-Funktion deklariert wurden und innerhalb der Lambda genutzt werden, ohne dass sie als Parameter übergeben wurden  -->
* Welche Art von freien Variablen sind innerhalb von Lambda- bzw. Closures nur lesbar? <!-- primitive Datentypen -->
* Welche Art von freien Variablen sind innerhalb von Lambda- bzw. Closures auch änderbar? <!-- Objektreferenzen, z.B. List etc. -->

<!-- Geschätzter Zeitaufwand: mind. 20 Minuten -->

# SQ6A - Builder-Pattern

## Richtzeit

* 25 Minuten

## Punkte

* 22 Punkte

## HANOKs

2.2 Kennt funktionale Programmierkonzepte (z.B. Filter-Map-Reduce) und passende Entwurfsmuster (z.B. Builder-Pattern). 


## Ausgangslage

Mit dem Builder-Pattern können Objekte von Klassen erstellt werden, von denen nur bestimmte Attribute bekannt sind. Damit spart man sich das Erstellen vieler Konstruktor-Varianten. In dieser Aufgabe implementierst Du solch einen Builder für die vorgegebene Klasse *LB_SQ6A_Friend*. Diese Klasse dient zur Speicherung von Freuden.

## Auftrag

1. Erstelle in deinem Prüfungsprojekt eine neue Klasse `LB_SQ6A_Friend`. Kopiere den folgenden Code dort hinein: (1 Punkt)

```java
/**
 * Klasse zur Speicherung von Freund-Daten
 * @author wiss2022 (SCSV)
 *
 */
public class LB_SQ6A_Friend {
	
	String vorname;
	String nachname;
	String augenFarbe;
	String haarFarbe;
	int groesseCm;
	
	/**
	 * Konstruktor
	 * @param builder
	 */
	LB_SQ6A_Friend(LB_SQ6A_FriendBuilder builder) {
        //TODO: Konstruktor komplettieren 
	}	
}

```

2. Erstelle eine Klasse `LB_SQ6A_FriendBuilder` inklusive `main`-Funktion im gleichen package. Diese Klasse hat die gleichen Attribute wie `LB_SQ6A_Friend` (2 Punkte).

3. Im Konstruktor dieser Klasse werden die Parameter _vorname_ und _nachname_ übergeben und in den Attributen gespeichert. (3 Punkte)

4. Erstelle die notwendigen *Builder*-Funktionen zur Übergabe der weiteren Attribute in der `LB_SQ6A_FriendBuilder`-Klasse. Achte auf den korrekten Rückgabe-Typ (6 Punkte)

5. Erstelle die eigentliche *build*-Funktion in der `LB_SQ6A_FriendBuilder`-Klasse. (2 Punkte)

6. Ergänze den notwendigen Code im vorbereiteten Konstruktor der `LB_SQ6A_Friend`-Klasse. (2 Punkte)

7. Erstelle in der *main*-Funktion mit dem `LB_SQ6A_FriendBuilder` ein neues `LB_SQ6A_Friend`-Objekt *johanna* mit den folgenden Eigenschaften (4 Punkte):

    - Vorname: Johanna
    - Nachname: Herrlich
    - Augenfarbe: rehbraun
    - Grösse: 170

8. Gib die Eigenschaften von *johanna* auf der Konsole aus. (2 Punkte)
 

## Bewertungsraster

| Teilaufgabe | Punkte  |
|-------|------- |
| LB_SQ6A_Friend Klasse nach Vorgabe erstellen | 1  |
| LB_SQ6A_FriendBuilder Klasse nach Vorgabe erstellen | 2  |
| Konstruktor LB_SQ6A_FriendBuilder erstellen | 3  |
| weitere Builder-Funktionen implementieren | 6  |
| build-Funktion erstellen  | 2  |
| Konstruktor für LB_SQ6A_Friend Klasse erweitern | 2  |
| Objekt erstellen mit Builder | 4  |
| Ausgabe der Objekte | 2  |
| | |
| **Summe** | **22** |

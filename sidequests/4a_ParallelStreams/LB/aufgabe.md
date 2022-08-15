# SQ4A - Parallele Bearbeitung

## Richtzeit

* 20 Minuten

## Punkte

* 12 Punkte

## HANOKs

2.3	Kennt Wege um funktionalen Code verteilt, parallel und nebenläufig auszuführen. 

## Auftrag

### 1. Theorie

Beantworte die folgenden Fragen in Stichpunkten:

1. Was ist der grosse Vorteil von parallelen Programmabläufen? (2 Punkte)

```





```
2. Was ist die Schwierigkeit bei der Parallelisierung von Programmabläufen? (2 Punkte)

```





```
### 2. Praktische Umsetzung

1. Erstelle das Projekt `sq4a_lb` mit einer neue Klasse `LB_SQ4A`. Darin implementierst du die folgenden Anforderungen in der `public static void main(String[] args)`:
1. Erstelle eine geeignete Variable *zahlen* mit den ganzen Zahlen vom 1 bis 5.000.000. (1 Punkt)
2. Summiere nur die ungeraden Zahlen dieser Liste sequentiell und gib das Ergebnis auf der Konsole aus. Die Summe muss als *long* Variable erstellt werden. (2 Punkte)
2. Summiere nur die ungeraden Zahlen dieser Liste *mit paralleler Verarbeitung* und gib das Ergebnis auf der Konsole aus. Die Summe muss als *long* Variable erstellt werden. (3 Punkte)
2. Miss die Verarbeitungszeiten (z.B. mit der `Calendar`-Klasse) für die sequentielle und die parallele Routine und gib die Ergebnisse auf der Konsole aus. (2 Punkte)

## Bewertungsraster

| Teilaufgabe | Punkte  |
|-------|------- |
| Teil 1: Theoriefragen | 4  |
| Teil 2 |   |
| Zahlen-Variable erstellen | 1  |
| Filtern und Summieren | 2  |
| Paralleles Filtern und Summieren | 3  |
| Verarbeitungszeit messen | 2  |
|  |   |
| Summe | 12 |

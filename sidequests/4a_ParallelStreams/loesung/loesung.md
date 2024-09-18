# Lösungsvorschlag

```java
    List<Integer> zahlen = IntStream.range(0, (int)10E+9)
      .boxed().collect(Collectors.toList());
    Calendar cal0 = Calendar.getInstance();
    long anzahl = zahlen.stream().filter(x -> x % 2 == 0).count();
    Calendar cal1 = Calendar.getInstance();
    long timeDiff = cal1.getTimeInMillis() - cal0.getTimeInMillis();
    System.out.println("Anzahl gefilterter Zahlen: " + anzahl);
    System.out.println("sequentielle Verarbeitung: " + timeDiff+"ms");

    cal0 = Calendar.getInstance();
    anzahl = zahlen.parallelStream().filter(x -> x % 2 == 0).count();
    cal1 = Calendar.getInstance();
    System.out.println("Anzahl gefilterter Zahlen: " + anzahl);
    System.out.println("parallele Verarbeitung: " + (cal1.getTimeInMillis() - cal0.getTimeInMillis())+"ms");

    Random r = new Random();
    for (int i=0; i< zahlen.size(); i++) {
      zahlen.set(i, r.nextInt(10^6));
    }

    Integer[] bigArray = zahlen.stream().toArray(Integer[]::new);
    cal0 = Calendar.getInstance();
    Arrays.parallelSort(bigArray);
    cal1 = Calendar.getInstance();
    System.out.println("Sortierung parallel mit Arrays.sort: " + (cal1.getTimeInMillis() - cal0.getTimeInMillis())+"ms");

    cal0 = Calendar.getInstance();
    List<Integer> sorted = zahlen.stream().sorted().collect(Collectors.toList());
    cal1 = Calendar.getInstance();
    System.out.println("Sortierung sequentiell: " + (cal1.getTimeInMillis() - cal0.getTimeInMillis())+"ms");

    cal0 = Calendar.getInstance();
    sorted = zahlen.parallelStream().sorted().collect(Collectors.toList());
    cal1 = Calendar.getInstance();
    System.out.println("Sortierung parallel: " + (cal1.getTimeInMillis() - cal0.getTimeInMillis())+"ms");

```
```java
int[] zahlen = IntStream.range(0, 100000000).toArray();
Calendar cal0 = Calendar.getInstance();
long elems = IntStream.of(zahlen).filter(x -> x%2 == 0).count();
Calendar cal1 = Calendar.getInstance();
long tDelta = cal1.getTimeInMillis() - cal0.getTimeInMillis();

System.out.println("anzahl gefilterter Elemente: "+ elems);
System.out.println("sequential processing time: "+tDelta+" ms");

cal0 = Calendar.getInstance();
elems = IntStream.of(zahlen).parallel().filter(x -> x%2 == 0).count();
cal1 = Calendar.getInstance();
tDelta = Calendar.getInstance().getTimeInMillis() - cal0.getTimeInMillis();

System.out.println("anzahl gefilterter Elemente: "+ elems);
System.out.println("parallel processing time: "+tDelta+" ms");
```
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
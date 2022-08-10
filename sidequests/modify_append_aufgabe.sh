#!/bin/bash

for dir in `ls -d */`; do
    cd $dir
    echo '
## Evalution Lernende

Peer-to-Peer Austausch zwischen den Lernenden (z.B. Tischnachbarn oder in Kleingruppen) 

## Benötigte Software

aktuelles Eclipse + JDK17 + Zeal
' >> aufgabe.md
    cd ..
done

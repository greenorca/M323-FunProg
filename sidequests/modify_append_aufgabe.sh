#!/bin/bash

for dir in `ls -d */`; do
    cd $dir
    echo '
## Evalution Lernende

Peer-to-Peer Austausch zwischen einzelnen Lernenden (z.B. Tischnachbarn) 

## Benötigte Software

Eclipse + JDK17 + Zeal
' >> aufgabe.md
    cd ..
done

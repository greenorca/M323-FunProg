#!/bin/bash

for dir in `ls -d */`; do
    cd $dir
    echo '
## Evaluation Lernende

Peer-to-Peer Austausch zwischen den Lernenden (z.B. Tischnachbarn oder in Kleingruppen) 

## Benötigte Software

aktuelles Eclipse + JDK17 + Zeal
' >> aufgabe.md

    sed -i 's/## Ziel/## Ziele \/ erwartete Lernergebnisse/g' aufgabe.md 

    cd ..
done

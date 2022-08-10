#!/bin/bash

done_file=".done"

if [ -f $done_file ]; then 
    echo "script must only be executed once!"
    exit 0
fi

for dir in */; do
    if [[ -d "$dir" ]]; then 
    cd "$dir"
    echo '
## Evaluation Lernende

Peer-to-Peer Austausch zwischen den Lernenden (z.B. Tischnachbarn oder in Kleingruppen) 

## Benötigte Software

aktuelles Eclipse + JDK17 + Zeal
' >> aufgabe.md

    sed -i 's/## Ziel/## Ziele \/ erwartete Lernergebnisse/g' aufgabe.md 

    cd ..
    fi
done

echo "DONE" > $done_file
#!/bin/bash

for dir in */; do
    if [[ -d "$dir" ]]; then 
    cd "$dir"
    sq_name=${dir:0:2}
    pandoc aufgabe.md -o aufgabe.html --self-contained -c ../style.css --metadata title="Sidequest ${sq_name^^}"
    #echo $sq_name
    cd ..
    fi
done

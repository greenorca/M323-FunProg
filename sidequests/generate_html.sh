#!/bin/bash

for dir in */; do
    if [[ -d "$dir" ]]; then 
    cd "$dir"
    sq_name=${dir:0:2}
    pandoc aufgabe.md -o ${sq_name^^}_aufgabe.html --embed-resources --standalone -c ../style.css --metadata title="Sidequest ${sq_name^^}"
    pandoc LB/aufgabe.md -o LB/aufgabe.html --embed-resources --standalone -c ../style.css --metadata title="LB SQ ${sq_name^^}"
    #echo $sq_name
    cd ..
    fi
done

#!/bin/bash
# Skript zum Erstellen der HTML-Aufgabenbeschreibungen basierend auf den Markdown-Loesungen ohne HTML-Kommentare (weil da die Lösung drin steht)

cd `dirname "$0"`

cp ../*.md .
# replace all HTML comments with nothing...

for file in `ls *.md`; do 
    pandoc $file -o $file.html; 
done

rm *.md
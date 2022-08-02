#!/bin/bash

# cp ../loesungen*.md .
# replace all HTML comments with nothing...

for file in `ls *.md`; do 
    pandoc $file -o $file.html; 
done

# delete *.md files here...
#!/bin/bash

if [ "$#" -ne 2 ]; then
    echo "Usage: ImageResize srcdir destdir"
    exit 1
fi

if ! [ -d "$1" ]; then
    echo "Source directory not a directory"
    exit 1
fi

if [ -d "$2" ]; then
    read -p "Destination directory exists. Continue? (y/n) " yn
    case $yn in
        [Yy]* ) ;;
        [Nn]* ) exit 1;;
        * ) echo "Continue? (y/n) ";;
    esac

else
    mkdir "$2"
fi

if ! [ -d "imgscalr" ]; then
    git clone https://github.com/thebuzzmedia/imgscalr.git
fi

javac -d "imgscalr/bin" imgscalr/src/main/java/org/imgscalr/*.java
javac -d "imgscalr/bin" -classpath "imgscalr/bin" ImageResize.java

FILES=$1/*
for f in $FILES; do
        if [ -f "$f" ]; then
        java -classpath "imgscalr/bin" ImageResize $f $2
        fi
done
    


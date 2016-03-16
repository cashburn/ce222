#!/bin/bash

if [ "$#" -ne 2 ]; then
    echo "Usage: imageResize srcdir destdir"
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
fi

while true; do true

done



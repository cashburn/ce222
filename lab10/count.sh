#!/bin/bash

#also could just do 'seq 1 3 && seq 5 10'...
for i in `seq 1 10`;
do
    if [ $i != 4 ]; then
        echo $i
    fi
done

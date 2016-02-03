#!/bin/bash

echo `ls -l $1 | grep '^-\|^d' | wc -l`

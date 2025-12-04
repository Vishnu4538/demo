#!/bin/bash


git add .


git commit -m "image changed to $1 in devosecops pipeline"


git push origin main

echo "Sucessfully push the changes to main branch"

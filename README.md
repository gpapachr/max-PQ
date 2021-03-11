# maxPQ

This is a project developed as an assignment of "Data Structures" course. The program takes as an input a txt file containing "folder" sizes in MB. Then it uses a priority queue to sort files in disks, trying to use the least possible number of them. 
Each disk has 1.000.000 MB capacity. When the run is complete, program returns the total size of the imported files and the number of hard disks used. It also returns a list of the hard drives in descending order based on their remaining capacity, and the folders they contain (indicated by their size)

In many parts of the project we used the greediest implementation method. Part of the assignment was to learn how different and very simple data structures are made without dealing with more accurate and probably harder programming methods.

# Bonus!

The Sort.java file contains quicksort algorithm, changed to return the items in descanding order. It's something that we implemented but finally never used. We think that it's going to be useful to anyone who tries to implement it from scratch

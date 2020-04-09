# CS212-Project2
In this project we were asked to read from a .txt file and create a Clock object which will take in hour, minute, second values. Then use that to show a GUI with a grid layout to show an unsorted Link List of the Clock objects and a sorted Link List of the Clock object. The sorting is done using Sorting Insertion, it sorts the nodes while inserting a new node and also placing new added nodes into it appropriate position in the list without distorting the list. Meaning if you already have a link list, then it will place the new node in its appropriate postion.

## What I did:
 - This is a project where we read from a .txt file.
 - Then create a Clock(hours, minute, second) object and storing the read values from that file into the Clock object.
 - Then creating a ClockNode class which takes in a Clock object as data, and takes in the next node this node is pointing to.
 - Then creating a ClockList that would store the first node in the list, the last node in the list, and then the list length.
 This also has a method called append(Clock) which takes in a clock object and create a node for it and inserting that node at the end of the List.
 - Then creating a SortedClockList and UnsortedClockList classes that will inheret from the super class ClockList.
 - The SortedClockList has a function called Add(Clock) which will take in a Clock object and creating a node for it, and then inserting that node in the appropriate position in the SortedClockList without distorting the order of the nodes.
 - The UnsortedClockList has a functino called Add(Clock) which takes in a Clock object, creating a node for it, and inserting that node at the end of the UnsortedClockList without sorting the list.
 - Then display both ClockLists in a grid layout GUI using JFrame.
 
## What I learned:
 - I learned to create ListNodes in Java, which takes in an object as "data" and takes in the next node it points to.
 - I learned to create a LinkList in Java, which stores the first node and the last node as well as the length of the list.
 - I learned to sort the LinkList, as well as inserting a node into the list without losing the order.
 - I learned to create Java Docs and .JAR files.

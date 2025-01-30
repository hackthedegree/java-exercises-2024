# Data Structures

## Question 1
Create a class called `Stack` that implements a LIFO stack using a linked list.

**Note:** You must implement "Generics" so that the Data structure can be used objects of any type.

For a recap of Stacks watch [Data Structures: Stacks and Queues](https://www.youtube.com/watch?v=wjI1WNcIntg)

## Question 2
Create a class called `ArrayQueue` that implements a FIFO queue using an array.

**Note:** You must implement "Generics" so that the Data structure can be used objects of any type.
**Note:** The linked list implementation for a Queue has been provided to support question 3.

For a recap of Queues watch [Data Structures: Stacks and Queues](https://www.youtube.com/watch?v=wjI1WNcIntg)

## Question 3
Complete the implementation of the Binary Search Tree in the source file `BST.java`. A skeleton has been provided, you just need to fill in the methods with *TODO*s on them:
+ `isEmpty()` - use the `size()` method.
+ `get` - both the `public` and `private` methods.
+ `put` - just the `private` method.

To test your solution run:
```shell
java BST < tinyST.txt
```
after compiling the source file. The following output is expected:
```shell
A 8
C 4
E 12
H 5
L 11
M 9
P 10
R 3
S 0
X 7
```

For a recap of Binary Search Trees watch [Data Structures: Trees](https://www.youtube.com/watch?v=oSWTXtMglKE) and [Learn Binary search trees in 20 minutes](https://www.youtube.com/watch?v=Gt2yBZAhsGM)

Also, note how the `BST` class uses 2 generics between the angle brackets when defining the class. So the key-value pairs are generic!
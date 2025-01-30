# Just So Random

# Question 1
Read this article: [Generating random numbers in Java](https://www.geeksforgeeks.org/generating-random-numbers-in-java/)

Now create a program called `RandomNum.java` that when run outputs a random integer.

# Question 2
Extend your work from the first question by now creating a program called `RandomRangeNum.java` that when run takes 2 command-line arguments and generates a random integer in the range given by the command-line arguments.

The program will be run as follows (after compilation):
```shell
java RandomRangeNum <min> <max>
```
where `min` is the lower bound of the range (inclusive) and `max` the upper bound of the range (inclusive). For example:
```shell
java RandomRangeNum 1 10
```
The program must output a random number between 1 and 10. As both bounds are in inclusive the program can output 1 or 10.

**Note:** You must use `Math.random`.

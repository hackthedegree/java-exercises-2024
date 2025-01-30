# Using Modules

## Question 1: Using StdOut
Write a program called `HPrinter.java` that has the following output:
```shell
> java HPrinter 3
* *
***
* *
```

```shell
> java HPrinter 4
*  *
****
****
*  *
```

```shell
> java HPrinter 5
*   *
*   *
*****
*   *
*   *
```

```shell
> java HPrinter 6
*    *
*    *
******
******
*    *
*    *
```

`n` is provided by a command-line argument and has a minimum value of 3. You must use `StdOut` for displaying the stars (*) to the screen.

## Question 2: Using StdIn
Create a program called MinMaxDiff that when executed as follows:

```shell
java MinMaxDiff < data.txt
```
Finds the smallest number and largest number in the `data.txt` file and then computes the differences of the numbers and displays it to the standard output stream using `StdOut`.

Your program should find the smallest number to be -101 and the largest number to be 991099 so your program should display a difference: 991099 - (-101) = 991200. So it will write the following to the standard output stream:
```
991200
```

## Question 3: StdAudio
Write a program called `TerminatorSound.java` that plays a random audio file in the "sound" directory when run.

You must use the `StdRandom` module to generate a random number to use to select the audio file to play.

## Question 4: StdDraw
Using the `StdDraw` module to reproduce the following image in a file called `CheckersBoard.java`:

![Checkers board image](checkers-board.png)


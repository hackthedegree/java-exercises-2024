# Arrays

## Question 1
Convert the Python code shown in the screenshot called "Sieve of Eratosthenes.png" to Java code in a file called `SieveOfEratosthenes.java`.

## Question 2
The following code is an implementation of binary search in Python. Convert this code to Java in a file called `Search.java`:
```python
def _search(key, a, lo, hi):
    if hi <= lo: return -1 # Not found.
    mid = (lo + hi) // 2
    if a[mid] > key:
        return _search(key, a, lo, mid)
    elif a[mid] < key:
        return _search(key, a, mid+1, hi)
    else:
        return mid

def binary_search(key, a):
    return _search(key, a, 0, len(a))
```

You can assume that the array contains `int` values. Ensure to convert comments and align the naming conventions and general code style conventions with that of Java.

**Note:** You must create a test client in the `main` function to test your final solution.

For a recap on Binary search watch: [Algorithms: Binary Search](https://www.youtube.com/watch?v=P3YID7liBug)

## Question 3
The following code is an implementation of binary search in Python. Convert this code to Java in a file called `Sorting.java`:
```python
def exchange(a, i, j):
    a[i], a[j] = a[j], a[i]

def insertion_sort(a):
    n = len(a)
    for i in range(1, n):
        j = i
        while (j > 0) and (a[j] < a[j-1]):
            exchange(a, j, j-1)
            j -= 1
```

You can assume that the array contains `String` objects. Ensure to convert comments and align the naming conventions and general code style conventions with that of Java.

**Note:** You must create a test client in the `main` function to test your final solution.

For a recap of Insertion Sort watch: [Learn Insertion Sort in 7 minutes](https://www.youtube.com/watch?v=8mJ-OhcfpYg)

## Question 4
A string-searching algorithm, sometimes called string-matching algorithm or substring search, is an algorithm that searches a body of text for portions that match by pattern.

For example, given the text "they're eating the dogs, the cats", a substring search algorithm will be able to return the start index of the word "dogs" (which is 19). It will returns a negative number or the length of the text (33 in this case) if the word is not contained in the text, for example: "trump".

For more information check out [Substring search - Brute force algorithm illustration in python](https://www.youtube.com/watch?v=9FAWP0DcpTo)

In this question you will create a static method (function) called
```java
public static int substringSearch(String pat, String txt)
```
in a module called `PatternRecognition.java`. It returns the start index in the text `String` of the pattern. If the given pattern is not present in the text then return 

**Note:** "they're eating the dogs, the cats" would be `txt` and "dogs" would be `pat`.

## Question 5
Only attempt this question once **Question 5** is complete!

Watch this video: https://www.youtube.com/watch?v=YtbQ9Bm5TnI&t=192s

How many character compares does the Brute-force substring search require in the worst case?

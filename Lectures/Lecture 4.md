#ST2 #Lecture 
So, following up from previous lecture, pay attention to the assignment requirements. Most of the time you will be able to use data structures from the java libraries, however it may ask you to create something from scratch, like a linked list. At 10:06 on the lecture recording, an example class of a linked list in provided. There's also plenty of examples on algorithmically inserting and removing elements anywhere in the singly linked list.

To add the predefined linked list, an example can be seen below:
```java
import java.util.LinkedList;

class Main{
	public static void main(String args[]){
		LinkedList<String> names = new LinkedList<String>();
	}
}
```

After a long explanation of different methods that can be used for the [[Linked Lists]], we then touch on `Collections.reverseOrder()` and comparators.
### Collections
Collections in Java are predefined structures and classes, containing a bunch of data structures like Array Lists, Linked Lists, Arrays, etc. It's the umbrella that all these structures fall under, and a lot of them share functions and properties with each other, since they were all designed under the same umbrella.
### Comparators
A comparator object's sole purpose is to sort items in Collections. We can use the `Java.util` predefined comparators using the `Collections` methods ([seen here](https://www.geeksforgeeks.org/collections-class-in-java/)), or implementing our own. One example that can be used is `Collections.reverseOrder()`.

Once the comparator has been called, you can use the following:
```java
// Create the list and populate
LinkedList<Integer> myList = new LinkedList<Integer>();
myList.add(22)
myList.add(25)
myList.add(23)
myList.add(1)

// Introduce comparator and sort
Comparator<Integer> cmp = Collections.reverseOrder();
Collections.sort(myList, cmp);
```

You need the comparator in order to sort with Collections. To create custom comparators, [check out this vid.](https://www.youtube.com/watch?v=jUuzoSdjXSw&ab_channel=JavaCodingCommunity) A comparator can be defined as the ruleset that you will sort by.

## Measuring Runtimes of Algorithms
There are two ways we can measure running time:
1. **Experimental method** - The hands on approach:
	- Implements the algorithm in a language
	- Run it on different inputs
	- Record the time it takes to run.
2. **Analytical Method** - The theory approach:
	- Analyse running time based on input size
		- Big input size -> more running time
		- Small input size -> less running time
	- Independent of the software and hardware
	- Consider all possible inputs

### Big O notation
Big O notation is used to help us determine the efficiency of an algorithm. This takes into account the actual algorithm used and the inputs. The fastest time you can achieve in Big O notation is O(1), which is known as "constant time". This is where the program is able to complete without any searching and is able to calculate the answer immediately.

1. O(1) - Constant time, has a clear retrieval of information (i.e. does not have to search, can just look up the value(s) it needs)
2. O(n) - In the worst case scenario, the computer will repeat `n` times for an `n` sized input.
3. O(n^2) - Quadratic time. In the worst case scenario, the computer will have to check `n` elements for every element in `n` sized input.

This is some basic examples though. Some common algorithms are as follows:

| Algorithm      | Big O Notation |
|----------------|----------------|
| Binary Search  | O(log(n))      |
| Simple Search  | O(n)           |
| Quicksort      | O(n * log(n))  |
| Selection Sort | O(n^2)         |
Then the lecture dives into some examples of determining Big O notation of different algorithms. Worth looking into and practicing ([Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/asymptotic-notation/a/asymptotic-notation) has a great guide on the topic).

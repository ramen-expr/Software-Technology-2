#Lecture #ST2 #Java 
## Methods
A method is a block of code that we are able to reference often. A method in Java requires a data type, name and parentheses, which hold relevant information it needs to operate. 
Example:
```Java
public static void doSomething() {
	someFunction();
	// do something else
}

public class AnObject {
	public String welcomeFunction() {
		return "Hey!! THis is a function for a class!";
	}
}
```

## Classes
A class is a way of creating any type of object. We are able to determine behaviours and attributes for these objects, and we can create them to be sub-types of different classes. See above for the most basic example of a class, but get used to it, you'll be writing a class for just about anything.

## Data Structures
This is the meat of the unit. We use Java to interact with data structures, where the structures themselves are the challenging concept. Data structures are used to organise, process and store data. There are ranges in complexity and architecture, all designed for different settings and purposes.

There are two categories of structures, **linear** and **non-linear**. Linear structures have an order or sequence to the data/information. It is also classified as a single level data structure. Non-linear structures does not arrange the data in the sequential manner and are known as multilevel data structures. There are also subdivisions of these data structures.

## Enums
An `enum` is a special "class" that represents a group of **constants** (unchangeable variables, like `final` variables).
```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```
You can access `enum` constants with the **dot** syntax: `Level myVar = Level.MEDIUM;`. You can also create enums inside a class:
```java
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
```
 Combining it with a switch is also awesome:
 ```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}
```

## Array Lists
[[Array Lists]]

Now, hold on because there is something super cool that we can do to sort Array Lists. First, import `java.util.Collections`, and assuming we have an Array List with a bunch of car brands, do the following:
```java
Collections.sort(cars);
```
This will sort our Array List alphabetically, and for different lists, numerically. 

Array lists are very inefficient resource wise and ==should be avoided where possible.== 

## Linked Lists
Woah woah woah, look out, upgrade is here. [[Linked Lists]]
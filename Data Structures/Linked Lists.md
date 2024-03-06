These bad boys work by chaining together nodes and links. The node holds the info about the object stored, and then points to the next data point. By design there is no need to define the number of elements, and more can be added very rapidly (as well as deleted), you just need to adjust the links.

![[Pasted image 20240226225642.png]]

There is usually a head node which is solely there to point to the first node. There are different ways these can be arranged.
### Singly-Linked Lists
The singly-linked list only points to the next element. The final element points to a null reference. This means that the list must be traversed by starting at the start and going to the end. 

### Doubly-Linked Lists
Links go both ways. There is a head and tail node which point inwards. This means you can start traversing the data structure at either end.
![[Pasted image 20240226230726.png]]
### Circularly-Linked Lists
The end points to the start, and there is no null node at the end.
![[Pasted image 20240226230744.png]]

### Other info
There are a number of important bullet points on the slides so I'll just include them here:
- Java LinkedList class is a member of the Java Collections Framework.  
- It is an implementation of the List and Deque interfaces.  
- Internally, it is an implemented using Doubly Linked List Data Structure.  
- It supports duplicate elements.  
- It stores or maintains it’s elements in Insertion order.  
- We can add any number of null elements.  
- It is not synchronised that means it is not Thread safe.  
- We can create a synchronised LinkedList using Collections.synchronizedList() method.  
- In Java applications, we can use it as a List, stack or queue.

Question that have been raised in my mind: ==What the hell is synchronised in this context and why is being unsynchronised not thread safe?==

In summary, Linked Lists are fantastic for manipulating data, but not amazing for storing it. An ArrayList is the opposite. Manipulating it sucks but getting information from it while it is not being modified is actually pretty good.

To add the predefined linked list, an example can be seen below:
```java
import java.util.LinkedList;

class Main{
	public static void main(String args[]){
		LinkedList<String> names = new LinkedList<String>();
	}
}
```

By default, this one is a doubly linked list. The Java defined linked list has some default functions, very similar (identical to my knowledge) functions to the Array Lists.

You can add to the list by using the `.add(...)` function. You may include the index at which this element should be added.
```Java
cars.add(1, "Mazda");
cars.add("Lambo");
```

There are also specific functions for adding at the start or end of a list. 
```java
cars.addLast("Toyota");
cars.addFirst("Subaru");
```

To access elements within the ArrayList, use the `.get(...)` method.
```Java
cars.get(0);
>>> "Mazda"
```

Use the `.set(...)` method to modify elements within an Array List.
```Java
cars.set(1, "Volvo");
```

To remove an element, use the `.remove(...)` function.
```Java
cars.remove(1);
cars.remove("Subrau ")
```

Similar to the add functions, there are functions to remove the first or last elements.
```Java
cars.removeFirst();
cars.removeLast();
```

To clear the Array List, simply use the `.clear()` function.
```Java
cars.clear();
```

To find the size of the list, we have the `.size()` function, returning an integer.

### Benefits
- Can allocate and deallocate memory at runtime
- Super modifiable
- Makes good use of memory, as allocation is not needed ahead of time.
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


Arrays are good for when you need to hold a large number of different objects of the same data type. For example, you want to hold the names of different usernames:
```Java
String[] users = {"john_doe92", "swaggy_nutz", "queen_b_fan7"};
```
You can change the data type as you need, including your own classes!

An array is a collection of the elements of the same type stored in contiguous (sharing a common border; touching.) memory locations. The common type of the array is known as the *base type*. The storage of arrays is in the form of dynamic allocation in the heap area. We must define an array before we can use it. 

Another awesome thing: arrays can be multidimensional. I mean arrays of arrays, which effectively makes for a 2-D, even 3-D grid, and even more!

```Java
int[][] myNumbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};

System.out.println(myNumbers[1][3]);
>>> 9
```

In Java, the size of an array cannot be changed once it has been created. Arrays in Java are fixed in size, meaning that once you declare an array with a certain size, you cannot change its size (either increase or decrease) during the execution of your program.

There is another way we create a new array. By declaring how many elements should be in this array, the following can be used:
```Java
String[] users = new String[3];
```
When creating the array this way, this adds 3 strings with the default values. This means that the array is filled with `null` values. Whatever the default values are for the datatype used, they will all default to that value.
##### Array length
```Java
System.out.println(users.length)
>>> 3
```


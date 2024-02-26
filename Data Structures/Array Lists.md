Array lists are effectively re-sizable arrays.  We import them from `java.util.ArrayList`. They are defined by using:
```java
ArrayList<Datatype> varName = new ArrayList<Datatype>();
```

You can add to the list by using the `.add(...)` function.
```Java
cars.add("Mazda");
cars.add("Lambo");
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
```

To clear the Array List, simply use the `.clear()` function.
```Java
cars.clear();
```

To find the size of the list, we have the `.size()` function, returning an integer.

Something to keep in mind is that elements in Array Lists are objects, and [primitive data types](https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types) cannot be added. You have to add the appropriate wrapper class for it to work. String is not a primitive data type so it looks the same.

Array lists are very inefficient resource wise and ==should be avoided where possible.== 
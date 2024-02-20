#ST2 #Lecture #Java
## Unit Introduction
Lectures at 12 B2
Tutorials and Labs mandatory attendance, weeks 2-7 and 9-13

**Topics:**
- Intro Data Structures and Algorithms
- Java
- Big O Notation
- Java Pointers
- Recursion
- Sorting
- Searching
- Collections, arrays and memory
- Stacks and queues
- Methods, function pointers, ADT, polymorphism, interfaces, multiple inheritance
- Object orientation

Textbooks have been downloaded to the folder "Textbooks".

==Assignment 1 and 2 MUST average over 50% for marks.==

Consultations are by appointment only. 1230 - 1330 Fridays. [Email Ghazal Bargshady](mailto:ghazal.bargshady@canberra.edu.au)
____
## Java Introduction
Java is a high level, object-oriented programming language. We will be covering it in this unit, but the same concepts of data structures and algorithms should be used in other languages. Java is owned by Oracle and is similar to C++ and C#. Best part, open-source and free.
### Basic Functions/Features
#### Commenting
Two types:
- Inline
	- Denoted `//`, will ignore anything right of that on the line.
- Multiline
	- Denoted as follows: 
		`/*`
		`* Put anything you want here`
		`* Same here`
		`*/`
#### Data Types
- `byte`: 1 byte of data. Stores numbers from -128 to 127
- `short`: 2 bytes of data. Stores numbers from -32,768 to 32,767
- `int`: 4 bytes of data. Stores numbers from -2,147,483,648 to 2,147,483,647
- `long`: 8 bytes of data. Stores numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- `float`: 4 bytes of data. Stores fractional numbers up to 6 to 7 digits.
- `double`: 8 bytes of data. Stores fractional numbers up to 15 digits.
- `boolean`: 1 bit of data. Stores true or false values
- `char`: 2 bytes of data. Stores a single character/letter or ASCII values.
#### Ending Statement
When executing a statement (i.e. something that is not a class or function statement), you need to end the sentence with a `;`. This lets the program know to stop reading this line and treat it as a complete command. Otherwise it will keep looking on the next lines to try and execute it as one big command.
#### Identifiers
- Names can contain letters, digits, underscores, and dollar signs 
- Names must begin with a letter  
- Names should start with a lowercase letter and it cannot contain whitespace  
- Names can also begin with $ and _ (but we will not use it in this tutorial)  
- Names are case sensitive ("myVar" and "myvar" are different variables)  
- [Reserved words](https://www.w3schools.com/java/java_ref_keywords.asp) cannot be used as names.
#### Operators
##### Arithmetic operators
| Operator | Name           | Example | Description                            |
|----------|----------------|---------|----------------------------------------|
| +        | Addition       | x + y   | Adds together two values               |
| -        | Subtraction    | x - y   | Subtracts one value from another       |
| *        | Multiplication | x * y   | Multiplies two values                  |
| /        | Division       | x / y   | Divides one value by another           |
| %        | Modulus        | x % y   | Returns the division remainder         |
| ++       | Increment      | ++x     | Increases the value of a variable by 1 |
| --       | Decrement      | --x     | Decreases the value of a variable by 1 |
##### Assignment operators  
| Operator | Example | Same as    | Description                                          |
|----------|---------|------------|------------------------------------------------------|
| =        | x = 3   | x = 3      | Equals 3                                             |
| +=       | x += 3  | x = x + 3  | Add 3 to the number                                  |
| -=       | x -= 3  | x = x - 3  | Subtract 3 from the number                           |
| *=       | x *= 3  | x = x * 3  | Multiply the number by 3                             |
| /=       | x /= 3  | x = x / 3  | Divide the number by 3                               |
| %=       | x %= 3  | x = x % 3  | Divide the number by 3, only returning the remainder |
| &=       | x &= 3  | x = x & 3  | [See more here](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Bitwise_AND_assignment)                                        |
| \|=      | x \|= 3 | x = x \| 3 | [See more here](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Bitwise_OR_assignment)                                        |
| ^=       | x ^= 3  | x = x^3    | Raises x to the 3rd power                            |
| >>=      | x >>= 3 | x = x >> 3 | [See more here](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Right_shift_assignment)                                        |
| <<=      | x <<= 3 | x = x << 3 | [See more here](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Left_shift_assignment)                                        |
##### Comparison operators  
| Operator | Description              | Example |
|----------|--------------------------|---------|
| ==       | Equal to                 | x == y  |
| !=       | Not equal                | x != y  |
| >        | Greater than             | x > y   |
| <        | Less than                | x < y   |
| >=       | Greater than or equal to | x >= y  |
| <=       | Less than or equal to    | x <= y  |
##### Logical operators
| Operator | Name | Description | Example |
| ---- | ---- | ---- | ---- |
| && | Logical and | Returns true if both statements are true | x < 5 &&  x < 10 |
| \|\| | Logical or | Returns true if one of the statements is true | x < 5 \|\| x < 4 |
| ! | Logical not | Reverse the result, returns false if the result is true | !(x < 5 && x < 10) |
#### Strings
```Java
String txt = "Hello there! I am a string";
```
##### String Length
To find out the length of this string, we can use the following:
```Java
System.out.println("The length of the string is " + txt.length());
```
##### indexOf()
To find out where a substring occurs in a string, use `indexOf(...)`
```Java
System.out.println(txt.indexOf("there!"));
>>> 6
```
##### Concatenate
Consider the following two variables
```Java
String first = "First half";
String second = "Second half";
```
You can concatenate strings by using two different methods:
###### The '+' sign
```Java
String concat_string = first + " " + second;
```
###### .concat(...)
```Java
String concat_string = first.concat(second);
```
#### Arrays
Arrays are good for when you need to hold a large number of different objects of the same data type. For example, you want to hold the names of different usernames:
```Java
String[] users = {"john_doe92", "swaggy_nutz", "queen_b_fan7"};
```
You can change the data type as you need, including your own classes!

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
#### Control Flow
Control flow is just like you'd expect if you've done other programming languages. 
```Java
if (condition) {
	return doSomething();
}
else if {
	return doSomethingButDifferent();
}
else {
	someVar = ChangeSomething();
	return doSomethingElse(someVar);
}
```
##### Switch case
Here's a cool tidbit. Suppose we have a larger set of conditionals, and we want to do an if/else but it's getting pretty large, there is a different way to lay it out with *switch cases.*
```Java
switch(expression){
	case a:
		// Some code
		break;
	case b:
		// Some code
		break;
	...
	default:
		// Some code
}
```
The `break` and `default` keywords are not mandatory.
##### For Loop
When you know how many times you are going to loop through a code block, use a For Loop. They can be called as such:
```Java
for (statement1; statement2; statement3) {
	// Do something
}
```
There are a couple of things to define here first:
1. `statement1` is used to set some initial condition. This can be that `int i = 0;` or something like that.
2. `statement2` is used to check if the code should continue to be executed. For example, `i < 10` says that as long as `i` is not 10 or higher, we can run this code block again.
3. `statement3` is executed after each iteration of the code block. This will typically modify a variable that was defined in a previous statement, like `i++` so that `i` will continue to grow. 
Using those ideas:
```Java
for (int i = 0; i < 10; i++) {
	System.out.println(i);
}
```
This loop will print numbers 0 to 9 line by line. (i.e. runs 10 times)

Be weary of nested loops: there are rare use cases where a nested loop will be beneficial, as it uses a lot of system resources when you do so.
##### For Each Loop
A different type of For Loop! When presented with an array, we can iterate for each object inside the array. Let's take the array we created earlier:
```Java
String[] users = {"john_doe92", "swaggy_nutz", "queen_b_fan7"};
```
and print each name out
```Java
for (String i : users) {
	System.out.println("i");
}
```
##### While Loop
It's simple :) each iteration it checks that the condition is still true. If it is not true, it exits the loop.
```Java
while (condition) {
	// code to be executed
}
```
There is a slight variation of this with Do While loops. It just kinda reverses the order that you define the statements but it does the same thing:
```Java
do {
	// code to be executed
}
while (condition);
```
##### Break/Continue
You can control the flow of programs a bit easier with `break` and `continue`. 
`break` will immediately get you out of whatever innermost loop or switch you are currently in.
`continue` will skip the remaining steps of this iteration and start from the next iteration.
##### Functions
Come back to this
_____
## Actions
- [x] Check the slides/canvas page for assessments and write up
- [ ] Read Java related textbook chapters
- [ ] Prepare for tutorial 
- [x] Create git repo for unit
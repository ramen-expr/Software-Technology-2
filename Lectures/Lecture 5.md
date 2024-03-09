#ST2 #Lecture 
## Recursion
Recursion is sick, it's a function that calls itself, allowing large scale problems to be broken down into smaller, easy-to-tackle problems. Take adding the sum of all numbers below $x$ for example.  We can create a function that calls itself till it reaches zero, and add all those numbers together.

```java
public class Main{
	public static int sum(int x){
		if (k > 0){
			return k + sum(k - 1);
		}
		else {
			return 0;
		}
	}

	public static void main(String args[]){
		int result = sum(10);
		System.out.println(result)
	}
}
```

This way, we effectively call the following:
$$sum(10) = 10 + sum(9)$$
$$sum(10) = 10 + 9 + sum(8)$$
$$...$$
$$sum(10)=10+9+8+7+6+5+4+3+2+1+0$$

When dealing with complex, repeating problems, see if there is a way to recursively deal with it. It can make a difficult problem very easy.


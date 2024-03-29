## Algorithm 1: Recursion Algorithm
The problem of the Tower of Hanoi can be broken into a set of smaller problems, and can be called recursively until the problem has been ultimately solved. The problem is a matter of moving pieces until the largest piece is moved into place. Once the largest piece is moved into place, it is then effectively solving the same puzzle with one layer less.

![[Screenshot from 2024-03-25 20-44-20.png]]
In order to solve the above, the only way you can move the largest piece to the third peg is by solving it as such:
![[Screenshot from 2024-03-25 20-53-54.png]]
So that the piece may be moved like this:
![[Screenshot from 2024-03-25 20-54-06.png]]

In this example, in order to solve the eighth layer, the puzzle with seven layers first had to be solved. So then, once the seven layered puzzle was solved, the 8th piece was able to be moved, and then after that point, the 7th layer would have to be solved again but with the destination of the third peg. 

However, the same logic can apply for solving the seven layered puzzle, where the six-layered puzzle would first have to be solved, and then move the seventh piece, and then solve the six-layered puzzle again. This same logic can be applied all the way down to $n=1$, making this problem trivial.

Psuedocode for this algorithm follows as such:
```Psuedocode
FUNCTION SolveLayer(starting_stack, destination_stack, layer)
	unused equals FindUnusedStack(starting_stack, destination_stack)
	
	IF layer does not equal 1:
		SolveLayer(start_stack, unused_stack, layer-1)
	END IF

	Move piece from start_stack to destination_stack
	
	// The n-1 stack is now placed in the temporary stack,
	// so solve the temp to the destination.
	
	IF layer does not equal 1:
		SolveLayer(unused_stack, destination_stack, layer-1)
	END IF
	
END FUNCTION
```

The time complexity for this algorithm is $O(2^n)$, as the number of moves is a summation of $2^n$. The space complexity of this algorithm is $O(n)$, as the number of recursive calls is limited to $n-1$. 
## Algorithm 2
The iterative solution is equivalent to repeated execution of the following sequence of steps until the goal has been achieved:

If even
- Move one disk from peg A to peg B or vice versa, whichever move is legal.
- Move one disk from peg A to peg C or vice versa, whichever move is legal.
- Move one disk from peg B to peg C or vice versa, whichever move is legal.

If odd
- Move one disk from peg A to peg C or vice versa, whichever move is legal.
- Move one disk from peg A to peg B or vice versa, whichever move is legal.
- Move one disk from peg B to peg C or vice versa, whichever move is legal.

The time complexity of this algorithm is $O(2^n)$, as the number of moves are the same as the first algorithm. Thus the time it takes to calculate the iterative function does not change. The space complexity also does not change, as there are only operations being performed on the same variables, leading to a space complexity of $O(n)$, because there are $n$ pieces that can exist. 
## Which is better?
In terms of time complexity, neither algorithm is better than the other, as they both have the same number of moves and overall loops as each other. In terms of space complexity, both store $n$ items, but the recursive algorithm also stores the recursive functions that lay on top of one another, leading to a lot more working memory storage during the execution. For that reason, the second algorithm is better.

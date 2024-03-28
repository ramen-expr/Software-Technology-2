import java.util.Stack;

public class Hanoi {
  // Create the three pegs
  Stack<Integer>[] pegs = new Stack[3];
  int size;

  public Hanoi(int numLayers) {
    // initialise the individual stacks
    for (int j=0; j<3; j++){
      pegs[j] = new Stack<Integer>();
    }
    // Add all the pieces to the first peg
    for (int i=0; i < numLayers; i++){
      pegs[0].push(numLayers - i);
    }
    size = numLayers;
  }

  // To reduce the amount of parameters passed to the moveTo function, 
  // use a different function to find the third peg that should be used for temporary storage.
  // Since each peg has a unique ID, they all sum to be differnet numbers, resulting in a 
  // unique ID system where provided the first two, the final peg can be determined easily.
  public int findOtherPeg(int a, int b) {
    int sum = a + b;
    if (sum == 1){return 2;}
    else if (sum == 2) {return 1;}
    else {return 0;}
  }

  // Need to validate the moves that we are trying to make
  public boolean isValidMove(int from, int to) {
    // Check for case where destination is blank
    if ((pegs[to].size() == 0) && ( pegs[from].size() > 0)){
      return true;
    }
    // Check for case where piece is smaller than the destination piece
    else if (pegs[to].peek() > pegs[from].peek()){
      return true;
    }
    // Everything else is invalid
    else {
      return false;
    }
  }

  // Checks if it is a valid move, then moves it and logs the move it made
  public void moveTo(int from, int to) {
    if (isValidMove(from, to)){
      System.out.println("Moving from peg " + (from+1) + " to peg " + (to+1));
      pegs[to].push(pegs[from].pop());
    } 
    else {
      System.out.println("Invalid move!");
    }
  }

  // Check for a solved board
  public boolean checkSolved() {
    Stack<Integer> ref = new Stack<Integer>();
    for (int i = size; i > 0; i--){
      ref.push(i);
    }

    if (pegs[2].equals(ref)){
      return true;
    }
    else {
      return false;
    }
  }


  // Simple integer comparator
  public int findLargest(int first, int second) {
    if (first > second){
      return first;
    }
    else {
      return second;
    }
  }

  // Find the stack with the larger item to determine which piece shoulc be moved
  public int findLargestTopStack(int pegRef1, int pegRef2) {
    // In case where a peg is empty, that is deemed to be the destination
    if (pegs[pegRef1].size() == 0){
      return pegRef1; 
    }
    else if (pegs[pegRef2].size() == 0){
      return pegRef2;
    }
    // Find the top pieces of each peg
    int topPiece1 = pegs[pegRef1].peek();
    int topPiece2 = pegs[pegRef2].peek();

    // Find the larger of the two
    int largestPiece = findLargest(topPiece1, topPiece2);

    // Whichever is largest, return the index of the larger peg
    if (largestPiece == topPiece1){
      return pegRef1;
    }
    else {
      return pegRef2;
    }
  }

  // display the Hanoi pegs
  public String toString() {
    String output = "";
    for (int i=0; i<3; i++){
      output += pegs[i] + "\n";
    }
    return output;
  } 
}

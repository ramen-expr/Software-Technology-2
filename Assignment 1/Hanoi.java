import java.util.Stack;

public class Hanoi {
  // Create the three pegs
  Stack<Integer>[] pegs = new Stack[3];

  public Hanoi(int numLayers) {
    // initialise the individual stacks
    for (int j=0; j<3; j++){
      pegs[j] = new Stack<Integer>();
    }
    // Add all the pieces to the first peg
    for (int i=0; i < numLayers; i++){
      pegs[0].push(numLayers - i);
    }
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

  public boolean checkSolved() {
    Stack<Integer> ref = new Stack<Integer>();
    for (int i = 5; i > 0; i--){
      ref.push(i);
    }
    System.out.println(ref);

    if (pegs[2].equals(ref)){
      return true;
    }
    else {
      return false;
    }
  }

  // Algorithm 1: Solving recusively.
  public void solveRecursively(int from, int to, int layer) {
    int unused = findOtherPeg(from, to);
    if (layer != 1){
      solveRecursively(from, unused, layer-1);
    }

    moveTo(from, to);
    
    if (layer != 1){
      solveRecursively(unused, to, layer-1);
    }
  }

  public void solveIteratively() {
    
  }

  public String toString() {
    String output = "";
    for (int i=0; i<3; i++){
      output += pegs[i] + "\n";
    }
    return output;
  }

  public static void main(String[] args) {
    Hanoi game1 = new Hanoi(5);
    game1.solveRecursively(0, 2, 5);
    System.out.println(game1.checkSolved());
    System.out.println(game1);

    Hanoi game2 = new Hanoi(4);
  }
}

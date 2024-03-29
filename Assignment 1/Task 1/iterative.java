public class iterative extends Hanoi {
  public iterative(int num_layers) {
    super(num_layers);
  } 

  // Algortihm 2: Solving iteratively
  public void solveIteratively() {
    // Check whether odd num of pieces or even number of pieces
    int modSize = pegs[0].size() % 2;
    while (checkSolved() != true){
      // If an even number of pieces, use the even algorithm
      if (modSize == 0){
        // Check pegs A and B
        int firstLargest = findLargestTopStack(0, 1);
        if (firstLargest == 0){
          moveTo(1, 0);
        }
        else {
          moveTo(0, 1);
        }
       
        // Check to see if the puzzle is solved
        if (checkSolved()){break;}
        
        // Check peg A and C
        int secondLargest = findLargestTopStack(0, 2);
        if (secondLargest == 0){
          moveTo(2, 0);
        }
        else {
          moveTo(0, 2);
        }

        // Check to see if the puzzle is solved
        if (checkSolved()){break;}

        // Check peg B and C
        int thirdLargest = findLargestTopStack(1, 2);
        if (thirdLargest == 1){
          moveTo(2, 1);
        }
        else{
          moveTo(1, 2);
        }

        // Check to see if the puzzle is solved
        if (checkSolved()){break;}
      }


      // Odd algoithm
      else {
        // Check pegs A and C
        int firstLargest = findLargestTopStack(0, 2);
        if (firstLargest == 0){
          moveTo(2, 0);
        }
        else {
          moveTo(0, 2);
        }

        // Check if the puzzle is solved
        if (checkSolved()){break;}

        // Check pegs A and B
        int secondLargest = findLargestTopStack(0, 1);
        if (secondLargest == 0){
          moveTo(1, 0);
        }
        else {
          moveTo(0, 1);
        }

        // Check if puzzle is solved
        if (checkSolved()){break;}

        // Check pegs B and C
        int thirdLargest = findLargestTopStack(1, 2);
        if (thirdLargest == 1){
          moveTo(2, 1);
        }
        else{
          moveTo(1, 2);
        }

        // Check if puzzle is solved
        if (checkSolved()){break;}
      }
    }
  }
 
  public static void main(String[] args) {
    iterative game = new iterative(4);
    game.solveIteratively();
  }

}

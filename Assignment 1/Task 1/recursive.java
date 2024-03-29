public class recursive extends Hanoi {

  public recursive(int num_layers) {
    super(num_layers);
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

  public static void main(String[] args) {
    int num_pieces = 6;
    recursive game = new recursive(num_pieces);
    game.solveRecursively(0, 2, num_pieces);
  }
  
}

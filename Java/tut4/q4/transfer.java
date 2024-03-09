import java.util.Stack;


public class transfer {
  public static void transfer(Stack S, Stack T) {
    while(S.size() > 0){
      T.push(S.pop());
    }
  }

  public static void main(String[] args) {
    Stack first = new Stack();
    Stack second = new Stack();

    String[] elems = {"BMW", "Hello1!!", "What's up!", "Space Race", "Gemini"};
    for (String i : elems){
      first.push(i);
    }
    
    System.out.println("Before:");
    System.out.println("Stack1: " + first.toString());
    System.out.println("Stack2: " + second.toString() + "\n");

    transfer(first, second);
    
    System.out.println("After:");
    System.out.println("Stack1: " + first.toString());
    System.out.println("Stack2: " + second.toString());
  }
}

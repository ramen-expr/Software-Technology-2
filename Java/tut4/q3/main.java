import java.util.Stack;


public class main {
  private Stack<String> stack = new Stack<String>();

  public boolean stackNotEmpty() {
    if (this.stack.size() == 0){
      return false;
    }
    else {
      return true;
    }
  }
  
  public void pushStack(String elem) {
    this.stack.push(elem);
  }

  public String takeFromStack() {
    return this.stack.pop();
  }

  public String toString() {
    return this.stack.toString();
  }


  public static void main(String[] args) {
    main someStack = new main();
    someStack.pushStack("Orange ball");
    someStack.pushStack("Purple ball");
    someStack.pushStack("Green ball");

    while(someStack.stackNotEmpty()){
      System.out.println("Is my stack empty? No");
      System.out.println("Elements in stack: " + someStack.toString());
      someStack.takeFromStack();
    }
    System.out.println("Is my stack empty? Yes");
  }
}

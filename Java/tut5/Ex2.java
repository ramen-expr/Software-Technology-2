import java.io.File;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String fd = s.nextLine();
    File f = new File(fd);
    if (f.exists()){
      System.out.println("File exists.");
    }
    else {
      System.out.println("File does not exist.");
    }
  }
}

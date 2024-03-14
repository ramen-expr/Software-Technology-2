import java.io.File;
import java.util.Date;

public class Ex1 {
  public static void main(String[] args) {
    File f = new File("/Users/tomlyle/");
    String[] fileList = f.list();
    for (String i : fileList){
      System.out.println(i);
    }
  }
}

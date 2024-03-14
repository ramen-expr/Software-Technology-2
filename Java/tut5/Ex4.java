import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {
  public static void main(String[] args) {
    BufferedReader br;
    String strLine = "";
    
    try {
      br = new BufferedReader(new FileReader("/Users/tomlyle/Documents/Uni/Software Technology 2/Java/tut5/Week6P.txt"));
      while ((strLine = br.readLine()) != null){
        System.out.println(strLine);
      }
      br.close();
    } catch (Exception e) {
      System.out.println("Whoops");
    }
  }
}

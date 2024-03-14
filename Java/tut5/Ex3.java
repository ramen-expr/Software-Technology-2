import java.io.File;

public class Ex3 {
  public static void main(String[] args) {
    String fn = "/Users/tomlyle/Documents/Uni/Software Technology 2/Java/tut5/Ex2.class";
    File f = new File(fn);
    
    if (f.exists()){
      System.out.println(filesize_in_Bytes(f));
      System.out.println(filesize_in_kiloBytes(f));
      System.out.println(filesize_in_megaBytes(f));
    }
    else {
      System.out.println("File does not exist.");
    }
  }
  private static String filesize_in_megaBytes(File file) {
    return (double) file.length()/(1024*1024)+" mb";
  }
  private static String filesize_in_kiloBytes(File file) {
    return (double) file.length()/1024+" kb";
  }
  private static String filesize_in_Bytes(File file) {
    return file.length()+" bytes";
  } 
}

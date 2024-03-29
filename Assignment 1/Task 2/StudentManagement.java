import java.util.LinkedList;
import java.io.*;

public class StudentManagement {
  LinkedList<Student> StudentList;
  
  public StudentManagement() {
    StudentList = new LinkedList<Student>();
  }

  public String toString() {
    String output = "";

    for (Student x : this.StudentList) {
      output = output + x + "\n\n";
    }
    return output;
  }

  public void addStudentsFromFile(String fileName) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String strCurrentLine;
      
      while ((strCurrentLine = br.readLine()) != null){
        String[] params = strCurrentLine.split(",", 0);

        // Get the values needed to contruct a Student
        String nameParsed = params[0].replaceAll("\\s", "");
        int gradeParsed = Integer.parseInt(params[1].replaceAll("\\s", ""));
        int ageParsed = Integer.parseInt(params[2].replaceAll("\\s", ""));
        String genderParsed = params[3].replaceAll("\\s", "");
        String levelParsed = params[4].replaceAll("\\s", "");

        // Construct Student
        Student s = new Student(nameParsed, gradeParsed, ageParsed, genderParsed, levelParsed);
        StudentList.add(s);
      }
    } 
    catch (Exception e) {
      System.out.println("File error!");
    }
  }
  
  public static void main(String[] args) {
    StudentManagement sm = new StudentManagement();
    sm.addStudentsFromFile("students.txt");
    
    // Display all the students data
    System.out.println("\n--- Display Students ---");
    System.out.println(sm);

    // Modify age, +2 for males, -2 for females
    System.out.println("\n--- Modify Age ---\n");
    for (Student x : sm.StudentList) {
      if (x.gender.equals("Male")){
        x.age += 2;
      }
      else {
        x.age -= 2;
      }
    }

    System.out.println(sm);

    // Delete students where level = PG and grade < 50
    System.out.println("\n--- Delete Select Students ---\n");

    // Can't delete elements as we go, need to create a register to mark the students for deletion
    LinkedList<Student> forDeletion = new LinkedList<Student>();
    for (Student x : sm.StudentList) {
      if ((x.level.equals("PG")) && (x.grade < 50)){
        forDeletion.add(x);
      }
    }

    System.out.println("Removing students:");
    for (Student stu : forDeletion){
      sm.StudentList.remove(stu);
      System.out.println("- " + stu.name);
    }
    
    System.out.println("\n\n" + sm);
  }
}

class Student {
  String name;
  int grade;
  int age;
  String gender;
  String level;

  public Student(String name, int grade, int age, String gender, String level) {
    this.name = name;
    this.grade = grade;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public String toString(){
    String output = "Name: "+ this.name + "\n"
    + "Grade: " + this.grade + "\n"
    + "Age: " + this.age + "\n"
    + "Gender: " + this.gender + "\n"
    + "Level: " + this.level;
    return output;
  }
}

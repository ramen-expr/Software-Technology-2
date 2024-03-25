import java.io.*;

public class q1 {
  // Method to read phone numbers from a file and store them in an array
  private static String[] readPhoneNumbersFromFile(String fileName) {
    try{
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      int numLines = 0;
      while (br.readLine() != null){
        numLines++;
      }
      br.close();
      // Now we know the number of lines, create an array of that size
      String[] phNumbers = new String[numLines];
      String line;
      br = new BufferedReader(new FileReader(fileName));
      for (int i = 0; i < numLines; i++){
        line = br.readLine();
        phNumbers[i] = line;
      }
      br.close();
      return phNumbers;
    }

    catch (Exception e) {
      System.out.println("Womp womp");
      return null;
    }
  }

    // Method to write sorted phone numbers back to the file
    private static void writeSortedPhoneNumbersToFile(String[] phoneNumbers, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String phoneNumber : phoneNumbers) {
                writer.write(phoneNumber + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  public static void main(String[] args) {
    String filename = "phone_numbers.txt";
    String[] numbers = readPhoneNumbersFromFile(filename);

    if (numbers != null && numbers.length > 0) {
        bubbleSort(numbers);
        writeSortedPhoneNumbersToFile(numbers, filename);
        System.out.println("Phone numbers sorted successfully!");
    } else {
        System.out.println("No phone numbers found in the file.");
    }
  }

  private static void bubbleSort(String[] phNumberArray) {
    int n = phNumberArray.length;
    boolean swapped;
    do {
        swapped = false;
        for (int i = 1; i < n; i++) {
            if (phNumberArray[i - 1].compareTo(phNumberArray[i]) > 0) {
                String temp = phNumberArray[i - 1];
                phNumberArray[i - 1] = phNumberArray[i];
                phNumberArray[i] = temp;
                swapped = true;
            }
        }
        n--;
    } while (swapped);
  }

  private static void quickSort(String[] phNumberArray) {
    
  }
}

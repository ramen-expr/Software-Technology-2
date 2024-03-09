import java.lang.Math;
import java.util.Arrays;


public class binSearch {
  public static int binSearch(int[] array, int element) {
    // Find the half way point
    int halfway = (int) Math.floor(array.length / 2);
    // if this is the element, return the index
    if (array[halfway] == element) {
      return halfway;
    }
    // Was it too high? Try again
    else if (array[halfway] > element) {
      int[] subarray = Arrays.copyOfRange(array, 0, halfway);
      return binSearch(subarray, element);
    }
    // Too low? Try again
    else {
      int[] subarray = Arrays.copyOfRange(array, halfway+1, array.length);
      return halfway + 1 + binSearch(subarray, element);
    }
  }

  public static void main(String[] args) {
    int[] exampleArray = {1, 2, 3, 4, 10, 40 };
    System.out.println("Index of number is: " + binSearch(exampleArray, 2));
  }
}

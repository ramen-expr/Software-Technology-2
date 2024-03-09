import java.lang.Math;


class findBinary{
  public static String findBinary(int decimal) {
    // check the lowest digit of decimal and make way up until finished
    int running_count = decimal;
    int num_repeats = (int) Math.ceil(Math.log(decimal) / Math.log(2));
    
    int[] digits = new int[num_repeats];

    for (int i = 0; i < num_repeats; i++){
      if (running_count < Math.pow(2, num_repeats-i-1)) {
        digits[i] = 0;
      }
      else {
        digits[i] = 1;
        running_count -= Math.pow(2, num_repeats-i-1);
      }
    }
    
    StringBuilder strBuilder = new StringBuilder();
    for (int i = 0; i < digits.length; i++) {
       strBuilder.append(digits[i]);
    }
    String newString = strBuilder.toString();

    return newString;
  }

  public static void main(String[] args) {
    System.out.println(findBinary(9));
  }
}

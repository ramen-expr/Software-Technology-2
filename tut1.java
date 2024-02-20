package Tutorial1;

public class tut1 {

	/* For q1, we can see if the class is even or not based on the last digit
	 * of the binary string. Check the last string and see if the digit is 
	 * "0" or not. */
	public static Boolean isEven(int num) {
		String binaryNum = Integer.toBinaryString(num);
		
		if (binaryNum.endsWith("0")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* For q2, I can use a for loop which has a running sum of numbers
	 * and adds squares of these numbers into the sum. */
	public static int sumOfSquares(int num) {
		int sum = 0;
		// Run for each number up to and including the number
		for (int i = 1; i <= num; i++) {
			int sqrNum = (int) Math.pow(i, 2);
			sum += sqrNum;
		}
		return sum;
	}
	
	/* For q3, 
	 * 
	 */
	
	

	public static void main(String args[]) {
		String q1_output = """
		--- Question 1 Proof ---
		isEven(9): %s
		isEven(2): %s
		isEven(137): %s \n
		""".formatted(
				isEven(9).toString(),
				isEven(2).toString(),
				isEven(137).toString()
				);
		
		String q2_output = """
				--- Question 2 Proof ---
				sumOfSquares(2): %d
				sumOfSquares(4): %d
				sumOfSquares(7): %d \n
				""".formatted(
						sumOfSquares(2),
						sumOfSquares(4),
						sumOfSquares(7)
						);
		
		String q3_output = """
				--- Question 3 Proof ---
				sumOfSquares(2): %d
				sumOfSquares(4): %d
				sumOfSquares(7): %d \n
				""".formatted(
						sumOfSquares(2),
						sumOfSquares(4),
						sumOfSquares(7)
						);
		
		System.out.println(q1_output + q2_output + q3_output);
	}

}

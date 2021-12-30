 //Write a program to find sum of all
//integers greater than 100 and less than 200 that are
//divisible by 7 .

public class SumOfDigit {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 7 == 0) {
				result = result + i;

			}

		}
		System.out.println("The OutPut of Program is: " + result);
	}
}

import java.util.Scanner;

public class PrimeNumber {
	public static void primeN(int n) {
		for (int i = 0; i < n; i++) {
			boolean isprime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					isprime = false;
				break;
			}
			if (isprime) {
				System.out.println(i + "");
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of number");
		int num = sc.nextInt();
		primeN(num);
	}
}

import java.util.Scanner;

public class SumProduct {
	public static void sum(int n) {//calculate the reverse number
		int sum = 0;
		for (int i = n; i > 1; i--) {
			sum = sum + i;
		}
		System.out.println("Display of sum given " + n + " number" + sum);

	}

	public static void product(int n) {
		int product = 1;
		for (int i = n; i > 1; i--) {
			product = product * i;
		}
		System.out.println("Display of product given " + n + " number " + product);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sum(num);
		product(num);
	}
}

//Write a program to find average of consecutive N Odd no. and Even no.
import java.util.Scanner;

public class sumandevenodd {
	public static void main(String[] args) {
		int sumEven = 0, countEven = 0, countOdd = 0, sumOdd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		while (n > 0) {
			if (n % 2 == 0) {
				countEven++;
				sumEven = sumEven + n;
			} else {
				countOdd++;
				sumOdd = sumOdd + n;

			}
			n--;
		}
		int evenAvg, Oddavg;
		evenAvg = sumEven / countEven;
		Oddavg = sumOdd / countOdd;
		System.out.println("Total add even number " + sumEven);
		System.out.println("Total add odd number " + sumOdd);
		System.out.println("Total even Average number " + evenAvg);
		System.out.println("Total Odd Average number  " + Oddavg);

	}
}

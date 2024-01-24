package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 Integers. ");
		System.out.println("Enter Integer 1");
		int n1 = in.nextInt();
		System.out.println("Enter Integer 2");
		int n2 = in.nextInt();
		double avg = ((n1 + n2)/2.0);
		System.out.print(avg);

		// TODO Auto-generated method stub

	}

}


//Java Start 02.03.2020

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number");

		int number = sc.nextInt();
		int a = number % 10000 / 1000;
		int b = number % 1000 / 100;
		int c = number % 100 / 10;
		int d = number % 10;
		int sum = a + b;
		int sum2 = c + d;
		if (sum == sum2) {
			System.out.println("enter a lucky ticket");
		} else
			System.out.println("not a happy ticket");

	}

	}



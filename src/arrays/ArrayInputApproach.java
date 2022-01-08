package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayInputApproach {

	public static void main(String[] args) {
		int[] a = new int[100];

		/*
		 * for (int i = 0; i < 5; i++) {//comment out this loop for scanner print a[1] =
		 * i + 5; System.out.println(a[i]); }
		 */
		// scanner class
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("please insert your int");//comment out for loops
			a[i] = sc.nextInt();
		}

		for (int j = 0; j < 10; j++) {
			System.out.println(a[j]);
		}
		
		Random r= new Random();
		a[0]=r.nextInt(100);
		System.out.println(a[0]);
		
		
		
		
		

	}

}

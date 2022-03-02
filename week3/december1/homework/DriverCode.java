package week3.december1.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {

	public static void question1() {
		
		TimeToEquality q1 = new TimeToEquality();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 4, 1, 3, 2));
		System.out.println(q1.solve(A));	//8
		
	}
	
	public static void question2() {
		
		ProductArrayPuzzle q2 = new ProductArrayPuzzle();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(5, 1, 10, 1));
		System.out.println(q2.solve(A1));	//[120, 60, 40, 30, 24]
		System.out.println(q2.solve(A2));	//[10, 50, 5, 50]
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Time to equality");
		question1();
		System.out.println();
		System.out.println("Product array puzzle");
		question2();

	}

}

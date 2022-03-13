package week4.december6.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {
	
	public static void question1() {
		
		CountingSubarraysEasy q1 = new CountingSubarraysEasy();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(2, 5, 6));
		int B1 = 10;
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 11, 2, 3, 15));
		int B2 = 10;
		System.out.println(q1.solve(A1, B1));	//4
		System.out.println(q1.solve(A2, B2));	//4
		
	}
	
	public static void question2() {
		
		GoodSubarraysEasy q2 = new GoodSubarraysEasy();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		int B1 = 4;
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9));
		int B2 = 65;
		System.out.println(q2.solve(A1, B1));	//6
		System.out.println(q2.solve(A2, B2));	//36
		
	}
	
	public static void question3() {
		
		AlternatingSubarraysEasy q3 = new AlternatingSubarraysEasy();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 1));
		int B1 = 1;
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 0, 1));
		int B2 = 0;
		System.out.println(q3.solve(A1, B1));	//[1, 2, 3]
		System.out.println(q3.solve(A2, B2));	//[0, 1, 2, 3, 4, 5, 6]
		
	}

	public static void main(String[] args) {
		
		System.out.println("Counting Subarrays Easy");
		question1();
		System.out.println();
		System.out.println("Good Subarrays Easy");
		question2();
		System.out.println();
		System.out.println("Alternating Subarrays Easy");
		question3();

	}

}

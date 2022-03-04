package week3.december4.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {

public static void question1() {
		
		AmazingSubarrays q1 = new AmazingSubarrays();
		String A = "ABEC";
		System.out.println(q1.solve(A));	//6
		
	}
	
	public static void question2() {
		
		EvenSubarrays q2 = new EvenSubarrays();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(2, 4, 8, 6));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(2, 4, 8, 7, 6));
		System.out.println(q2.solve(A1));	//YES
		System.out.println(q2.solve(A2));	//NO
		
	}
	
	public static void question3() {
		
		LeadersInAnArray q3 = new LeadersInAnArray();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(16, 17, 4, 3, 5, 2));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 2));
		System.out.println(q3.solve(A1));	//[17, 2, 5]
		System.out.println(q3.solve(A2));	//[2]
		
	}

	public static void main(String[] args) {

		System.out.println("Amazing Subarrays");
		question1();
		System.out.println();
		System.out.println("Even Subarrays");
		question2();
		System.out.println();
		System.out.println("Leaders in an array");
		question3();
		
	}

}

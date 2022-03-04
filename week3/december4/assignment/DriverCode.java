package week3.december4.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {
	
	public static void question1() {
		
		SpecialSubsequencesAG q1 = new SpecialSubsequencesAG();
		String A1 = "ABCGAG";
		String A2 = "GAB";
		System.out.println(q1.solve(A1));	//3
		System.out.println(q1.solve(A2));	//0
		
	}
	
	public static void question2() {
		
		ClosestMinMax q2 = new ClosestMinMax();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 3));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(2));
		System.out.println(q2.solve(A1));	//2
		System.out.println(q2.solve(A2));	//1
		
	}
	
	public static void question3() {
		
		Bulbs q3 = new Bulbs();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));
		System.out.println(q3.bulbs(A1));	//4
		System.out.println(q3.bulbs(A2));	//0
		
	}

	public static void main(String[] args) {

		System.out.println("Special Subsequences AG");
		question1();
		System.out.println();
		System.out.println("Closest MinMax");
		question2();
		System.out.println();
		System.out.println("Bulbs");
		question3();
		
	}

}

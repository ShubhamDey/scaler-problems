package week15.march2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverCode {
	
	public static void question1() {
		
		MergeTwoSortedArrays q1 = new MergeTwoSortedArrays();
		List<Integer> A1 = new ArrayList<Integer>(Arrays.asList(4, 7, 9));
		List<Integer> B1 = new ArrayList<Integer>(Arrays.asList(2 ,11, 19));
		List<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1));
		List<Integer> B2 = new ArrayList<Integer>(Arrays.asList(2));
		System.out.println(q1.solve(A1, B1));		//[2, 4, 7, 9, 11, 19]
		System.out.println(q1.solve(A2, B2));		//[1, 2]
		
	}
	
	public static void question2() {
		
		KthSmallestElement q2 = new KthSmallestElement();
		List<Integer> A1 = new ArrayList<Integer>(Arrays.asList(2, 1, 4, 3, 2));
		int B1 = 3;
		List<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 2));
		int B2 = 2;
		System.out.println(q2.kthsmallest(A1, B1));	//2
		System.out.println(q2.kthsmallest(A2, B2));	//2
		
	}
	
	public static void question3() {
		
		ArrayWithConsecutiveElements q3 = new ArrayWithConsecutiveElements();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 4, 5));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 3, 2, 5));
		System.out.println(q3.solve(A1));			//1
		System.out.println(q3.solve(A2));			//0
		
	}
	
	public static void question4() {
		
		MaxMod q4 = new MaxMod();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 44, 3));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(2, 6, 4));
		System.out.println(q4.solve(A1));			//3
		System.out.println(q4.solve(A2));			//4
		
	}

	public static void main(String[] args) {

		System.out.println("Merge Two Sorted Arrays");
		question1();
		System.out.println();
		System.out.println("Kth Smallest Element");
		question2();
		System.out.println();
		System.out.println("Array with consecutive elements");
		question3();
		System.out.println();
		System.out.println("MaxMod");
		question4();
		
	}

}

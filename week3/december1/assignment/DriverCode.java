package week3.december1.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {
	
	public static void question1() {
		
		EquilibriumIndexOfAnArray q1 = new EquilibriumIndexOfAnArray();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(q1.solve(A1));			//3
		System.out.println(q1.solve(A2));			//-1
		
	}
	
	public static void question2() {
		
		SpecialIndex q2 = new SpecialIndex();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(2, 1, 6, 4));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 1, 1));
		System.out.println(q2.solve(A1));			//1
		System.out.println(q2.solve(A2));			//3
		
	}
	
	public static void question3() {
		
		PickFromBothSides q3 = new PickFromBothSides();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(5, -2, 3 , 1, 2));
		int B1 = 3;
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 2));
		int B2 = 1;
		System.out.println(q3.solve(A1, B1));		//8
		System.out.println(q3.solve(A2, B2));		//2
		
	}
	
	public static void question4() {
		
		RangeSumQuery q4 = new RangeSumQuery();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<ArrayList<Integer>> B1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 4));
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(2, 3));
		B1.add(arr1);
		B1.add(arr2);
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(2, 2, 2));
		ArrayList<ArrayList<Integer>> B2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(1, 1));
		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(2, 3));
		B2.add(arr3);
		B2.add(arr4);
		System.out.println(q4.rangeSum(A1, B1));	//[10, 5]
		System.out.println(q4.rangeSum(A2, B2));	//[2, 4]
		
	}

	public static void main(String[] args) {

		System.out.println("Equilibrium index of an array");
		question1();
		System.out.println();
		System.out.println("Count ways to make sum of odd and even indexed elements equal by removing an array element");
		question2();
		System.out.println();
		System.out.println("Pick from both sides!");
		question3();
		System.out.println();
		System.out.println("Range Sum Query");
		question4();
		
	}

}

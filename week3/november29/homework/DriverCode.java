package week3.november29.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {
	
	public static void question1() {
		
		LittlePonyAndMaximumElement q1 = new LittlePonyAndMaximumElement();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(2, 4, 3, 1, 5));
		int B1 = 3;
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 4, 2));
		int B2 = 3;
		System.out.println(q1.solve(A1, B1));	//2
		System.out.println(q1.solve(A2, B2));	//-1
		
	}
	
	public static void question2() {
		
		SecondLargest q2 = new SecondLargest();
		int[] A1 = {2, 1, 2};
		int[] A2 = {2};
		System.out.println(q2.solve(A1));		//2
		System.out.println(q2.solve(A2));		//-1
		
	}
	
	public static void question3() {
		
		MinimumPicks q3 = new MinimumPicks();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(0, 2, 9));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(5, 17, 100, 1));
		System.out.println(q3.solve(A1));		//-7
		System.out.println(q3.solve(A2));		//99
		
	}
	
	public static void question4() {
		
		SeperateOddEven q4 = new SeperateOddEven();
		int T1 = 2;
		ArrayList<ArrayList<Integer>> A1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(4, 3, 2));
		A1.add(arr1);
		A1.add(arr2);
		int T2 = 2;
		ArrayList<ArrayList<Integer>> A2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(2, 2, 2));
		ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(1, 1));
		A2.add(arr3);
		A2.add(arr4);
		System.out.println(q4.solve(T1, A1));	//[[1, 3, 5], [2, 4], [3], [4, 2]]
		System.out.println(q4.solve(T2, A2));	//[[], [2, 2, 2], [1, 1], []]
		
	}
	
	public static void question5() {
		
		MultipleLeftRotationsOfTheArray q5 = new MultipleLeftRotationsOfTheArray();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> B1 = new ArrayList<Integer>(Arrays.asList(2, 3));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(5, 17, 100, 11));
		ArrayList<Integer> B2 = new ArrayList<Integer>(Arrays.asList(1));
		System.out.println(q5.solve(A1, B1));	//[[3, 4, 5, 1, 2], [4, 5, 1, 2, 3]]
		System.out.println(q5.solve(A2, B2));	//[[17, 100, 11, 5]]
		
	}

	public static void main(String[] args) {

		System.out.println("Little Ponny and Maximum Element");
		question1();
		System.out.println();
		System.out.println("Second Largest");
		question2();
		System.out.println();
		System.out.println("MINIMUM PICKS");
		question3();
		System.out.println();
		System.out.println("Separate Odd Even");
		question4();
		System.out.println();
		System.out.println("Multiple left rotations of the array");
		question5();
		
	}

}

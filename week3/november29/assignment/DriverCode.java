package week3.november29.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {
	
	public static void printArray(int[] Array) {
		
		for(int i = 0 ; i < Array.length ; i++) {
			if(i == 0) {
				System.out.print("{" + Array[i]);
			}
			else if(i == Array.length - 1) {
				System.out.print(", " + Array[i] + "}");
			}
			else {
				System.out.print(", " + Array[i]);
			}
		}
		System.out.println();
		
	}
	
	public static void question1() {
		
		RotationGame q1 = new RotationGame();
		int[] A1 = {1, 2, 3, 4};
		int B1 = 2;
		int[] A2 = {1, 2, 2};
		int B2 = 3;
		printArray(q1.solve(A1, B1));										//{3, 4, 1, 2}
		printArray(q1.solve(A2, B2));										//{1, 2, 2}
		
	}
	
	public static void question2() {
		
		GoodPair q2 = new GoodPair();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		int B1 = 7;
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 2, 4));
		int B2 = 4;
		ArrayList<Integer> A3 = new ArrayList<Integer>(Arrays.asList(1, 2, 2));
		int B3 = 4;
		System.out.println(q2.solve(A1, B1));								//1
		System.out.println(q2.solve(A2, B2));								//0
		System.out.println(q2.solve(A3, B3));								//1
		
	}
	
	public static void question3() {
		
		MaxAndMinOfAnArray q3 = new MaxAndMinOfAnArray();
		int[] A1 = {1, 2, 3, 4, 5};
		int[] A2 = {10, 50, 40, 80};
		int[] result = q3.solve(A1);
		System.out.println("Max : "+ result[0] +" , Min : " + result[1]);	//Max : 5 , Min : 1
		result = q3.solve(A2);
		System.out.println("Max : "+ result[0] +" , Min : " + result[1]);	//Max : 80 , Min : 10
		
	}
	
	public static void question4() {
		
		ReverseTheArray q4 = new ReverseTheArray();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 1));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(1, 1, 10));
		System.out.println(q4.solve(A1));									//[1, 2, 3, 2, 1]
		System.out.println(q4.solve(A2));									//[10, 1, 1]
		
	}
	
	public static void question5() {
		
		SearchElement q5 = new SearchElement();
		int T1 = 1;
		ArrayList<ArrayList<Integer>> A1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(4, 1, 5, 9, 1));
		A1.add(arr1);
		int B1 = 5;
		int T2 = 1;
		ArrayList<ArrayList<Integer>> A2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(7, 2, 2));
		A2.add(arr2);
		int B2 = 1;
		System.out.println(q5.solve(T1, A1, B1));							//1
		System.out.println(q5.solve(T2, A2, B2));							//0
		
	}

	public static void main(String[] args) {

		System.out.println("Rotation Game");
		question1();
		System.out.println();
		System.out.println("Good Pair");
		question2();
		System.out.println();
		System.out.println("Max and Min of an Array");
		question3();
		System.out.println();
		System.out.println("Reverse the Array");
		question4();
		System.out.println();
		System.out.println("Search Element");
		question5();
		
	}

}

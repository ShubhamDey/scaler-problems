package week3.november29.classwork;

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
	
	public static void countElementsGreaterThanItself() {
		
		Question1 q1 = new Question1();
		int[] arr1 = {-3, -2, 6, 8, 4, 8, 5};
		int[] arr2 = {2, 3, 10, 7, 3, 2, 10, 8};
		int[] arr3 = {2, 5, 1, 4, 8, 0, 8, 1, 3, 8};
		System.out.println(q1.countElements(arr1));				//5
		System.out.println(q1.countElements(arr2));				//6
		System.out.println(q1.countElements(arr3));				//7
		
	}
	
	public static void checkPairExists() {
		
		Question2 q2 = new Question2();
		int[] arr1 = {3, -2, 1, 4, 3, 6, 8};
		int k1 = 10;
		int[] arr2 = {2, 4, -3, 7};
		int k2 = 5;
		int[] arr3 = {2, 4, -3, 7};
		int k3 = 8;
		System.out.println(q2.checkPair(arr1, k1));				//True
		System.out.println(q2.checkPair(arr2, k2));				//False
		System.out.println(q2.checkPair(arr3, k3));				//False
		
	}
	
	public static void reverseEntireArray() {
		
		Question3 q3 = new Question3();
		int[] arr1 = {-1, 4, 7, 6, -2, 7, 8, 10};
		int[] arr2 = {-1, 6, 3, 2,  8, 9, 10};
		printArray(q3.reverseArray(arr1));						//{10, 8, 7, -2, 6, 7, 4, -1}
		printArray(q3.reverseArray(arr2));						//{10, 9, 8, 2, 3, 6, -1}
		
	}
	
	public static void reverseEntireArrayFromStartToEndIndex() {
		
		Question4 q4 = new Question4();
		int[] arr = {-1, 4, 7, 6, -2, 7, 8, 10};
		int start = 3, end = 7;
		printArray(q4.reverseArrayStartEnd(arr, start, end));	//{-1, 4, 7, 10, 8, 7, -2, 6}
		
	}
	
	public static void reverseArrayClockwiseKTimes() {
		
		Question5 q5 = new Question5();
		int[] arr1 = {3, -2, 1, 4, 6, 9, 8};
		int k1 = 4;
		int[] arr2 = {-2, 3, 1, 4, 6, 2, 8, 7, 9, 3};
		int k2 = 3;
		int[] arr3 = {1, 2, 3};
		int k3 = 5;
		printArray(q5.rotateArray(arr1, k1));					//{4, 6, 9, 8, 3, -2, 1}
		printArray(q5.rotateArray(arr2, k2));					//{7, 9, 3, -2, 3, 1, 4, 6, 2, 8}
		printArray(q5.rotateArray(arr3, k3));					//{2, 3, 1}
		
	}

	public static void main(String args[]) {
		
		System.out.println("Question 1 results");
		countElementsGreaterThanItself();
		System.out.println();
		System.out.println("Question 2 results");
		checkPairExists();
		System.out.println();
		System.out.println("Question 3 results");
		reverseEntireArray();
		System.out.println();
		System.out.println("Question 4 results");
		reverseEntireArrayFromStartToEndIndex();
		System.out.println();
		System.out.println("Question 5 results");
		reverseArrayClockwiseKTimes();
		
	}
	
}

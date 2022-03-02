package week3.december1.classwork;

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
	
	public static void sumOfGivenRange() {
		
		Question1 q1 = new Question1();
		int[] Arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
		int[][] Queries = {{4, 8}, {2, 7}, {1, 3}, {0, 4}, {7, 7}};
		printArray(q1.rangeSum(Arr, Queries));			//{9, 12, 12, 14, -9}
		
	}
	
	public static void countEquilibriumIndexes() {
		
		Question2 q2 = new Question2();
		int[] Arr1 = {-7, 1, 5, 2, -4, 3, 0};
		int[] Arr2 = {3, -1, 2, -1, 1, 2, 1};
		System.out.println(q2.equilibriumIndex(Arr1));	//2
		System.out.println(q2.equilibriumIndex(Arr2));	//2
		
	}
	
	public static void sumOfEvenIndexInGivenRange() {
		
		Question3 q3 = new Question3();
		int[] Arr = {3, 4, -2, 8, 6, 2, 1, 3};
		int[][] Queries = {{2, 5}, {3, 7}, {0, 7}, {7, 7}, {4, 4}};
		printArray(q3.evenIndexRangeSum(Arr, Queries));	//{4, 7, 8, 0, 6}
		
	}
	
	public static void sumOfOddIndexInGivenRange() {
		
		Question4 q4 = new Question4();
		int[] Arr = {3, 4, -2, 8, 6, 2, 1, 3};
		int[][] Queries = {{2, 5}, {3, 7}, {0, 7}, {7, 7}, {4, 4}};
		printArray(q4.oddIndexRangeSum(Arr, Queries));	//{10, 13, 17, 3, 0}
		
	}
	
	public static void countSpecialIndex() {
		
		Question5 q5 = new Question5();
		int[] Arr = {4, 3, 2, 7, 6, -2};
		System.out.println(q5.specialIndex(Arr));		//2
		
	}
	
	public static void main(String[] args) {

		System.out.println("Question 1 results");
		sumOfGivenRange();
		System.out.println();
		System.out.println("Question 2 results");
		countEquilibriumIndexes();
		System.out.println();
		System.out.println("Question 3 results");
		sumOfEvenIndexInGivenRange();
		System.out.println();
		System.out.println("Question 4 results");
		sumOfOddIndexInGivenRange();
		System.out.println();
		System.out.println("Question 5 results");
		countSpecialIndex();
		
	}

}

package week15.march2.classwork;

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
	
	public static void kthLargestElement() {
		
		Question1 q1 = new Question1();
		int[] Arr = {5, 8, 1, 3, 15, 7, 2};
		int k = 3;
		System.out.println(q1.stableSort(Arr, k));			//7
		
	}
	
	public static void selectionSort() {
		
		Question2 q2 = new Question2();
		int[] Arr = {5, 8, 1, 3, 15, 7, 2};
		printArray(q2.selectionSort(Arr));					//{1, 2, 3, 5, 7, 8, 15}
		
	}
	
	public static void bubbleSort() {
		
		Question3 q3 = new Question3();
		int[] Arr = {5, 8, 1, 3, 15, 7, 2};
		printArray(q3.bubbleSort(Arr));						//{1, 2, 3, 5, 7, 8, 15}
		
	}
	
	public static void insertionSort() {
		
		Question4 q4 = new Question4();
		int[] Arr = {5, 8, 1, 3, 15, 7, 2};
		printArray(q4.insertionSort(Arr));					//{1, 2, 3, 5, 7, 8, 15}
		
	}
	
	public static void findSmallestSubarrayToSort() {
		
		Question5 q5 = new Question5();
		int[] Arr = {1, 3, 4, 2, 5, 6};
		printArray(q5.findSmallestSubarray(Arr));			//{3, 4, 2}
		
	}
	
	public static void sortGivenArray() {
		
		Question6 q6 = new Question6();
		int[] Arr = {3, 9, 2, 4, 12, 11, 18, 15};
		printArray(q6.sortArray(Arr));						//{2, 3, 4, 9, 11, 12, 15, 18}
		
	}

	public static void main(String[] args) {

		System.out.println("Question 1 results");
		kthLargestElement();
		System.out.println();
		System.out.println("Question 2 results");
		selectionSort();
		System.out.println();
		System.out.println("Question 3 results");
		bubbleSort();
		System.out.println();
		System.out.println("Question 4 results");
		insertionSort();
		System.out.println();
		System.out.println("Question 5 results");
		findSmallestSubarrayToSort();
		System.out.println();
		System.out.println("Question 6 results");
		sortGivenArray();
		
	}

}

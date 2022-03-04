package week3.december4.classwork;

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
	
	public static void countPairsIJ() {
		
		Question1 q1 = new Question1();
		String S1 = "baagdcag";
		String S2 = "bcaggaag";
		String S3 = "acgdgag";
		System.out.println(q1.countPairs(S1));	//5
		System.out.println(q1.countPairs(S2));	//5
		System.out.println(q1.countPairs(S3));	//4
		
	}
	
	public static void leadersInAnArray() {
		
		Question2 q2 = new Question2();
		int[] Arr1 = {15, -1, 7, 2, 5, 4, 2, 3};
		int[] Arr2 = {10, 7, 9, 3, 2, 4};
		int[] Arr3 = {8, -2, 4, 7, 6, 5, 1};
		System.out.println(q2.leaders(Arr1));	//5
		System.out.println(q2.leaders(Arr2));	//3
		System.out.println(q2.leaders(Arr3));	//5
		
	}
	
	public static void closestMinMax() {
		
		Question3 q3 = new Question3();
		int[] Arr1 = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
		int[] Arr2 = {2, 2, 6, 4, 5, 1, 5, 2, 6 , 4, 1};
		int[] Arr3 = {1, 6, 4, 2, 7, 7, 5, 1, 3, 1, 1, 5};
		System.out.println(q3.minMax(Arr1));	//4
		System.out.println(q3.minMax(Arr2));	//3
		System.out.println(q3.minMax(Arr3));	//3
		
	}

	public static void main(String[] args) {

		System.out.println("Question 1 results");
		countPairsIJ();
		System.out.println();
		System.out.println("Question 2 results");
		leadersInAnArray();
		System.out.println();
		System.out.println("Question 3 results");
		closestMinMax();
		System.out.println();
		
	}

}

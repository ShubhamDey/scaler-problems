package week4.december6.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverCode {
	
	public static void question1() {
		
		MaxSumContigiousSubarray q1 = new MaxSumContigiousSubarray();
		List<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, -10));
		List<Integer> A2 = new ArrayList<Integer>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
		System.out.println(q1.maxSubArray(A1));			//10
		System.out.println(q1.maxSubArray(A2));			//6
		
	}
	
	public static void question2() {
		
		SumOfAllSubarrays q2 = new SumOfAllSubarrays();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(2, 1, 3));
		System.out.println(q2.subarraySum(A1));			//20
		System.out.println(q2.subarraySum(A2));			//19
		
	}
	
	public static void question3() {
		
		SubarrayWithLeastAverage q3 = new SubarrayWithLeastAverage();
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(3, 7, 90, 20, 10, 50, 40));
		int B1 = 3;
		ArrayList<Integer> A2 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 20, -10, 0, 12));
		int B2 = 2;
		System.out.println(q3.solve(A1, B1));			//3
		System.out.println(q3.solve(A2, B2));			//4
		
	}
	
	public static void question4() {
		
		MaximumSubarrayEasy q4 = new MaximumSubarrayEasy();
		int A1 = 5;
		int B1 = 12;
		ArrayList<Integer> C1 = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 4, 5));
		int A2 = 3;
		int B2 = 1;
		ArrayList<Integer> C2 = new ArrayList<Integer>(Arrays.asList(2, 2, 2));
		System.out.println(q4.maxSubarray(A1, B1, C1));	//12
		System.out.println(q4.maxSubarray(A2, B2, C2));	//0
		
	}

	public static void main(String[] args) {

		System.out.println("Max Sum Contiguous Subarray");
		question1();
		System.out.println();
		System.out.println("Sum of All Subarrays");
		question2();
		System.out.println();
		System.out.println("Subarray with least average");
		question3();
		System.out.println();
		System.out.println("Maximum Subarray Easy");
		question4();
		
	}

}

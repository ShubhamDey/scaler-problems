package week4.december6.classwork;

public class DriverCode {
	
	public static void printAllSubarrays() {
		
		Question1 q1 = new Question1();
		int[] A = {2, 8, 9};
		q1.subarray(A);									//[2] [2, 8] [2, 8, 9] [8] [8, 9] [9]
		
	}
	
	public static void printIndexAllSubarraysOfKLength() {
		
		Question2 q2 = new Question2();
		int[] A = {3, 4, 2, -1, 6, 7, 8, 9, 3, 2, -1, 4};
		int K1 = 2, K2 = 6;
		q2.lengthKSubarrays(A, K1);						//[0, 1] [1, 2] [2, 3] [3, 4] [4, 5] [5, 6] [6, 7] [7, 8] [8, 9] [9, 10] [10, 11]
		q2.lengthKSubarrays(A, K2);						//[0, 5] [1, 6] [2, 7] [3, 8] [4, 9] [5, 10] [6, 11]
		
	}
	
	public static void maxSubarraySumOfKLength() {
		
		Question3 q3 = new Question3();
		int[] A = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
		int K = 5;
		System.out.println(q3.maxSubarraySum(A, K));	//16
		
	}
	
	public static void printAllSubarraySums() {
		
		Question4 q4 = new Question4();
		int[] A = {3, -1, 0, 2};
		q4.subarraySum(A);								//3, 2, 2, 4, -1, -1, 1, 0, 2, 2
		
	}
	
	public static void allSubarraySumFromIndex2() {
		
		Question5 q5 = new Question5();
		int[] A = {7, 3, 2, -1, 6, 8, 2};
		q5.subarraySumIndex(A);							//2, 1, 7, 15, 17
		
	}
	
	public static void howManySubarraysIndexIPresent() {
		
		Question6 q6 = new Question6();
		int[] A = {3, -2, 4, -1, 2, 6};
		int I = 3;
		System.out.println(q6.subarrayIndex(A, I));		//12
		
	}
	
	public static void allSubarraySumContributionTechnique() {
		
		Question7 q7 = new Question7();
		int[] A = {3, -2, 4, -1, 2, 6};
		System.out.println(q7.contributionTech(A));		//90
		
	}

	public static void main(String[] args) {

		System.out.println("Question 1 results");
		printAllSubarrays();
		System.out.println();
		System.out.println("Question 2 results");
		printIndexAllSubarraysOfKLength();
		System.out.println();
		System.out.println("Question 3 results");
		maxSubarraySumOfKLength();
		System.out.println();
		System.out.println("Question 4 results");
		printAllSubarraySums();
		System.out.println();
		System.out.println("Question 5 results");
		allSubarraySumFromIndex2();
		System.out.println();
		System.out.println("Question 6 results");
		howManySubarraysIndexIPresent();
		System.out.println();
		System.out.println("Question 7 results");
		allSubarraySumContributionTechnique();
		
	}

}

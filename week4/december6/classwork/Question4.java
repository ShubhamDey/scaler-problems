package week4.december6.classwork;

/*
 * Given N array elements, print all subarray sums.
 */

public class Question4 {

	public void subarraySum(int[] Array) {
		
		for(int i = 0 ; i < Array.length ; i++) {
			int sum = 0;
			for(int j = i ; j < Array.length ; j++) {
				sum += Array[j];
				System.out.print(sum + " ");
			}
		}
		System.out.println();
		
	}
	
	public void subarraySumAlternative1(int[] Array) {
		
		int[] prefix = new int[Array.length];
		prefix[0] = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			prefix[i] = prefix[i - 1] + Array[i];
		}
		//Need to solve with prefix sum
		
	}
	
	public void subarraySumAlternative2(int[] Array) {
		
		for(int i = 0 ; i < Array.length ; i++) {
			for(int j = i ; j < Array.length ; j++) {
				int sum = 0;
				for(int k = i ; k < j ; k++) {
					sum += Array[k];
				}
				System.out.print(sum + " ");
			}
		}
		System.out.println();
		
	}

}

package week4.december6.classwork;

/*
 * Find max subarray sum with length = K.
 */

public class Question3 {
	
	public int maxSubarraySum(int[] Array, int K) {
		
		int sum = 0;
		for(int i = 0 ; i < K ; i++) {
			sum += Array[i];
		}
		int answer = sum;
		for(int i = K ; i < Array.length ; i++) {
			sum += Array[i] - Array[i - K];
			answer = Math.max(answer, sum);
		}
		return answer;
		
	}
	
	public int maxSubarraySumAlternative1(int[] Array, int K) {
		
		int[] prefix = new int[Array.length];
		prefix[0] = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			prefix[i] = prefix[i - 1] + Array[i];
		}
		int answer = 0, sum = 0;
		for(int i = 0 ; i < Array.length - K + 1 ; i++) {
			if(i == 0) {
				sum = prefix[K - 1];
			}
			else {
				sum = prefix[i + K - 1] - prefix[i - 1];
			}
			answer = Math.max(answer, sum);
		}
		return answer;
		
	}
	
	public int maxSubarraySumAlternative2(int[] Array, int K) {
		
		int answer = 0;
		for(int i = 0 ; i < Array.length - K + 1 ; i++) {
			int sum = 0;
			for(int j = i ; j < i + K ; j++) {
				sum += Array[j];
			}
			answer = Math.max(answer, sum);
		}
		return answer;
		
	}

}

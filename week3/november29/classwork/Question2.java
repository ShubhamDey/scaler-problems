package week3.november29.classwork;

/*
 * Given N array elements, check if there exists a pair i, j such that ar[i] + ar[j] == k and i != j
 */

public class Question2 {

	public boolean checkPair(int[] Array, int K) {
		
		for(int i = 0 ; i < Array.length ; i++) {
			for(int j = 0 ; j < Array.length ; j++) {
				if(i == j) {
					continue;
				}
				if(Array[i] + Array[j] == K) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean checkPair1(int[] Array, int K) {
		
		//checking only upper triangular matrix pairs
		for(int i = 0 ; i < Array.length - 1 ; i++) {
			for(int j = i + 1 ; j < Array.length ; j++) {
				if(Array[i] + Array[j] == K) {
					return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean checkPair2(int[] Array, int K) {
		
		//checking only lower triangular matrix pairs
		for(int i = 0 ; i < Array.length ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if(Array[i] + Array[j] == K) {
					return true;
				}
			}
		}
		return false;
		
	}
	
}

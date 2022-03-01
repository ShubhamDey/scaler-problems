package week3.november29.assignment;

/*
 * You are given an integer A A and an integer B. You have to print the same A after rotating it B times towards right.
 * 
 * NOTE: You can use extra memory.
 */

public class RotationGame {

	public int[] solve(int[] A, int B) {
		
			if(B > A.length) {
				B = B % A.length;
			}
			int start = 0, end = A.length - 1;
			while(start <= end) {
				int temp = A[start];
				A[start] = A[end];
				A[end] = temp;
				start++;
				end--;
			}
			start = 0;
			end = B - 1;
			while(start <= end) {
				int temp = A[start];
				A[start] = A[end];
				A[end] = temp;
				start++;
				end--;
			}
			start = B;
			end = A.length - 1;
			while(start <= end) {
				int temp = A[start];
				A[start] = A[end];
				A[end] = temp;
				start++;
				end--;
			}
			return A;
		
	}
	
}

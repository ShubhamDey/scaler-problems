package week3.december4.assignment;

/*
 * You have given a string A having Uppercase English letters.
 * You have to find how many times subsequence "AG" is there in the given string.
 * 
 * NOTE: Return the answer modulo 10^9 + 7 as the answer can be very large.
 */

public class SpecialSubsequencesAG {
	
	public int solve(String A) {
		
		int answer = 0, count = 0;
		for(int i = 0 ; i < A.length() ; i++) {
			if(A.charAt(i) == 'A') {
				count++;
			}
			if(A.charAt(i) == 'G') {
				answer += count;
			}
		}
		return answer % 1000000007;
		
	}

}

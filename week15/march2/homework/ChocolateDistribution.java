package week15.march2.homework;

import java.util.ArrayList;

/*
 * Given an array A of N integers where each value represents number of chocolates in a packet. i-th can have A[i] number of chocolates.
 * There are B number students, the task is to distribute chocolate packets following below conditions:
 * 
 * 1) Each student gets one packet
 * 2) The difference between the number of chocolates in packet with maximum chocolates and
 *    packet with minimum chocolates given to the students is minimum.
 *    
 * Return the minimum difference (that can be achieved) between maximum and minimum number of chocolates distributed.
 */

public class ChocolateDistribution {
	
	public int solve(ArrayList<Integer> A, int B) {
    
		if(B == 0 || A.isEmpty()) {
			return 0;
		}
		for(int i = 0 ; i < A.size() ; i++) {
			for(int j = 0 ; j < A.size() - 1 ; j++) {
				if(A.get(j) > A.get(j + 1)) {
					int temp = A.get(j);
					A.set(j, A.get(j + 1));
					A.set(j + 1, temp);
				}
			}
		}
		int answer = Integer.MAX_VALUE;
		int i = 0, j = i + B - 1;
		while(i < A.size() && j < A.size()) {
			answer = Math.min(answer, A.get(j) - A.get(i));
			i++;
			j++;
		}
		return answer;
		
	}

}

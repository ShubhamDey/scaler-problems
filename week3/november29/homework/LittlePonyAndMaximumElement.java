package week3.november29.homework;

import java.util.ArrayList;

/*
 * Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
 * 
 * He wants your help for finding out the minimum number of operations required such that the maximum element of the resulting array is B.
 * If it is not possible then return -1.
 */

public class LittlePonyAndMaximumElement {

	public int solve(ArrayList<Integer> A, int B) {
		
		boolean flag = false;
		int operations = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			if(A.get(i) > B) {
				operations++;
			}
			if(A.get(i) == B) {
				flag = true;
			}
		}
		if(flag == true) {
			return operations;
		}
		else {
			return -1;
		}
		
	}
	
}

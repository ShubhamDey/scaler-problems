package week3.december4.homework;

import java.util.ArrayList;

/*
 * You are given an integer array A.
 * 
 * Decide whether it is possible to divide the array into one or more subarrays of even length
 * such that the first and last element of all subarrays will be even.
 * 
 * Return "YES" if it is possible; otherwise, return "NO" (without quotes).
 */

public class EvenSubarrays {
	
	public String solve(ArrayList<Integer> A) {
		
		if(A.size() % 2 == 0){
            if(A.get(0) % 2 == 0 && A.get(A.size() - 1) % 2 == 0)
                return "YES";
            else
                return "NO";
        }
        else{
            return "NO";
        }
		
	}

}

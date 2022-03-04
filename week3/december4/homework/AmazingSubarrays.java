package week3.december4.homework;

/*
 * You are given a string S, and you have to find all the amazing substrings of S.
 * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 * 
 * NOTE : Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
 */

public class AmazingSubarrays {
	
	public int solve(String A) {
		
		int count = 0;
        for(int i = 0 ; i < A.length() ; i++){
            char c = A.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count += (A.length() - i);
            }
        }
        return count % 10003;
		
	}

}

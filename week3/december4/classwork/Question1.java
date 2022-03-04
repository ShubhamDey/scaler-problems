package week3.december4.classwork;

/*
 * Given a string S, calculate number of pairs (i, j) such that, i < j and S[i] = 'a' and S[j] = 'g'.
 * 
 *  NOTE: All characters are lowercase
 */

public class Question1 {
	
	public int countPairs(String S) {
		
		//carrying forward number of a's
		int answer = 0, count = 0;
		for(int i = 0 ; i < S.length() ; i++) {
			if(S.charAt(i) == 'a') {
				count++;
			}
			if(S.charAt(i) == 'g') {
				answer += count;
			}
		}
		return answer;
		
	}
	
	public int countPairsAlternative1(String S) {
		
		//carrying forward number of g's
		int answer = 0, count = 0;
		for(int i = S.length() - 1 ; i >= 0  ; i--) {
			if(S.charAt(i) == 'g') {
				count++;
			}
			if(S.charAt(i) == 'a') {
				answer += count;
			}
		}
		return answer;
		
	}
	
	public int countPairsAlternative2(String S) {
		
		//For each 'a', calculating number of g's to the right of it.
		int answer = 0;
		for(int i = 0 ; i < S.length() - 1 ; i++) {
			if(S.charAt(i) == 'a') {
				for(int j = i + 1 ; j < S.length() ; j++) {
					if(S.charAt(j) == 'g') {
						answer++;
					}
				}
			}
		}
		return answer;
		
	}

}

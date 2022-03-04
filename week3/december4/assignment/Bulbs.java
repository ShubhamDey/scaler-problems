package week3.december4.assignment;

import java.util.ArrayList;

/*
 * N light bulbs are connected by a wire.
 * 
 * Each bulb has a switch associated with it; however, due to faulty wiring,
 * a switch also changes the state of all the bulbs to the right of the current bulb.
 * 
 * Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
 * 
 * You can press the same switch multiple times.
 * 
 * Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */

public class Bulbs {
	
	public int bulbs(ArrayList<Integer> A) {
		
		boolean flip = false;
		int count = 0;
		for(int i = 0 ; i < A.size() ; i++) {
			int currentBulb = A.get(i);
			if(currentBulb == 0 && flip == false) {
				count++;
				flip = true;
			}
			if(currentBulb == 1 && flip == true) {
				count++;
				flip = false;
			}
		}
		return count;
		
	}

}

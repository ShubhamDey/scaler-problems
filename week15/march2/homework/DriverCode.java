package week15.march2.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverCode {
	
	public static void question1() {
		
		ChocolateDistribution q1 = new ChocolateDistribution();
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
		int B = 5;
		System.out.println(q1.solve(A, B));		//6
		
	}

	public static void main(String[] args) {
		
		System.out.println("Chocolate Distribution");
		question1();

	}

}

package com.datastructure.greatlearning;

public class TowerOfHanoiImplementation {

	public static void main(String[] args) {
		int n=3;
		shiftDisk(n,'A','B','C');

	}

	private static void shiftDisk(int n, char TA, char TB, char TC) {
		
		if(n==1){
			System.out.println("disk "+n+" is shifted from "+ TA+" to "+TC);
		}
		else{
			shiftDisk(n-1, TA, TC, TB);
			System.out.println("Disk "+n+" is shfted from " +TA+" to "+TC);
			shiftDisk(n-1, TB, TA, TC);
		}
	}

}

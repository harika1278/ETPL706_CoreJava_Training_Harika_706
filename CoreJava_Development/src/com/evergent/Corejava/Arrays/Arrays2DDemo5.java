package com.evergent.Corejava.Arrays;

public class Arrays2DDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[6][6];
		int n = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				arr[i][j] = n;
				n++;
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

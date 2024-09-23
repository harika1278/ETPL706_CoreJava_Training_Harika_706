package com.evergent.Corejava.LogicalProgramming1;

class SortData {
	int n, temp, i, j;

	public void asec(int num[]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Assending Order");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}

	public void desc(int num[]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Descending Order");

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}
}

public class Sort_Asec_Desc {
	public static void main(String[] args) {
		SortData mysort = new SortData();
		int arr[] = { 13, 22, 27, 11, 4 };
		mysort.asec(arr);
		mysort.desc(arr);
	}
}

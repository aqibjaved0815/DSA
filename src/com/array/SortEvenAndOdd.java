package com.array;

public class SortEvenAndOdd {

	public static void main(String[] args) {

		long a[] = { 1, 2, 3, 5, 4, 7, 10 };
		long n = 7;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				if (a[i] % 2 != 0) {
					if (a[i] < a[j]) {
						long temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}

				if (a[i] % 2 == 0 && a[j] % 2 != 0) {

					long temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
				
				if(a[i]%2==0 && a[i]>a[j]) {
					long temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}

			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

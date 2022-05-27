package com.array;

public class ArrayBasics {

// Calculate sum of an Array
	public static int arraySum(int nums[]) {

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];
		}

		return sum;
	}

// Calculate average of an Array
	public static double avarage(int nums[]) {
		double sum = ArrayBasics.arraySum(nums);
		double avg = sum / nums.length;

		return avg;
	}

// Calculate Maximum element present in an Array  
	public static int maxElement(int[] nums) {

		int maxElement = nums[0];

		for (int i = 0; i < nums.length; i++) {

			if (maxElement < nums[i]) {
				maxElement = nums[i];
			}
		}
		return maxElement;
	}

// Calculate Minimum element present in an Array
	public static int minElement(int[] nums) {

		int minElement = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (minElement > nums[i]) {
				minElement = nums[i];
			}
		}
		return minElement;
	}

// Reverse an Array  // 30, 5, 20, 25, 10

	public static void reverse(int[] nums) {

		int[] reverseArray = new int[nums.length];
		int j = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			reverseArray[j] = nums[i];
			j++;
		}
		System.out.print("Reverse Array -> ");
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.print(reverseArray[i] + " ");
		}
	}

// Search a number in an Array

	public static String serach(int nums[], int value) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == value) {
				return "Number is present in an Array";
			}
		}
		return "Number is not present in an Array";
	}

// Insert an element in given index
	public static int[] insert(int[] nums, int index, int value) {
		int[] containValueArray = null;
		if (index != -1 && index <= nums.length) {
			containValueArray = new int[nums.length + 1];
			int temp = nums[nums.length - 1];
			if (index == nums.length) {
				temp = value;
			}
			for (int i = 0; i < containValueArray.length;) {
				boolean check = false;

				if (i == index) {
					containValueArray[i] = value;
					i++;
					if (i < containValueArray.length) {
						containValueArray[i] = nums[index];
						i++;
					}
					check = true;
				}

				if (i < containValueArray.length) {
					if (check) {
						containValueArray[i] = nums[i - 1];
						i++;
					}
					if (i == nums.length) {
						containValueArray[i] = temp;
						return containValueArray;
					}
				}
				if (i < containValueArray.length) {

					containValueArray[i] = nums[i];
					i++;
				}
			}

		}
		return containValueArray;
	}
	
	
	public static int[] pos(int arr[], int pos, int value) {
		
		int i;
		int n=arr.length;
		 int newarr[] = new int[n + 1];
		 
		 for (i = 0; i < n + 1; i++) {
	            if (i < pos - 1)
	                newarr[i] = arr[i];
	            else if (i == pos - 1)
	                newarr[i] = value;
	            else
	                newarr[i] = arr[i - 1];
	        }
	        return newarr;
	    }
}
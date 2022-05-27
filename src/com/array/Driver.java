package com.array;

public class Driver {
	
	public static void main(String[] args) {
		
		int[] nums = new int[4];

		nums[0] = 04;
		nums[1] = 10;
		nums[2] = 25;
		nums[3] = 35;
		
//        int sum = ArrayBasics.arraySum(nums);
//        System.out.println("Array sum -> "+sum);
//        
//        double avg  =ArrayBasics.avarage(nums);
//        System.out.println("Array avg -> "+avg);
//        
//        int max  =ArrayBasics.maxElement(nums);
//        System.out.println("Max Element -> "+max);
//        
//        int min  =ArrayBasics.minElement(nums);
//        System.out.println("Min Element -> "+min);
//        
//        ArrayBasics.reverse(nums);
//        System.out.println();
//        String value = ArrayBasics.serach(nums, 27);
//        System.out.println(value);
       
		int []array = ArrayBasics.pos(nums, 2, 29);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
    }

}

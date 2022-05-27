package com.array;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		
		int a[]= {4, 2, 4, 1, 6};
		
		boolean result=false;
		
		for(int i=0;i<a.length-1;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				
				
				sum+=a[j];
				
				if(sum==0 ||a[i]==0 || a[j]==0) {
					System.out.println("true");
					result=true;
					return;
				}
			}
		}
		System.out.println(result);

	}

}

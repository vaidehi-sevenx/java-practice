package javaPractice;

import java.util.Arrays;

public class ThirdLargestNumber {
	public static int getThirdLargestNumber(int[] a,int total) {
		Arrays.sort(a);
		return a[total-3];
	}
	public static void main(String args[]) {
		int a[]= {2,3,6,8,9,1,5,7};
		int b[]= {11,22,44,55,66,33};
		System.out.println("Third Largest number is: "+getThirdLargestNumber(a,8));
		System.out.println("third Largest number is: "+getThirdLargestNumber(b,6));
	}

}

package week1.day2assignment;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[]num= {2,5,7,7,9,2,3};
		
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate value: "+num[j] );
				}
			}
		}
		System.out.println("===========================");
		
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++) {
			if(num[i]==num[i+1]) {
				System.out.println("Duplicate value: "+num[i+1]);
			}
		}
		

	}

}

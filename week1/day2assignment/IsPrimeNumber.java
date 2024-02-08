package week1.day2assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int input=7,flag=0;
		if(input==0||input==1) {
			System.out.println(input+" is not a Prime number");
		}else {
			for(int i=2;i<=input-1;i++) {
				if(input%i==0) {
					System.out.println(input+" is not a Prime number");
					flag=1;
					break;
					
				}
			}if(flag==0) {
				System.out.println(input+" is a Prime number");
			}
		}
	}
}

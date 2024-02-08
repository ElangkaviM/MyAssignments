package week1.day2assignment;

public class Palindrom {

	public static void main(String[] args) {
		Integer input = 32323;
		
		check(input);

	}

	private static void check(int input) {
		// TODO Auto-generated method stub
		int r,out=0;
		int temp=input;
		while(input>0) {
			r=input%10;
			out=(out*10)+r;
			input=input/10;
		}
		
		if(temp==out) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		
	}

}


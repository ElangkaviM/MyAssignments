package week1.day2assignment;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		ForLoop forLoop = new ForLoop();
		forLoop.printnumber(n);
	}
		
		public void printnumber( int n) {
			for(int i=1;i<=n;i++) {
				System.out.println(i);
			}
		
	}

}


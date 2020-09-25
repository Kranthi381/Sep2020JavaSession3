package SeleniumSession;

public class StringConcatenation {

	public static void main(String[] args) {
	
		double d = 12.33;
		double d1 =23.33;
		
		int a=100;
		int b=200;
		
		String z="Hello";
		String y="Testing";
		
		System.out.println(d+d1);
		System.out.println(a+b);
		System.out.println(z+y);
		
		System.out.println(a+b+z+y);
		System.out.println(z+y+a+b);
		System.out.println(z+y+(a+b));
		System.out.println(z+y+d+d1+a+b);
		System.out.println(z+y+(d+d1)+a+b);

	}

}

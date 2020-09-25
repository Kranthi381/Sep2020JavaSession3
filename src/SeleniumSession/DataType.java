package SeleniumSession;

public class DataType {

	public static void main(String [] args) {
		
		//comments entered by kranthi. -single line
		/*
		 * Multiline comments
		 * sep 22, 2020
		 * Data Types
		 * 
		 */
		
		//Integer Family - byte ,short , int, long
		//Floating Family - float, double
		//character - char
		//boolean - true, false
		//string
		
		//1. byte
		//size: -120 to 127
		//size: 1 byte = 8 bits
		byte b=100;
		System.out.println(b);
		byte b1=20;
		byte b2=0;
		byte b3=-90;
		byte b4=20;
		//syso+cntl+space
		System.out.println(b3+b4);
		System.out.println(b1+b2);
		
		//2. short
		//range: -32760 to 32767
		//size : 2 bytes = 16 bytes
		short s1 =10;
		short s2 = -1000;
		short s3 = 100;
		System.out.println(s1);
		System.out.println(s2-s3);
		
		//3. int
		//range: -2147483648 to 2147483647
		//size: 4 bytes = 32 bits
		
		int i =10;
		int total =20000;
		System.out.println(i);
		System.out.println(total);
		
		//4. long
		//range:
		//size:8 bytes = 64 bits
		
		long l = 803880343;
		System.out.println(l);
		
		//5.Float
		//range: 7 digits after decimal place
		//size: 4 bytes = 32 bits
		
		float f=12.33f;
		System.out.println(f);
		float f1 = (float) 23.44;
		System.out.println(f+f1);
		float  f2 = 100;//100.0
		System.out.println(f2);
		
		//6.double
		//range: 15 digits after decimal
		//size:8 bytes =64 bits
		
		double d= 23.33;
		double d1 = 34.79734;
		System.out.println(d);
		System.out.println(d1);
		
		//7.char
		//range:2 bytes = 16 bits
		//size:charcters have single digit values
		char ch = 'a';
		char ch1 = 'b';
		char ch2 ='1';
		char c3 = 's';
		
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch+ch1);
		
		//aacii values
		//a-z:97-122
		//A-z:65-90
		//0-9:48-57
		
		//8.boolean
		//size : 1 bit
		//true or flase
		
		boolean flag=true;
		boolean test = false;
		System.out.println(flag);
		System.out.println(test);
		
		
		//9.String
		//String -> a double quoted value in java
		//string is not a data type in java. It is a class.
		//all the classes in java starts with upper case
		
		String str ="Hello world";
		System.out.println(str);
		String str1 = "100";// here 100 is a string not an interger"
		System.out.println(str+str1);
		//multiple properties of print statement
		System.out.println(1000);
		System.out.println(str);
		System.out.println("hello world");
		System.out.println("testing" +100);
		System.out.println("hello" + "World");
		System.out.println("Hello " + "world");
		System.out.println("Hello" + " World");
		System.out.println("Hello" + " " + "World");
		
		System.out.print(80);//print and stay in the same line
		System.out.println(60);//prints and generate a new line
		System.out.println(70);
		System.err.println("print some thing in red");//print something in red like in exception habdling
		
		
				
		
	}
}

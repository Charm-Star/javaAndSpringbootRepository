package ch2;

public class FuntionTest {

	public static int addNum(int num1 , int num2) {
		int result;
		return num1+num2;
	}
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcsum() {
		int sum = 0;
		for(int i = 0 ; i <= 100 ; i++) {
			sum+=i;

		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello("안녕하세요");
		int s1 = 12 ; 
		int s2 = 23 ; 
		System.out.println(addNum(s1, s2));

	}

}

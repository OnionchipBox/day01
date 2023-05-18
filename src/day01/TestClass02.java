package day01;

public class TestClass02 {
	public static void main(String[] args) {
//		System.out.println(100+100);
//		System.out.println("백"+100);
//		System.out.println("app"+"le");
//		System.out.println("I\t"+"am\t"+"your\t"+"father");
//		System.out.println("I "+"am "+"your "+"father ");
		
		char ch = 'A';
		int num = 123;
		System.out.println("연산 전 ch :"+ch);
		System.out.println("연산 후 num : "+num);
		ch = 'B';
		num = num + 123;
		System.out.println("연산 후 : "+ch);
		System.out.println("연산 후 : "+num);
		ch = 'a';
		num = 5;
		System.out.println("ch+num => "+(ch+num));
		
	}
}

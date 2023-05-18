package day01;

public class TestClass03 {
	public static void main(String[] args) {
		int num = 65;
		System.out.println( num );
		System.out.println( (char)num ); // 아스키코드 A = 65
		
		char ch = 'A', ch3;
		int ch2;
		
		num = 5;
		ch2 = ch + num;
		ch3 = (char)(ch + num);
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		float fl = (float)1.11;
		float fl_2 = 1.11f;
		double dou = 1.11;
		
		String name = "홍";
		String name_2 = "길";
		String name_3 = "동";
		
		System.out.println(name+name_2+name_3);
		
		
	}
}

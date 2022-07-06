
public class Var2 {
	public static void main(String [] args) {
		
		float num = 2.1234F;
		System.out.println(num);
		
		double num2 = 2.1234;
		System.out.println(num);
		//변수에는 같은 타입만 담을 수 있다
		float num3 = num;
		
		System.out.println(num3);
		System.out.println(12345.3);
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = kor + math + eng;
		
		kor = 50;
		math = 50;
		eng = 50;
		total = kor + math + eng;
		System.out.println(total);
		
		char ch = 'a';
		System.out.println(ch);
		
		char ch2 = ' ';//초기값
		double d1 = 0.0;//초기값
		float d2 = 0.0F;//초기값
		
		boolean check = true;
		check = false;
		
		boolean check2 = false;//초기값
		
		//변수 선언 공식
		//데이터타입명 변수명 = 할당값
		String name = "김남진";
		String name2 = new String();
		
		System.out.println('b');
		System.out.println('1');
		System.out.println("abc");
		
		
		
	}

}

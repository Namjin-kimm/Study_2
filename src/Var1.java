
public class Var1 {
	
	public static void main (String [] args) {
		//변수 선언 공식
		//데이터타입 변수명
		byte num;
		//대입 연산자 '=' : 오른쪽의 결과를 왼쪽에 대입하라는 의미
		num = 10;
		System.out.println(num);
		num = 35;
		System.out.println(num);
		//num = 3000000;
		// byte가 담을 수 있는 숫자의 크기는 -128 ~ 127 때문에 오류가 난다
		int num2;
		num2 = 4000000;
		//int는 4Byte이므로 할당된 4칸에 4000000을 0과 1로 담으라는 의미이다
		//시작점의 주소는 num2라는 의미
		long num3;
		num3 = 2000000000;
		
		byte num4 = 100+10;
		//num4 = num4 +10;
		//오류가 발생한다
		long num5 = 100L;
		//long num5 = 2L; 중복선언 에러
		
		int num6;
		//초기화
		//모든 변수는 초기화 하지 않으면 사용시 에러가 발생한다
		//int num6; 이건 변수를 선언만 한 것이다, 초기화를 해줘야한다
		num6 = 10;
		//이렇게 숫자를 할당하는 것을 초기화라고 한다.
		System.out.println(num6);
		
		int num7 = 10;
		
		
		
	}

}

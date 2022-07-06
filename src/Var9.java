
public class Var9 {

	public static void main(String[] args) {
		System.out.println("Start");
		//편의점 계산 자동화 프로그램
		
		//물건 가격의 총합계
		int price = 34500;
		
		//손님이 낸 돈
		int money = 50000;
		
		//잔돈 계산
		int jandon = money - price;//15500
		
		//만원짜리 갯수를 담을 변수
		int man = jandon/10000;
		jandon -= man*10000;
		System.out.println(man);
		System.out.println(jandon);
		
		//천원짜리 갯수를 담을 변수
		int chon = jandon/1000;
		jandon -= chon*1000;
		System.out.println(chon);
		System.out.println(jandon);
		
		//int chon = jandon%10000/1000;
		//이런 방식으로도 할 수 있다 10000으로 나눈 나머지를 1000으로 나누는 방법
		
		
		//백원짜리 갯수를 담을 변수
		int baek = jandon/100;
		jandon -= baek*100;
		System.out.println(baek);
		System.out.println(jandon);
		
		//십원짜리 갯수를 담을 변수
		int sib = jandon % 100/10;
		System.out.println(sib);
		
		System.out.println("만원 :" + man + "장," + "천원 :" + chon + "장," );
		
		
		
		
		
	}

}

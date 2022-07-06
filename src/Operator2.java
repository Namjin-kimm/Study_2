import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("나이를 입력하세요");
		 //1. 10대 유무를 판별해보세요
		 
		int age = sc.nextInt();
		String result = age >= 10 && age <20 ? "10대 입니다" : "10대가 아닙니다";
		System.out.println(result);
				
		System.out.println("\n물건의 가격을 입력하세요");
		//2. 물건의 가격이 30000 이상이면 배송료가 무료
		// 아니면 배송료가 가격의 10%로 책정
		// 최종 지불 비용을 출력하세요
		
		int price = sc.nextInt();
		String delivery = price >= 30000 ? "" + price : "최종비용은" + (int)(price * 1.1) + "원 입니다";
		System.out.println(delivery);
				
	}

}

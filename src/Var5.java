import java.util.Scanner;

public class Var5 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력 받은 수를 저장할 변수
		int num = 0;
		
		//합계를 저장할 변수
		int sum = 0;
		System.out.println("첫번째 숫자 입력");
		num = sc.nextInt();//3
		sum = sum + num;
		
		System.out.println("두번째 숫자 입력");
		num = sc.nextInt();//5
		sum = sum + num;
		
		System.out.println("세번째 숫자 입력");
		num = sc.nextInt();
		sum = sum + num;
		
		System.out.println("네번째 숫자 입력");
		num = sc.nextInt();
		sum = sum + num;
		
		System.out.println("다섯번째 숫자 입력");
		num = sc.nextInt();
		sum = sum + num;
		System.out.println(sum);
		System.out.println("Finish");
		
		int num1 = 0;
		
		//합계를 저장할 변수
		int sum1 = 0;
		System.out.println("숫자 5개를 입력해주세요");
		num1 = sc.nextInt(); sum1 = sum1 + num1;
		num1 = sc.nextInt(); sum1 = sum1 + num1;
		num1 = sc.nextInt(); sum1 = sum1 + num1;
		num1 = sc.nextInt(); sum1 = sum1 + num1;
		num1 = sc.nextInt(); sum1 = sum1 + num1;
		System.out.println(sum1);
		
		
	}

}

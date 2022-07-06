import java.util.Scanner;

public class Var3 {
	
	public static void main(String [] args) {
		System.out.println("Start");
		//키보드와 연결
		Scanner sc = new Scanner(System.in);
		//sc는 변수명이다, 내 마음대로 해도 상관없다
		
		int gion = 0;
		double cheon = 0.0;
		String name = "";
		//sysout Crtl + cmd + space
		System.out.println("현재 온도를 입력하세요");
		gion = sc.nextInt();
		
		System.out.println("현재 체온을 입력하세요");
		cheon = sc.nextDouble();
		
		System.out.println("이름을 입력하세요");	
		name = sc.next();
		
		System.out.println("현재 온도는 ");
		System.out.println(gion);
		
		System.out.println("현재 체온은 ");
		System.out.println(cheon);
		
		System.out.println("너의 이름은");
		System.out.println(name);
		
		
		System.out.println("Finish");
	}

}

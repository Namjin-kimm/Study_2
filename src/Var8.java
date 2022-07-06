import java.util.Scanner;

public class Var8 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		//암호화 연산식
		//1   ->    1  
		//2   ->    2  
		//3   ->    ? 
		//4   ->    10
		//5   ->    ?   
		//6   ->    12
		//7   ->    13
		//8   ->    20
		//9   ->    21
		//이런 결과가 나오는 식을 만들어보자
		
		Scanner sc = new Scanner(System.in);
		int input;
		input = sc.nextInt();
		//while (input < 15) {
		int output = ((input/4)*10) + (input%4);
		System.out.println(output);
		//input++;
		//}
		System.out.println("Finish");
	}

}

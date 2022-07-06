	public class Operator1 {

	public static void main(String[] args) {
		int count = 0;
		
		count = count + 1; //1
		count = count + 1; //2
		
		count = 0;
		++count; //선행
		count++; //후행
		
		System.out.println(++count); //3
		System.out.println(count++); //3
		//후행 '++'는 먼저 프린트를 하고 그 후에 연산을 진행하라는 의미이다.
		System.out.println(count); //4
		
		count = 0;
		int result = ++count;
		System.out.println(count); //1
		System.out.println(result); //1
		
		result = count++;
		System.out.println(count); //2
		System.out.println(result); //1
		
		result = result - 4;
		result -= 4; // 위 식과 같은 식이다
		

	}

}

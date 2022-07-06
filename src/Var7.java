
public class Var7 {
	
	public static void main(String [] args) {
		
		int age = 20;
		String name = "iu";
		
		System.out.println(name + age);
		//print 문에는 변수가 하나만 들어갈 수 있다
		
		System.out.println("당신의 이름은" + name + "이고 나이는" + age + "이다");
		
		System.out.println(1+"1");
		System.out.println(1+1+"1");
		System.out.println("1"+1+1);
		System.out.println(1+'1');
		//'1'은 char type이고 1은 int type이므로 char가 int로 자동형변환이 일어난다
		//'1'은 int 타입으로 바꾸면 49이다. 그러므로 위 식의 결과는 50
		
		int count = 32;
		int ex = count % 5;
		System.out.println(ex);
		
	}

}

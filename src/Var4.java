import java.util.Scanner;

public class Var4 {
	public static void main(String [] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		String id = "";
		String pw = "";
		String pw2 = "";
		String name = "";
		String year = "";
		String month = "";
		String day = "";
		String gender = "";
		String mail = "";
		
		
		System.out.println("아이디를 입력하세요");
		id = sc.next();
		System.out.println("아이디:" + id +"@naver.com");
		
		System.out.println("비밀번호를 입력하세요");
		pw = sc.next();
		System.out.println("비밀번호:" + pw);
		
		System.out.println("비밀번호를 다시 입력하세요");
		pw2 = sc.next();
		System.out.println("확인된 비밀번호:" + pw2);
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("당신의 이름:" + name);
		
		System.out.println("생년월일을 입력하세요");
		year = sc.next();
		month = sc.next();
		day = sc.next();
		System.out.println("당신의 생년월일:" + year + "년" +month + "월" + day + "일");
		
		System.out.println("성별을 입력하세요");
		gender = sc.next();
		System.out.println("당신의 성별은:" + gender);
		
		System.out.println("이메일을 입력하세요");
		mail = sc.next();
		System.out.println("당신의 이메일:" + mail);
		
		
		System.out.println("Finish");
		
	}

}

package Day03;

public class Test {

	public static void main(String[] args) {
		
		int age = 20;
		String name = "김휴먼";
		
		// 이름 : 김휴먼, 나이 : 20
		System.out.println("이름 : " + name + ", " + "나이 : " + age);
		
		// %s : 문자열 형식 기호
		// %d : 숫자 형식 기호
		System.out.printf("이름 : %s, 나이 : %d", name, age);
		
		
		System.out.println();
		System.out.printf("%6d", 123);
		System.out.println();
		System.out.printf("%-6d", 123);
		
	}
}

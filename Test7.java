
public class Test7 {

	public static void main(String[] args) {
		String a = "hello";	//String은 클래스;
		String b = "Hello";
		String c = "hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a.equals(b));	//두개의 문자열(a,b),(a,c)가 동일한 값을 갖는지 비교;
		System.out.println(a.equals(c));
		
		System.out.println(a.replace("l","L"));	//일치하는 문자를 한번 변경;
		System.out.println(a.replaceAll("hello","bye"));	//일치하는 모든 문자를 변경;
		System.out.println(c.replaceFirst("l","L"));	//일치하는 문자 중 첫번째 문자만 변경;
		
		System.out.print(a.substring(0,2));	//문자열의 특정 범위를 반환;
		System.out.print(b.substring(0,2));
		System.out.println(c.substring(0,2));
	}

}
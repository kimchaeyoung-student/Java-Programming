
public class Test7 {

	public static void main(String[] args) {
		String a = "hello";	//String�� Ŭ����;
		String b = "Hello";
		String c = "hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a.equals(b));	//�ΰ��� ���ڿ�(a,b),(a,c)�� ������ ���� ������ ��;
		System.out.println(a.equals(c));
		
		System.out.println(a.replace("l","L"));	//��ġ�ϴ� ���ڸ� �ѹ� ����;
		System.out.println(a.replaceAll("hello","bye"));	//��ġ�ϴ� ��� ���ڸ� ����;
		System.out.println(c.replaceFirst("l","L"));	//��ġ�ϴ� ���� �� ù��° ���ڸ� ����;
		
		System.out.print(a.substring(0,2));	//���ڿ��� Ư�� ������ ��ȯ;
		System.out.print(b.substring(0,2));
		System.out.println(c.substring(0,2));
	}

}
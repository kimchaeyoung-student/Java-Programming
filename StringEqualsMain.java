
public class StringEqualsMain {

	public static void main(String[] args) {
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		
		//����� false
		System.out.println("s1==s2 : " + (s1==s2));
		//����� true
		System.out.println("s1.equals(s2) : " + s1.contentEquals(s2));
	}

}


public class WrapperTest {

	public static void main(String[] args) {
		String string_value;
		
		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer("20");
		
		Double double1 = new Double(10.5);
		Double double2 = new Double("20.5");
		
		Integer unboxing_integer;
		
		string_value = Double.toString(double1);
		System.out.println(string_value);
		
		string_value = Double.toString(double2);
		System.out.println(string_value);
		
		Integer integer3 = Integer.parseInt(integer1.toString());
		System.out.println(integer3);
		
		string_value = integer2.toBinaryString(integer2);
		System.out.println(string_value);
		
		string_value = integer2.toOctalString(integer2);
		System.out.println(string_value);
		
		string_value = integer2.toHexString(integer2);
		System.out.println(string_value);
		
		unboxing_integer = 55;
		
		Integer integer4 = new Integer(integer1.valueOf(unboxing_integer+2));
		System.out.println(integer4);
		
		String oct = "3471";
		String hex = "3471";
		System.out.println("문자열 2진수 -> int : " + Integer.valueOf("01011",2));
		System.out.println("문자열 8진수 -> int : " + Integer.valueOf(oct, 8));
		System.out.println("문자열 16진수 -> int : " + Integer.valueOf(hex,16));
	}

}

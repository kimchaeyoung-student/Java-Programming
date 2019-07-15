
public class Test3 {

	public static void main(String[] args) {
		int x=2, y=2;
		int value;
		
		value = ++x * 5;
		System.out.println(value); //value == 15, x == 3
		
		value = y++ * 5;
		System.out.println(value); //value == 10, y == 3
		
		value = ++y;
		System.out.println(value); //value == 4, y == 4
		
		value = x++;
		System.out.println(value); //value == 3, x == 4
		
		value = y--;
		System.out.println(value); //value == 4, y == 3
		
		value = --x;
		System.out.println(value); //value == 3, x == 3
	}

}

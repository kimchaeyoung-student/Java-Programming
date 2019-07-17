//sum이 100을 초과하면 멈추기, 100되기전에 멈추기;
public class Break {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		while(true) {
			if(sum>100) {
				sum = sum-i;
				i--;
				break;
			}
			i++;
			sum = sum+i;
		}
		//i--;
		//sum = sum- i;
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
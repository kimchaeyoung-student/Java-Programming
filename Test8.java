//이름붙은 반복문;
public class Test8 {

	public static void main(String[] args) {
		Loops : for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
//				break Loops;
//				break;
				continue Loops; //(==break;)
//				continue;
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}
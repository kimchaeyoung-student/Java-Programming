
public class Test6 {

	public static void main(String[] args) {
		int x=4,y=8;
		
		System.out.println(x&y); //0
		System.out.println(x|y); //12
		System.out.println(x^y); //12
		System.out.println(~x); //-5 (2ÀÇ º¸¼ö)
		System.out.println(x<<5); //128
		System.out.println(y>>2); //2
		int bignum = (x>y) ? x:y;
		System.out.println(bignum); //8
	}

}

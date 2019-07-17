
public class ArrayCopyMain {

	public static void main(String[] args) {
		int[] source = new int[] {5,4,6,9,7,9};
		int[] target = {100,200,300,400,500,600,700};
		
		System.arraycopy(source, 2, target, 3, 4);
		for(int i=0;i<target.length;i++) {
			System.out.println("target[" + i + "] : " + target[i]);
		}
	}
}
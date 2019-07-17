import java.util.Random;
public class PackageTest {

	public static void main(String[] args) {
		int array[] = new int[20];
		int rannum = 0;
		boolean cheak;
		Random myrandom = new Random();
		for(int i=0;i<array.length;i++) {
			rannum = myrandom.nextInt(20);	//난수 발생 제어 가능;
			cheak = true;
			for(int j=0;j<i;j++) {
				if(array[j]==rannum) {	//이미 발생한 난수일 경우 빼준다;
					i--;
					cheak = false;
				}
			}
			if(cheak)
				array[i] = rannum;
		}
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
//			System.out.println();
	}

}
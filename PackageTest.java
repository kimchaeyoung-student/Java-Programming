import java.util.Random;
public class PackageTest {

	public static void main(String[] args) {
		int array[] = new int[20];
		int rannum = 0;
		boolean cheak;
		Random myrandom = new Random();
		for(int i=0;i<array.length;i++) {
			rannum = myrandom.nextInt(20);	//���� �߻� ���� ����;
			cheak = true;
			for(int j=0;j<i;j++) {
				if(array[j]==rannum) {	//�̹� �߻��� ������ ��� ���ش�;
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
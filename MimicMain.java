class Mimic extends Object implements Cloneable{	//Cloneable ���
	private int id;
	private String name;
	public Mimic(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//clone() �޼ҵ��� ������
	public Object Clone() throws CloneNotSupportedException{
		return super.clone();	//object�� clone()�� �̿��� �޸� ����
	}
	//toString() �޼ҵ��� ������
	public String toString() {
		return this.id + ":" + this.name;
	}
}
public class MimicMain {

	public static void main(String[] args) throws CloneNotSupportedException{
		Mimic m = new Mimic(1000, "ȣ����");	//��ü����
		Mimic n = (Mimic)m.Clone();	//���縦 ���� �޼ҵ� ���
		System.out.println(m.hashCode() + " " + m);	//������ ���
		System.out.println(n.hashCode() + " " + n);	//������ ���
	}

}

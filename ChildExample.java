//�ڽĻ����ڸ� ����� ���� �θ� �����ڸ� �����.
class Parent{
	public String nation;
	
	public Parent() {
		this("���ѹα�");	//�ٸ� �����ڸ� �θ��� ����
		System.out.println("Parent() call");
	}
	public Parent (String nation) {	//ȣ��޾Ƽ� ���� ��µ�
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
class Child extends Parent{
	public String name;
	
	public Child() {
		this("ȫ�浿");	//�ٸ� �����ڸ� �θ��� ����
		System.out.println("Child() call");
	}
	public Child (String name) {	//ȣ��޾Ƽ� ���� ��µ�
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
public class ChildExample {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.nation + " " + ch.name);
	}
}
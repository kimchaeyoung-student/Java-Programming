class Person{
	String name, job;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
class Student extends Person{
	public Student(String name, int age) {
		super(name, age);
		this.job = "�л�";
	}
	public void Behavior() {
		System.out.println(name + " " + age + "�� " + job + " �ൿ : ������..");
	}
}
class Student2 extends Person{
	public Student2(String name, int age) {
		super(name, age);
		this.job = "�л�";
	}
	public void Behavior() {
		System.out.println(name + " " + age + "�� " + job + " �ൿ : �ڴ���..");
	}
}
class Professor extends Person{
	public Professor(String name, int age) {
		super(name, age);
		this.job = "����";
	}
	public void Behavior() {
		System.out.println(name + " " + age + "�� " + job + " �ൿ : ����������..");
	}	
}
public class test {
	public static void main(String[] args) {	//���
		Student student = new Student("���ֿ�", 24);
		Student2 student2 = new Student2("��ä��", 21);
		Professor professor = new Professor("�ּ���", 42);
		
		student.Behavior();
		student2.Behavior();
		professor.Behavior();
	}
}
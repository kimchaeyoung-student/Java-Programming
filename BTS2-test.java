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
		this.job = "학생";
	}
	public void Behavior() {
		System.out.println(name + " " + age + "세 " + job + " 행동 : 과제중..");
	}
}
class Student2 extends Person{
	public Student2(String name, int age) {
		super(name, age);
		this.job = "학생";
	}
	public void Behavior() {
		System.out.println(name + " " + age + "세 " + job + " 행동 : 자는중..");
	}
}
class Professor extends Person{
	public Professor(String name, int age) {
		super(name, age);
		this.job = "교수";
	}
	public void Behavior() {
		System.out.println(name + " " + age + "세 " + job + " 행동 : 과제내는중..");
	}	
}
public class test {
	public static void main(String[] args) {	//상속
		Student student = new Student("문주영", 24);
		Student2 student2 = new Student2("김채영", 21);
		Professor professor = new Professor("최세지", 42);
		
		student.Behavior();
		student2.Behavior();
		professor.Behavior();
	}
}
class People{
	public String name, ssn;

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
class Student extends People{
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
public class StudentExample {
	public static void main(String[] args) {
		Student st = new Student("±Ë√§øµ", "991234-1234567", 1);
		System.out.println("name : " + st.name);
		System.out.println("ssn : " + st.ssn);
		System.out.println("studentNo : " + st.studentNo);
	}

}
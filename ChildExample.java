//자식생성자를 만들기 전에 부모 생성자를 만든다.
class Parent{
	public String nation;
	
	public Parent() {
		this("대한민국");	//다른 생성자를 부르고 있음
		System.out.println("Parent() call");
	}
	public Parent (String nation) {	//호출받아서 먼저 출력됨
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
class Child extends Parent{
	public String name;
	
	public Child() {
		this("홍길동");	//다른 생성자를 부르고 있음
		System.out.println("Child() call");
	}
	public Child (String name) {	//호출받아서 먼저 출력됨
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
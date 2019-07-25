class Mimic extends Object implements Cloneable{	//Cloneable 명시
	private int id;
	private String name;
	public Mimic(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//clone() 메소드의 재정의
	public Object Clone() throws CloneNotSupportedException{
		return super.clone();	//object의 clone()을 이용한 메모리 복제
	}
	//toString() 메소드의 재정의
	public String toString() {
		return this.id + ":" + this.name;
	}
}
public class MimicMain {

	public static void main(String[] args) throws CloneNotSupportedException{
		Mimic m = new Mimic(1000, "호랑이");	//객체생성
		Mimic n = (Mimic)m.Clone();	//복사를 위한 메소드 사용
		System.out.println(m.hashCode() + " " + m);	//참조값 출력
		System.out.println(n.hashCode() + " " + n);	//참조값 출력
	}

}

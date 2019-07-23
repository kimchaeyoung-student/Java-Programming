class MyClass1{
	private String name;
	private int age;
	
	public MyClass1() {}
	public MyClass1(String a, int b) {
		this.name=a;
		this.age=b;
	}
//Get,Set
public String Get_Name(){
return name;
}

public int Get_Age(){
return age;
}

public void Set_Name(String a) {
	this.name = a;
}

public void Set_Age(int b) {
	this.age = b;
}


public Object Clone() {
	MyClass1 a= new MyClass1();
	a.Set_Name(this.name);
	a.Set_Age(this.age);
	
	return a;
	
}
}

public class Test6 {
	public static void main (String args[]) {
		
		MyClass1 c1 = new MyClass1("±Ë¡ˆ¿±",21);
		MyClass1 c2 = c1;
		
		c2.Set_Age(99);
		System.out.println(c1.Get_Age());
		System.out.println(c2.Get_Age());
		
		MyClass1 c3 = new MyClass1("¿Ã≈¬»£ ",25);
		MyClass1 c4=(MyClass1)c3.Clone();
		c4.Set_Age(99);
		
		System.out.println(c3.Get_Age());
		System.out.println(c4.Get_Age());
	}

}

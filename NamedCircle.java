class Circle2 {
	
	private int radius;
	public Circle2(int radius) {  this.radius= radius; }
	public int getRadius() { return radius; }
	
}

public class NamedCircle extends Circle2 {
	private String name;

	NamedCircle(int radius,String name) {
		super(radius);
		this.name= name;
	}
		public void show() {
		System.out.println(name+", ¹ÝÁö¸§ = "+getRadius());	
		}
	public static void main(String[] args) {
	NamedCircle w= new NamedCircle(5,"chocolate");
		w.show();
	}

}
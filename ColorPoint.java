class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
public class ColorPoint extends Point {
	String color;
	ColorPoint(int x, int y, String s){
		super(x,y);
	}
	public void setPoint(int x, int y) {
		move(x,y);
	}
	public void setColor(String Color) {
		color=Color;
	}
	public void show() {
		System.out.println(color + "������ (" + getX() + "," + getY() + ")");
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setPoint(10,20);
		cp.setColor("Green");
		cp.show();
	}
}
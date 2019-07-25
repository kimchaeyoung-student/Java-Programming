class Air{
	public void land() {
		System.out.println("����");
	}
	public void fly() {
		System.out.println("�Ϲݺ���");
	}
}
class SuperAir extends Air{
	public static final int NORMAL = 1;
	public static final int SUPER = 2;
	public int flymode = NORMAL;
	public void fly() {
		if(flymode == SUPER) {
			System.out.println("�����Ӻ���");
		}
		else {
			super.fly();
		}
	}
}
public class SuperAirExample {
	public static void main(String[] args) {
		SuperAir sa = new SuperAir();
		sa.flymode = sa.NORMAL;
		sa.fly();
		sa.flymode = sa.SUPER;
		sa.fly();
		sa.land();
	}
}
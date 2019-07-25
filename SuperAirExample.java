class Air{
	public void land() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.println("일반비행");
	}
}
class SuperAir extends Air{
	public static final int NORMAL = 1;
	public static final int SUPER = 2;
	public int flymode = NORMAL;
	public void fly() {
		if(flymode == SUPER) {
			System.out.println("초음속비행");
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
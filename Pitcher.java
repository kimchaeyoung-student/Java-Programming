
public class Pitcher implements BodySign {
	public void throwBall(int how) {
		if(how==BodySign.CENTER) {
			System.out.println("Center�� �����ϴ�.");
		}
		else if(how==BodySign.LEFT) {
			System.out.println("Left�� �����ϴ�.");
		}
		else if(how==BodySign.RIGHT) {
			System.out.println("Right�� �����ϴ�.");
		}
		else if(how==BodySign.DOWN) {
			System.out.println("Down���� �����ϴ�.");
		}
		else if(how==BodySign.UP) {
			System.out.println("Up���� �����ϴ�.");
		}
		else {
			System.out.println("�̻��� ���Դϴ�.");
		}
	}
	public static void main(String[] args) {
		Pitcher p = new Pitcher();
		p.throwBall(BodySign.CENTER);
		p.throwBall(BodySign.LEFT);
		p.throwBall(BodySign.RIGHT);
		p.throwBall(BodySign.DOWN);
		p.throwBall(BodySign.UP);
		
		p.throwBall(1);
		p.throwBall(2);
		p.throwBall(3);
		p.throwBall(4);
		p.throwBall(5);
		p.throwBall(1000);
	}
}

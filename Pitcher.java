
public class Pitcher implements BodySign {
	public void throwBall(int how) {
		if(how==BodySign.CENTER) {
			System.out.println("Center로 던집니다.");
		}
		else if(how==BodySign.LEFT) {
			System.out.println("Left로 던집니다.");
		}
		else if(how==BodySign.RIGHT) {
			System.out.println("Right로 던집니다.");
		}
		else if(how==BodySign.DOWN) {
			System.out.println("Down으로 던집니다.");
		}
		else if(how==BodySign.UP) {
			System.out.println("Up으로 던집니다.");
		}
		else {
			System.out.println("이상한 볼입니다.");
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

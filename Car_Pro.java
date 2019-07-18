
public class Car_Pro {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.color = "»¡°­";
		myCar1.speed = 0;
		
		Car myCar2 = new Car();
		myCar2.color = "ÆÄ¶û";
		myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color = "°ËÁ¤";
		myCar3.speed = 0;
		
		myCar1.upSpeed(30);
		System.out.println(myCar1.color + myCar1.speed);
		myCar2.upSpeed(40);
		System.out.println(myCar2.color + myCar2.speed);
		myCar3.upSpeed(50);
		System.out.println(myCar3.color + myCar3.speed);
		
	}

}
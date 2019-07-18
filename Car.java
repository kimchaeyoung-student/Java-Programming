
public class Car {
	String color;
	int speed;

	void upSpeed(int value) {
		speed = speed + value;
	}
	void downSpeed(int value) {
		speed = speed - value;
	}
	String getColor() {
		return color;
	}
	int getSpeed() {
		return speed;
	}
	
	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.color = "»¡°­";
		myCar1.speed = 0;
		
		System.out.println(myCar1.color + myCar1.speed);
	}

}

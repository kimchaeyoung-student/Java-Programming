class Watch2{
	private String brand;
	private int hour;
	private int minute;
	private int second;
	
	public Watch2(String brand, int hour, int minute, int second) {
		this.brand = brand;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		int watch2_number = 0;
		watch2_number++;
	}
	public void ToString() {
		System.out.println(brand+" "+hour+" "+minute+" "+second);
	}
}
public class WatchTest2 {
	public static void main(String[] args) {
		Watch watch1 = new Watch("ARMANI",1,30,50);
		
		watch1.ToString();
	}

}

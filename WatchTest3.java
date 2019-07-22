class Watch3{
	private String brand;
	private static int watch_number;

	public Watch3(String brand) {
		this.brand = brand;
		watch_number++;
	}
	public void ToString() {
		System.out.println(brand+" "+watch_number);
	}
}
public class WatchTest3 {

	public static void main(String[] args) {
		Watch3 watch1 = new Watch3("ARMANI");
		watch1.ToString();
		Watch3 watch2 = new Watch3("애플워치");
		watch2.ToString();
	}

}
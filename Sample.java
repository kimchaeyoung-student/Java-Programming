import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

class Now{
	SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
	private String time = dayTime.format(new Date());
	
	private String name = "없음";
	public String getTime() {
		return time;
	}
	public void setTime(String t) {
		time = t;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}
public class Sample {

	public static void main(String[] args) {
		SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
		Scanner sc = new Scanner(System.in);
		Now now = new Now();
		
		System.out.println("현재시간 : " + now.getTime());
		System.out.println("현재이름 : " + now.getName());
		
		System.out.print("변경할 이름을 입력하십시오 : ");
		String str = sc.nextLine();
		now.setName(str);
		String time1 = dayTime.format(new Date());
		now.setTime(time1);
		System.out.println("현재시간 : " + now.getTime());
		System.out.println("현재이름 : " + now.getName());
		
		sc.close();
	}
}

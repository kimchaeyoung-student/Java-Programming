
public class Test9 {

	public static void main(String[] args) {
		App a = new App();
		a.logo();
	}

}
class App{
	public void app_run() {
		System.out.println("app_run();");
		System.out.println("예제 실행");
		app_exit();
	}
	public void app_exit() {
		System.out.println("app_exit();");
		System.out.println("예제 종료");
	}
	public void logo() {
		System.out.println("logo();");
		System.out.println("메소드 호출 예제");
		app_run();
	}
	
}

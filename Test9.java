
public class Test9 {

	public static void main(String[] args) {
		App a = new App();
		a.logo();
	}

}
class App{
	public void app_run() {
		System.out.println("app_run();");
		System.out.println("���� ����");
		app_exit();
	}
	public void app_exit() {
		System.out.println("app_exit();");
		System.out.println("���� ����");
	}
	public void logo() {
		System.out.println("logo();");
		System.out.println("�޼ҵ� ȣ�� ����");
		app_run();
	}
	
}

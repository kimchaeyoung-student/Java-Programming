class MemberService {
	
	boolean login(String id , String password) {
		if(id.equals("kim") && password.equals("12345")){
		return true;
		}
		else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = ms.login("kim", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			ms.logout("kim");
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}

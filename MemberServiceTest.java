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
		System.out.println("로그아웃 되었습니다.");
	}
}
public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = ms.login("kim", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("kim");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}

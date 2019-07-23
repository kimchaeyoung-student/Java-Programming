//VideoShop 클래스를 테스트하는 예
public class VideoShopMain {

	public static void main(String[] args) {
		String temp;
		
		//비디오 가게 생성
		VideoShop vs = new VideoShop();
		System.out.println("보유한 비디오의 갯수는 " + vs.getCount());
		
		//1. 3개의 비디오 반납
		vs.enQueue("메트릭스1");
		vs.enQueue("메트릭스2");
		vs.enQueue("메트릭스3");
		System.out.println("보유한 비디오의 갯수는 " + vs.getCount());
		
		//2. 3개의 비디오 빌려줌
		temp = vs.deQueue();
		System.out.println(temp + " 빌림");
		temp = vs.deQueue();
		System.out.println(temp + " 빌림");
		temp = vs.deQueue();
		System.out.println(temp + " 빌림");
		
		System.out.println("보유한 비디오의 갯수는 " + vs.getCount());
	}
	//end of main
}
//end of VideoShopMain class
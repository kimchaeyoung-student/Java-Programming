abstract class EmptyCan{
	public abstract void printContent();
	public abstract void printName();
	
}

public class BeerCan extends EmptyCan {
	
public void printContent(){
    System.out.println("흑맥주");
}
//EmptyCan의 printName() 구현
public void printName(){
    System.out.println("맥주캔입니다.");
}
//새로운 멤버 메서드 추가
public void sayHello(){
    System.out.println("안녕하세요 잠탱이 김채영입니다.");
}

public static void main(String args[]){
    BeerCan b = new BeerCan();
    b.printContent();
    b.printName();
    b.sayHello();
} 




}

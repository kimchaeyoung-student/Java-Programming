abstract class EmptyCan{
	public abstract void printContent();
	public abstract void printName();
	
}

public class BeerCan extends EmptyCan {
	
public void printContent(){
    System.out.println("�����");
}
//EmptyCan�� printName() ����
public void printName(){
    System.out.println("����ĵ�Դϴ�.");
}
//���ο� ��� �޼��� �߰�
public void sayHello(){
    System.out.println("�ȳ��ϼ��� ������ ��ä���Դϴ�.");
}

public static void main(String args[]){
    BeerCan b = new BeerCan();
    b.printContent();
    b.printName();
    b.sayHello();
} 




}

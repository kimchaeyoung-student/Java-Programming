import java.util.Vector;
public class CloneMain {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(new String("Hello World"));
		v.addElement(new String("������ ��"));
		
		Vector s = (Vector)v.clone();
		s.addElement(new String("���纻�� �߰�"));
		System.out.println("Vector v : " + v);
		System.out.println("Vector s : " + s);
	}

}

class Weight2 {
	public int weight = 45;
	public void increase(int increase) {
		weight += increase;
	}
	public void decrease(int decrease) {
		weight -= decrease;
	}
}

public class Weight {

	public static void main(String[] args) {
		Weight2 w = new Weight2();
		int x = 5;
		w.increase(x);
		
		System.out.println(w.weight);
	}

}

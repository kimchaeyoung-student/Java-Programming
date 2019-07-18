class This{
	int i;
	double d;
	
	public This(int i) {
		this(3.14);
		System.out.println(i);
	}
	public This(double d) {
		System.out.println(d);
	}

	public static void main(String[] args) {
		This t = new This(100);
	}

}

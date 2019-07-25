class EX1 {
	class InstanceInner{
		int a = 100;
//		static int b = 100;
		final static int c = 100;
	}
	static class StaticInner{
		int a=200;
		static int b=200;
	}
	InstanceInner a = new InstanceInner();
	static StaticInner b = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner aa = new InstanceInner();
		StaticInner bb = new StaticInner();
	}
	void instanceMethod() {
		InstanceInner aa = new InstanceInner();
		StaticInner bb = new StaticInner();
//		LocalInner d = new LocalInner();
	}
	void myMethod() {
		class LocalInner{
			int a=300;
//			static int b=300;
			final static int c=300;
		}
	}
	public static void main(String arg[]) {
		System.out.println(InstanceInner.c);
		System.out.println(StaticInner.b);
	}
}

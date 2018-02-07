class Overloading {
	void test() {
		System.out.println("No Arguments");
	}
	void test(int a) {
		System.out.println("One Argument:"+a);
	}
	void test(int a,int b) {
		System.out.println("Two Arguments:"+a+" "+b);
	}
	void test(double a) {
		System.out.println("Double Argument:"+a);
	}
	public static void main(String args[]) {
		Overloading obj=new Overloading();
		obj.test();
		obj.test(8);
		obj.test(4,5);
		obj.test(21.25);
	}
}
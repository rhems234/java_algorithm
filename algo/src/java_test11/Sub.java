package java_test11;

public class Sub {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int Calculate() {
		return a - b;
	}
}

package oops;

public class StaticBlock {
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("Main block");

	}
	static {
		System.out.println("2");
	}
}

package interfaces;
interface A{
	
}
interface Student{
	void study();

	default void r() {
		System.out.println("Inside r");
	}
}
interface Youtuber extends A,Student{
	void makeVideo();
}
public class Person implements Student,Youtuber{
	 public void study() {
		System.out.println("Studying");
	}
	public void makeVideo() {
		System.out.println("Making video");
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.study();
		p.makeVideo();
		p.r();
	}

}

package oops;
class AB{
			final int rno=10;
			
			
	final void get() {
		System.out.println("inside AB");							//the variable cannot be reintialized
	}
	
									//if the variable is declared as global it should intialized
	
										//if the variable is deaclared as local it can be intialized after(only if variable is not used)
}
final class BC extends AB{
//	void get() {                       final method cannot be overridden
//		System.out.println("inside BC");
//	}
}
//class CD extends BC{               final class cannot be extended
//	
//}


public class FinalKeyword {
	
	public static void main(String[] args) {
	AB a=new AB();
	
		System.out.println(a.rno);
	}

}

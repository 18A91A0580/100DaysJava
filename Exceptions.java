package exceptionHandling;

public class Exceptions {
	

	public static void main(String[] args) {
		try {
			int a=4,b=0;
			
			int c=a/b;
			
			
		}	
		
		
	
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Out Of Bound");
		}
		finally {
				System.out.println("sorry");
		}
		
	}

}

package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		int x=4;
		double y=x;//widening
		System.out.println(x+"\n"+y);
		
		
		double d=3.14;
		int a=(int)d;//narrowing
		System.out.println(d+"\n"+a);
	}

}

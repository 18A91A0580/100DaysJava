package patterns;

public class Pattern34 {

	public static void main(String[] args) {
		int stars=1;
		int n=5;//rows
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=space;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++) {
				System.out.print("*");
			}
			System.out.println();
			stars+=2;
		}
	}
}

package week1.day1;

public class Fibonocci {
	public static void main(String[] args) {
		int n = 10, n1 = 0, n2 = 1;
		System.out.println("Fibonacci Series : ");
		for (int i = 1; i <= n; i++) {
			System.out.println(n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;		
		}

	}
}
package week1.day1;

public class ArmStrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 153, j = 0, k = 0, l = 0;
		i = j;
		while (j != 0) {
			k = j % 10;
			l += Math.pow(k, 3);
			k /= 10;
		}
		if (l == i) {
			System.out.println("The Number is Arm Strong Number");
		} else
			System.out.println("The Number is not an Arm Strong Number");
	}

}

// Ctrl Shift F -> To arrange code properly 
// Ctrl Fn F11 -> To RUN code 
package week1.day1;

public class prime {
	public static void main(String[] args) {
		int no=157,rem;
		boolean flag=false;
		for(int i=2;i<=no/2;++i)
		{
			rem=no%i;
			if(rem==0)
			{
				System.out.println(no+" is not a prime number");
				flag=true;
				break;
			}
				
		}
		if(flag==false)
		{
			System.out.println(no+" is a prime number");
		}
	}

}

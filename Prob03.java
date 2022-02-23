
public class Prob03 {

	public static void main(String[] args) {
		long n = 600851475143l;
		for(int i=2; i*i<=n;i++)
		{
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}

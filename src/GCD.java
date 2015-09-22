
public class GCD {
	int iter_GCD(int m, int n)
	{
		while(m%n != 0) {
			int temp;
			temp = n;
			n = m%n;
			m = temp;
		}
		return n;
	}
	
	int recursive_GCD(int m, int n) {
		if (m%n == 0) {
			return n;
		}
		else
			return recursive_GCD(n, m%n);
	}
	
	public static void main(String[] args) {
		GCD gcd = new GCD();
		System.out.println(gcd.iter_GCD(72, 16));
		System.out.println(gcd.recursive_GCD(72, 16));
	}

}

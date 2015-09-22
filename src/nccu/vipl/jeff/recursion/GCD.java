package nccu.vipl.jeff.recursion;

public class GCD {
	public int iter_GCD(int m, int n)
	{
		while(m%n != 0) {
			int temp;
			temp = n;
			n = m%n;
			m = temp;
		}
		return n;
	}
	
	public int recursive_GCD(int m, int n) {
		if (m%n == 0) {
			return n;
		}
		else
			return recursive_GCD(n, m%n);
	}
}

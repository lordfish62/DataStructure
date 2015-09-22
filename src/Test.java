import nccu.vipl.jeff.sorting.*;

public class Test {
	int f(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		System.out.println("ADD");
		return f(n-1) + f(n-2);
	}
	
	int exp(int n, int a) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return a;
		else {
			int temp = exp(n/2,a);
			return temp*temp;
		}
	}
	
	int expi(int n, int a) {
		if (n==0)
			return 1;
		else if (n==1)
			return a;
		else {
			int res = a;
			for(int i=2; i<=n; i=2*i)
				res = res*res;
			return res;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Test().expi(0,10));
	}
}
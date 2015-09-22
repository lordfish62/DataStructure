import nccu.vipl.jeff.recursion.*;

public class Test {
	public static void main(String[] args) {
		new Permutation().perm(Recursion.list, 0, 2);
		new Test().trans(16);
	}
	
	void trans(int n) {
		if (n/2 == 1) {
			System.out.print("1");
			System.out.print(n%2);
		}
		else {
			int mod = n % 2;
			trans(n/2);
			System.out.print(mod);
		}
	}
}
package nccu.vipl.jeff.recursion;

public class Hanoi {
	void hanoi(int disks, char src, char tmp, char dst) {
		if (disks == 1)
			System.out.printf("move %c to %c\n", src, dst);
		else {
			hanoi(disks-1, src, dst, tmp);
			hanoi(1, src, tmp, dst);
			hanoi(disks-1, tmp, src, dst);
		}
	}
	
	public static void main(String[] args) {
		new Hanoi().hanoi(3, 'A', 'B', 'C');
	}
}

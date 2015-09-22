package nccu.vipl.jeff.recursion;
public class Permutation {
	public void perm(char[] list, int start, int end) {
		if (start == end) {
			for(int i=0; i<=end; i++)
				System.out.print(list[i]);
			System.out.println();
		}
		else {
			for (int i=start; i<=end; i++) {
				char temp = list[start];
				list[start] = list[i];
				list[i] = temp;
				perm(list, start+1, end);
				temp = list[start];
				list[start] = list[i];
				list[i] = temp;
			}
		}
	}
}

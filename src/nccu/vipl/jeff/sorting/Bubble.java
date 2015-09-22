package nccu.vipl.jeff.sorting;

public class Bubble extends Sorting {
	public void bubble(int[] data, int n) {
		boolean flag = false;
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-1-i; j++) {
				if (data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					flag = true;
				}
			}
			if (!flag)
				return;
		}
	}
}

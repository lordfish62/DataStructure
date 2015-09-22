package nccu.vipl.jeff.sorting;

public class Selection extends Sorting {
	public void selsort(int[] data, int n) {
		for (int i=0; i<n-1; i++) {
			int min = i;
			for (int j=i+1; j<n; j++) {
				if (data[j] < data[min])
					min = j;
			}
			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}
}

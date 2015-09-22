package nccu.vipl.jeff.sorting;

public class Quick extends Sorting {
	public void quickSort(int[] data, int left, int right) {
		int i = left, j = right + 1, pivot = data[left];
		if (left < right) {
			do {
				do {
					i++;
				}while (data[i] < pivot);
				do {
					j--;
				}while (data[j] > pivot);
				if (i < j) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}while (i < j);
			int temp = data[left];
			data[left] = data[j];
			data[j] = temp;
			quickSort(data, left, j-1);
			quickSort(data, j+1, right);
		}
	}
}

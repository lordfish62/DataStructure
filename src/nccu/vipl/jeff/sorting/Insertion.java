package nccu.vipl.jeff.sorting;

public class Insertion extends Sorting {
	void insert(int pos, int key) {
		while (pos >=0 && data[pos] > key) {
			data[pos+1] = data[pos];
			pos--;
		}
		data[pos+1] = key;
	}
	
	public void insort(int[] data, int n) {
		for (int i=1; i<n; i++) {
			insert(i-1, data[i]);
		}
	}
}

package yn.datastruct;

import java.util.Arrays;


public class BinarySearch {
	
	static int search(int a[], int value) {
		if (a==null) {return -1;}
		int low = 0, high = a.length-1, mid = (low + high)/2;
		while (low <= high) {
			if (value == a[mid]) {
				return mid;
			} else if (value < a[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high)/2;
		}
		return -(low+1);
	}
	
	public static void main(String[] args) {
		int [] a = {1,2,6,4,3};
		Arrays.sort(a);
		System.out.println(search(a, 6));
		System.out.println(Arrays.binarySearch(a, 5));
		System.out.println(search(a, 5));
	}
}



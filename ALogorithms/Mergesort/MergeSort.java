public class MergeSort {
	public static void main(String[] args) {
		String[] array = { "Somesh","Srikanth","Surya","Raghu"};
		System.out.println("Before merge sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		String[] sortedArray = mergeSort(array);
		System.out.println();
		System.out.println("After merge sort");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}

	}

	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int indexLeft = 0;
		int indexRight = 0;
		int mIndex = 0;
		int comp = 0;
		while (indexLeft < left.length || indexRight < right.length) {
			if (indexLeft == left.length) {
				merged[mIndex++] = right[indexRight++];
			} else if (indexRight == right.length) {
				merged[mIndex++] = left[indexLeft++];
			} else {
				comp = left[indexLeft].compareTo(right[indexRight]);
				if (comp > 0) {
					merged[mIndex++] = right[indexRight++];
				} else if (comp < 0) {
					merged[mIndex++] = left[indexLeft++];
				} else {
					merged[mIndex++] = left[indexLeft++];
				}
			}
		}
		return merged;
	}
}

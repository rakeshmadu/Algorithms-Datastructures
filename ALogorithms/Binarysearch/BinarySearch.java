import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] wordList = { "Suresh","Ramesh","Vijay","Anil","Raj" };
		Arrays.sort(wordList);
		System.out.println("List of Words :");
		System.out.println(Arrays.toString(wordList));
		System.out.println("Enter the word you want to search");
		String searchName = sc.nextLine();
		sc.close();
		int result = binarySearch(wordList, searchName);

		if (result == -1)
			System.out.println("word is not present in the list");
		else
			System.out.println("word is found at " + "index " + result);
	}

	static int binarySearch(String[] wordList, String searchName) {
		int start = 0, lenght = wordList.length - 1;
		while (start <= lenght) {
			int middle = start + (lenght - start) / 2;
			int result = searchName.compareTo(wordList[middle]);
			if (result == 0)
				return middle;
			if (result > 0)
				start = middle + 1;
			else
				lenght = middle - 1;
		}

		return -1;
	}

}

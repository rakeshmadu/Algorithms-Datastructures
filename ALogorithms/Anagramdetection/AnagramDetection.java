import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	public static boolean areAnagram(String string1, String string2) {

		if (string1.equals(string2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// AnagramDetection anagram = new AnagramDetection();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = sc.nextLine();
		System.out.print("string 1 : " + str1);
		char[] strArr1 = str1.toCharArray();

		System.out.print("\nEnter the second string : ");
		String str2 = sc.nextLine();
		System.out.print("string 2 : " + str2);
		char[] strArr2 = str2.toCharArray();

		Arrays.sort(strArr1);
		String string1 = new String(strArr1);
		Arrays.sort(strArr2);
		String string2 = new String(strArr2);

		if (areAnagram(string1, string2)) {
			System.out.print("\nTwo strings are Anagram");
		} else {
			System.out.print("\nTwo strings are not Anagram");
		}
	}
}

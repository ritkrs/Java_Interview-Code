import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArrayLi {
	
	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5,4 };
		System.out.println(isSorted(a));
	}
	
}


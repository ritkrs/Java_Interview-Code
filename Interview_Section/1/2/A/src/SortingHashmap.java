import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SortingHashmap {
	
	public static void main(String[] args) {
		HashMap<String, Integer> h1=new HashMap<String, Integer>();
		h1.put("Mohan", 1);
		h1.put("Gopi", 2);
		h1.put("Sai", 3);
		h1.put("Ali", 4);
		
		List names=h1.values().stream().collect(Collectors.toList());
		
		Collections.sort(names,new MyComparator());
		for (int i = 0; i < h1.size(); i++) {
			System.out.println(h1.get(i));
			
		}
		
	}
}

import java.util.ArrayList;
import java.util.List;

public class ThirdArrays {
	public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
    int[] arr2 = new int[] { 5, 6, 7, 8 };

    boolean contains = false;
    List<Integer> list = new ArrayList<Integer>();
    
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                contains = true;
                break;
            }
        }

        if(!contains){
            list.add(arr1[i]);
        }
        else{
            contains = false;
        }
    }
    System.out.println(list);

}
	
}
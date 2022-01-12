/**
 * 
 */
package String;

/**
 * @author pc
 *
 */
public class ReverseString {
public static void main(String[] args) {
	String str="ritesh";
	String reverse=" ";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse+=str.charAt(i);
	}
	System.out.println("reverse"+reverse);
}

}

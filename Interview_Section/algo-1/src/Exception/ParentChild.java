package Exception;

public class ParentChild {
	public static void main(String[] args) {
		try
		{
			int i=10/0;
			
		}
		
		catch (ArithmeticException e1) {
		System.out.println("handling airthmetic exception by child");
			// TODO: handle exception
	}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handling arithmetic exception by Parent");
		}
		
	}

}

package String2;

import java.util.Date;

//import String.Immutable2Class;

public class Immutable2MainClass {
	
	    public static void main(String[] args)
	    {
	        Immutable2Class im = Immutable2Class.createNewInstance(100,"test", new Date());
	        System.out.println(im);
	        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
	        System.out.println(im);
	    }
	 
	    private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
	    {
	        immutableField1 = 10000;
	        immutableField2 = "test changed";
	        mutableField.setDate(10);
	    }

}

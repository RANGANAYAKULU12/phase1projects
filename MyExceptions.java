package mechanisms;
class MyExceptions extends Exceptions 
	{ 
	    public MyExceptions(String s) 
	    { 
	        super(s); 
	    } 
	} 
	public class Main 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new MyExceptions("temp"); 
	        } 
	        catch (MyExceptions ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    }

}
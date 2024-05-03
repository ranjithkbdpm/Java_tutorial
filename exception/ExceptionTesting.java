package exception;

import java.io.IOException;

public class ExceptionTesting {
    public static void main(String[] args){
        try{
            //block of code to test
        }
        catch(NullPointerException e){
            //catching error stack and printing block
        }
        finally {
            //No matter what this block will be executed finally(error or no error)
        }


        try
		{
		me.divide();
		}
		catch(ArithmeticException e)
		{
			System.err.println(e);
			System.err.println("Invalid input. a="+me.a+",b="+me.b);
			e.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			System.err.println("Cannot create object for null");
			ne.printStackTrace();
		}
		catch(NumberFormatException nfe)
		{
			System.err.println("Cannot convert alphabets to numbers");
		    nfe.printStackTrace();	
		}
		finally
		{
			System.out.println("Finally Block Called");
		}
    }
    
}

class superclass{
    void method(){
        //no exception declared
    }
}
class subclass{
    void overriddenMethod()throws IOException{
        //overridden method with declared exception 
    }
}
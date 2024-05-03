package strings;

public class StringBufferClass {

    public static void main(String[] args){

        String pal2 = "malayalam";

        StringBuffer sb=new StringBuffer(pal2);	
        
        //String normalString = sb;//Type mismatch: cannot convert from StringBuffer to String
        
        String sbc = new String(sb.reverse());
	    
	    //if(pal2.equalsIgnoreCase(sb.reverse().toString()))
        //when you compare string with stringBuffer string with equals change string.
        if(pal2.equalsIgnoreCase(sbc))
	    {
	    	System.out.println("The string is palindrome");
	    }
	    else
	    {
	    	System.out.println("The String is not a palindrome");
	    }	    
	    
	    System.out.println(sbc);


    }
    
}

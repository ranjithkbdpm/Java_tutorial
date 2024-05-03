package strings;

public class Strings {


    //String in java is an object that represents the sequence of char

    String s1 = "Java";// String literal

   // jvm checks the String constant pool, if the string exists in the pool reference to that String instance is returned. if not a new instance is created in the pool.no new string object is created to save memory
   String s2 = "Java";

   String s3 = new String("Welcomw to java!!");//String creation with new keyword
    
   //character array to string
   char[] ch = {'h','e','l','l','o',' ','J','a','v','a'}; //Array of characters

   String s4 = new String(ch);


   //string to character array
   String s5 = "Wellcome to java";

   char[] ch1 = s5.toCharArray();


   //byte array to string

   byte[] b = {65,66,67,68,69}; //byte array values of asci numbers

   String s6 = new String(b);   


   //string to byte array
   String s7 = "ABCDE";

   byte[] b1 = s5.getBytes();  

    public static void main(String[] args){

        //Strings are immutable
        String s="Sachin";  
        s.concat(" Tendulkar");//concat() method appends the string at the end  
        System.out.println("before concat "+s);
        System.out.println(s.concat(" Tendulkar"));
        s=s.concat("Tendulkar");
        System.out.println("after concat "+s);



        //compare using == operator
        String cs1="Ram";  
        String cs2="Ram";
        String cs3="RAM";  
        String cs4=new String("Ram");  
        System.out.println(cs1==cs2);//true (because both refer to same instance)  
        System.out.println(cs1==cs4);//false(because s3 refers to instance created in nonpool) 
        //equal and equalIgnoreCase
        System.out.println(cs1.equals(cs3));//false  
        System.out.println(cs1.equalsIgnoreCase(cs3));//true 

        String pal = "Radar";
        String rev = "";

        char[] c=pal.toCharArray();

        // for(int i = c.length-1;i>=0;i--){
        //     rev += c[i];
        // };

        for(int i = pal.length()-1;i>=0;i--){
            rev += pal.charAt(i);
        };

        if(pal.equalsIgnoreCase(rev))
	    {
	    	System.out.println("The string is palindrome");
	    }
	    else
	    {
	    	System.out.println("The String is not a palindrome");
	    }	    
	    

        String pal2 = "malayalam";

        StringBuffer sb=new StringBuffer(pal2);	
        
        //String normalString = sb;//Type mismatch: cannot convert from StringBuffer to String
        
        String sbc = new String(sb.reverse());
	    
	    //if(pal2.equalsIgnoreCase(sb.reverse().toString()))
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




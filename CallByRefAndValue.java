public class CallByRefAndValue {

    //non-static variable are accesed through objects  
    int b = 10;

    //state update of non-static variable
    //method that updates the state of the variable that belong to the object(non-static)  
    public void objMethod(int c) {      
        this.b = c;
    }

    //this cannot be used on a static method   
    //public static void objMethod(int c) {      
       //this.b = c;
    //}
    
    //static method that update the non static variable b using the instatnce of class
    public static void objMethod2(CallByRefAndValue objP, int value) {
       objP.b = value;
    }    
    

    //static variable that belong to the class accessed directly using class name
    static int x = 10;
    
    //method that update the static variable this can static or non-static(method of object)
    public static void method(int data){
       //x = data; 
       CallByRefAndValue.x = data;
    }


    //non-static method that updates the static variable
    public void updateStaticVariable(int data){
        x = data;
    }
    
    //method that receives argument as value
    public static void callByValue(int data2){
         data2 = 100;        
    }

    //method that receives argument as copy of reference(memory location of array a)
    public static void callByReference(int[] a){
           a[0] = 20;          
    }
    
    //method that receive the copy of reference you can modify the value but not the whole m
    public static void callReferenceByValue(int[] a){
           int[] a1 = {2,4,6};
           a = a1; 
           a = new int[]{4, 5, 6};
    }
    
   public static void main(String[] args) { 
      
      //creating an instance of class through which you can access variable that belong to the instance of class(object) 
      CallByRefAndValue obj = new CallByRefAndValue();
      
      System.out.println("Accessing Non-static variable using object instatnce: "+ obj.b);
      
      //method that updates the state of the variable that belong to the object(non-static) 
      obj.objMethod(50);
      
      System.out.println("after changing the non-static class member: "+ obj.b);  
      
      //static method that change the non static variable using the object created
      objMethod2(obj, 100);
      
      System.out.println("changing non static variable using a static variable: "+ obj.b); 
      
      //Accessing the class variable that is static  
      System.out.println("before changing a value of class member: "+ x);

      //Method that changes the value of static variable
      method(20);
          
      System.out.println("after changing a value of class member: "+ x);

      obj.updateStaticVariable(150);
     
      System.out.println("update a state of static variable using non-static method: "+ obj.x); 

      //call by reference vs call by value vs call reference by value   
      int y = 5;   
      int[] arr = {1,2,3};
      
      callByValue(y);

      //call by value 
      System.out.println("Call by value: "+ y);  
      
      callByReference(arr);
      
      System.out.println("Call by reference: "+java.util.Arrays.toString(arr));
      
      callReferenceByValue(arr);
      
      System.out.println("Call reference by value: "+java.util.Arrays.toString(arr));

      // Reset arr to an empty array
      arr = new int[]{};
      System.out.println("After resetting to empty array: " + java.util.Arrays.toString(arr));
   }
 }




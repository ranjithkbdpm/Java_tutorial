public class Arithmetic 
{

    int a;
    int b;
 
    public Arithmetic(int c, int d) 
    {  
      a = c;
      b = d;
    }

    public void add() 
    {
  
      int c = a + b;
      System.out.println("Result :" + c);
 
    }

    public void sub() 
    { 
      int c = a - b;
      System.out.println("Result :" + c);
    }

    public void multi() 
    {
 
      int c = a * b;
      System.out.println("Result :" + c);

    }

    public void div() 
    {
 
      int c = a / b;
      System.out.println("Result :" + c);

    }

    public void mod() 
    {
 
      int c = a % b;
      System.out.println("Result :" + c);

    }


}



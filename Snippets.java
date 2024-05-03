public class Snippets {
    


int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable


//string

String text = "Hello Java!";

text.length();

//methods

text.toUpperCase();
text.toLowerCase();
text.indexOf("Java");
text.concat("Welcome");


//concatenation 

System.out.println(text + "Welcome");






String x = "5";
int y = 5;
int z = x + y ; 
System.out.println(z);



public class Main {
  public static void main(String[] args) {
    String[][] myNumbers = { {"a", "b", "c", "s"}, {"e", "l", "z"} };
    System.out.println(myNumbers[1][2]);  
  }
}



int[] myNumbers = {1, 2, 3, 4, 5};




public class Main {
   public static void main(String[] args) {
     String[][] myNumbers = { {"a", "b", "c", "s"}, {"e", "l", "z"} };
     for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
           System.out.println(myNumbers[i][j]);
        }
     }
   }
}

public class MyClass {
  public static void myMethod(String name, int age) {
    System.out.println("I'm" + name + "my age is" + age );
  }

  public static void main(String[] args){
    myMethod("Pavi", 30);
  }
}

public class Main {
   static int c;
   public static int myMethod(int a, int b) {
      return a+b;
   }
   public static void main (String[] args){
   		c = myMethod(40, 30);
       System.out.println(c);
   }
}


public class ConstructorClass {
  int a;
  String text;

  public ConstructorClass(int a, String b){
    this.a = a;
    this.text = b;
  }

    public static void main(String[] args) {
    ConstructorClass obj1 = new ConstructorClass(5,"Hello Java!");

    System.out.println(obj1.a + obj1);  
  }
}


//method overloading
int myMethod(int x)
float myMethod(String msg)
double myMethod(double x, double y)

class Animal{  
  void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
   void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
   public static void main(String args[]){  
      Dog d=new Dog();  
      d.bark();  //barking
      d.eat();  //
}} 


class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}

class Cat extends Animal{  
  void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
   public static void main(String args[]){  
     Cat c=new Cat();  
     c.meow();  
     c.eat();  
     //c.bark();//C.T.Error  
  }
} 


class Operation{  
 int square(int n){  
  return n*n;  
 }  
}   
class Circle{  
 Operation op;//aggregation  
 double pi=3.14;     
 double area(int radius){  
   op=new Operation();  
   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
   return pi*rsquare;  
 }    
 public static void main(String args[]){  
   Circle c=new Circle();  
   double result=c.area(5);  
   System.out.println(result);  
 }  
} 
}

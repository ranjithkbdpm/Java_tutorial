package polymorphism;
//Example of overriding (runtime polymorphism)
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
    public void method1() {
        System.out.println("Checking if the method1 can be called");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
      
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
        
    public void sound() {
        System.out.println("Checking if the method can be called");
    }
        
  }
  
  class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();
      Animal myPig = new Pig();
      Animal myDog = new Dog();
      Dog myDog1 = new Dog();
      Animal myDog2 = new Dog();

      // this is an example of method overiding though you are referening to the Animal class to the object when you have similar implementation of method in both super and subclass. subclass method will overide the superclass.          
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();

      //myDog.sound() // this will cause an 'no symbol found' as you are referncing Animal class for this object. only methods from Animal class is called. you cannot call a method from Dog.
      myDog1.sound();
      myDog.method1();
      myDog2.method1();
    }
  }

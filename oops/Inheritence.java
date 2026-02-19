class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // inherited method
        d.bark();  // own method
    }
    
}

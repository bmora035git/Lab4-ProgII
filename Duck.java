/*

Lab 4 Programming II 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 10/05/2026 
   
*/

// Create a child class of Bird called Duck. The Duck class should have a 
// method called swim() that returns a String "The duck swims in the Everglades!". 
// The Duck class should also have a method called makeSound() 
// that returns a String "Quack Quack!".

public class Duck extends Bird {
    
    // constructor for the Duck class that calls the superclass constructor
    public Duck() {
        super();
    }

    // method that returns a String "The duck swims in the Everglades!"

    public String swim() {
        return "The duck swims in the Everglades!";
    }

    // method that returns a String "Quack Quack!"

    public String makeSound() {
        return "Quack Quack!";
    }
}

/*

Lab 4 Programming II 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 10/05/2026 
   
*/

// Create a child class of Bug called Grasshopper. The Grasshopper class 
// should have a method called jump() that returns a String "Jumping!". 
// The Grasshopper class should also have a method called makeSound() 
// that returns a String "Chirp!".

public class Grasshopper extends Bug {

    // constructor for the Grasshopper class that calls the superclass constructor
    public Grasshopper() {
        super("Grasshopper", 6, 2);

    }

    // method that returns a String "Jumping!"
    public String jump() {
        return "Jumping!";
    }

    // method that returns a String "Chirp!"
    public String makeSound() {
        return "Chirp!";
    }

    

}
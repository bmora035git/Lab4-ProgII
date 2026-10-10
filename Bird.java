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

public class Bird {

    // instance variables for the Bird class
    private String name;
    private boolean fly;
    private boolean swim;

    // default constructor for the Bird class that sets the name to "Bird", 
    // fly to true, and swim to false
    public Bird() {
        this.name = "Bird";
        this.fly = true;
        this.swim = false;
    }

    // parameterized constructor for the Bird class that sets the name, 
    // fly, and swim properties

    public Bird(String name, boolean fly, boolean swim) {
        this.name = name;
        this.fly = fly;
        this.swim = swim;
    }

    // getter and setter methods for the name, fly, and swim properties
    public void setName(String name) {
        this.name = name;
    }

    // getter method for the name property
    public String getName() {
        return name;
    }

    // setter method for the fly property
    public void setFly(boolean fly) {
        this.fly = fly;
    }

    // getter method for the fly property
    public boolean canFly() {
        return fly;
    }

    // setter method for the swim property
    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    
    // getter method for the swim property
    public boolean canSwim() {
        return swim;
    }



    // toString() method that returns a String representation of the Bird object
    // The toString() method checks the fly and swim properties of the Bird object
    // and returns a String that describes the Bird's abilities to fly and swim.
    // The toString() method uses if statements to check the values of the fly 
    // and swim properties
    
    public String toString() {
        if(this.canFly() && this.canSwim()) 
            return "This Bird can fly and swim!";

        if (this.canFly())
            return "This Bird can fly!";

        if(!this.canFly()) 
            return "The Little Bird cannot fly!";

        if (this.canSwim())
            return "This Bird can swim!";

        if (!this.canSwim())
            return "The Little Bird cannot swim!";
        
        if (!this.canFly() && !this.canSwim())
            return "The Little Bird cannot fly or swim!";

        if (this.canFly() && !this.canSwim())
            return "The Little Bird can fly but cannot swim!";

        if (!this.canFly() && this.canSwim())
            return "The Little Bird cannot fly but can swim!";
    
        return "What is this Bird?";
    }
}

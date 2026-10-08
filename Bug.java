/*

Lab 4 Programming II 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 10/05/2026 
   
*/


    // Create a superclass of Bug with the following attributes: name, 
    // numOfLegs, numOfWings. Create a subclass of Bug called Grasshopper. 
    // The Grasshopper class should have a method called jump() that 
    // returns a String "Jumping!". The Grasshopper class should also 
    // have a method called makeSound() that returns a String "Chirp!".

    // The superclass bug should have a no args constructor and a variable 
    // constructor that takes in the name, numOfLegs, and numOfWings as 
    // parameters. The Grasshopper class should have a constructor that 
    // calls the superclass constructor with the name "Grasshopper", 
    // numOfLegs 6, and numOfWings 2.


    public class Bug {

        // field variables of the Bug class    
        private String name;
        private int numOfLegs;
        private int numOfWings;

        public Bug() {
        }

        public Bug(String name, int numOfLegs, int numOfWings) {
            this.name = name;
            this.numOfLegs = numOfLegs;
            this.numOfWings = numOfWings;
        }

        // getter and setter methods for the Bug class

        public void setName(String name) {
            this.name = name;
        }

        // getter method for the name field

        public String getName() {
            return name;
        }

        // setter and getter methods for the numOfLegs and numOfWings fields

        public void setNumOfLegs(int numOfLegs) {
            this.numOfLegs = numOfLegs;
        }

        public int getNumOfLegs() {
            return numOfLegs;
        }

        // setter and getter methods for the numOfWings field

        public void setNumOfWings(int numOfWings) {
            this.numOfWings = numOfWings;
        }

        // getter method for the numOfWings field

        public int getNumOfWings() {
            return numOfWings;
        }

        // toString method for the Bug class

        public String toString() {
            return "Bug [name=" + name + ", numOfLegs=" + numOfLegs + ", numOfWings=" + numOfWings + "]";
        }



    

}

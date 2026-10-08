/*

Lab 4 Programming II 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 10/05/2026 
   
*/

// Create a tester class called BugTester that creates an instance of the
// Grasshopper class and calls the jump() and makeSound() methods.
// The BugTester class should also print the Grasshopper object to the console
// using the toString() method. The BugTester class should also test the
// setter and getter methods of the Grasshopper class.

public class BugTester {

    public static void main(String[] args) {

        // create an instance of the Grasshopper class
        
        Grasshopper grasshopper = new Grasshopper();

        // call the jump() and makeSound() methods and print the results to the console
        System.out.println(grasshopper.jump());
        System.out.println(grasshopper.makeSound());

        // print the Grasshopper object to the console using 
        // the toString() method

        System.out.println("Testing Grasshopper class:");
        System.out.println(grasshopper.toString());


        // test the setter and getter methods of the Grasshopper class
        grasshopper.setName("Grasshopper Bob");
        System.out.println(grasshopper.toString());

        // test the getter methods of the Grasshopper class

        String name = grasshopper.getName();
        System.out.println("Grasshopper's New Name: " + name);


        //  test the setter and getter methods of the Grasshopper class
        grasshopper.setNumOfLegs(8);
        System.out.println(grasshopper.toString());

        // test the getter methods of the Grasshopper class
        int numOfLegs = grasshopper.getNumOfLegs();
        System.out.println("Grasshopper's number of legs: " + numOfLegs);

        // test the setter and getter methods of the Grasshopper class
        grasshopper.setNumOfWings(12);
        System.out.println(grasshopper.toString());

        // test the getter methods of the Grasshopper class

        int numOfWings = grasshopper.getNumOfWings();
        System.out.println("Grasshopper's number of wings: " + numOfWings);

        // print the Grasshopper object to the console using 
        // the toString() method
        System.out.println(grasshopper.toString());

        }

    }


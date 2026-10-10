/*Lab 4 Programming II 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 10/05/2026 
   
*/

// Create a child class of Bird called Duck. The Duck class should have a 
// method called swim() that returns a String "The duck swims in the Everglades!". 
// The Duck class should also have a method called makeSound() 
// that returns a String "Quack Quack!".

 

import java.util.Scanner;

// This class is used to test the Bird and Duck classes. It creates two 
// Bird objects and one Duck object,

public class BirdTester {

    public static void main(String[] args) {

        // Create two Bird objects and one Duck object
        Bird birdy_1 = new Bird();
        Bird birdy_2 = new Bird();

        // Create a Duck object
        Duck duck = new Duck();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);   
        
        // Prompt the user for input to set the properties of the Bird objects
        System.out.println("Is your bird a duck or a sparrow? (Enter 'duck' or 'sparrow')");

        // Read the user's input and set the name of the first Bird object
        birdy_1.setName(scanner.nextLine());

        // Prompt the user for input to set the fly and swim properties of the first Bird object
        System.out.println("Can your bird fly? (true/false)");
        
        // Read the user's input and set the fly property of the first Bird object
        birdy_1.setFly(scanner.nextBoolean());
        
        // Read the user's input and set the swim property of the first Bird object        
        System.out.println("Can your bird swim? (true/false)");
        
        // Read the user's input and set the swim property of the first Bird object
        birdy_1.setSwim(scanner.nextBoolean());

        // Consume the newline character left by nextBoolean()
        scanner.nextLine(); // Consume the newline character left by nextBoolean()

        // Prompt the user for input to set the properties of the second Bird object
        System.out.println("What is your second bird");

        // Read the user's input and set the name of the second Bird object
        birdy_2.setName(scanner.nextLine());

        // Read the user's input and set the fly property of the second Bird object
        System.out.println("Can the second bird fly? (true/false)");

        // Read the user's input and set the fly property of the second Bird object
        birdy_2.setFly(scanner.nextBoolean());
        
        // Read the user's input and set the swim property of the second Bird object
        System.out.println("Can the second bird swim? (true/false)");
        
        // Read the user's input and set the swim property of the second Bird object
        birdy_2.setSwim(scanner.nextBoolean());

        // Consume the newline character left by nextBoolean()
        scanner.nextLine(); // Consume the newline character left by nextBoolean()

        // Print the properties of the Bird objects and the Duck object
        System.out.println("Here are the properties of your birds:");
        System.out.println(birdy_1.toString());
        System.out.println(birdy_2.toString());


        

        // Print the properties of the Duck object
        System.out.println("Here are the properties of your duck:");
        System.out.println(duck.toString());
        System.out.println(duck.swim());
        System.out.println(duck.makeSound());
    }

}

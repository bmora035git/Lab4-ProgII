
import java.util.Scanner;

public class BirdTester {

    public static void main(String[] args) {
        Bird birdy_1 = new Bird();
        Bird birdy_2 = new Bird();
        Duck duck = new Duck();
        Scanner scanner = new Scanner(System.in);
        
        
       
        
        System.out.println("Is your bird a duck or a sparrow? (Enter 'duck' or 'sparrow')");
        birdy_1.setName(scanner.nextLine());

        System.out.println("Can your bird fly? (true/false)");
        birdy_1.setFly(scanner.nextBoolean());
        
        System.out.println("Can your bird swim? (true/false)");
        birdy_1.setSwim(scanner.nextBoolean());

        System.out.println("What is your second bird");
        birdy_2.setName(scanner.nextLine());
        birdy_2.setName(scanner.nextLine());

        System.out.println("Can the second bird fly? (true/false)");
        birdy_2.setFly(scanner.nextBoolean());
        
        System.out.println("Can the second bird swim? (true/false)");
        birdy_2.setSwim(scanner.nextBoolean());

          
        

        System.out.println(birdy_1.toString());
        System.out.println(birdy_2.toString());


        

        
        System.out.println(duck.swim());
        System.out.println(duck.makeSound());
    }

}

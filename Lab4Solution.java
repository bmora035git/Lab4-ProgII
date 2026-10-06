class Bird {
	private String name;
	private boolean fly;
	private boolean swim;

	public Bird() {
		name = "bird";
		fly = true;
		swim = false;
	}

	public Bird(String name, boolean fly, boolean swim) {
		this.name = name;
		this.fly = fly;
		this.swim = swim;
	}

	public String getName() {
		return name;
	}

	public boolean canFly() {
		return fly;
	}

	public boolean canSwim() {
		return swim;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}

	public String toString() {
		String state = "This is a(n) " + name + ".\n";
		state += fly ? "It can fly.\n" : "It cannot fly.\n";
		state += swim ? "It can swim.\n" : "It cannot swim.\n";

		return state;
	}
}

class Duck extends Bird {
	public Duck() {
		super("duck", true, true);
	}

	public String swim() {
		return "The duck swims in the everglades.";
	}

	public String makeSound() {
		return "Quack quack!";
	}
}

// BirdDemo
public class Lab4Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
        Duck duck = new Duck();

        // The bird can fly and cannot swim.
        System.out.println(bird.toString());

        // The duck can fly and can swim.
        System.out.println(duck.toString());
        // The duck swims in the everglades.
        System.out.println(duck.swim());
        // Quack quack!
        System.out.println(duck.makeSound());
    }
}
public class Bird {
    private String name;
    private boolean fly;
    private boolean swim;

    public Bird() {
        this.name = "Bird";
        this.fly = true;
        this.swim = false;
    }

    public Bird(String name, boolean fly, boolean swim) {
        this.name = name;
        this.fly = fly;
        this.swim = swim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean canFly() {
        return fly;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    

    public boolean canSwim() {
        return swim;
    }



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

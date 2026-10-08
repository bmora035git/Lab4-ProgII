public class Bird {
    private String name;
    private boolean fly;
    private boolean swim;

    public Bird() {
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

    public boolean getSwim() {
        return swim;
    }

    public boolean canSwim() {
        return swim;
    }

    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", fly=" + fly +
                ", swim=" + swim +
                '}';
    }
}

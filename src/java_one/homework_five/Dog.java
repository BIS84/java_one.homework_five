package java_one.homework_five;

public class Dog extends Animal {

    public Dog(String name, int run, float jumpHeight, int swim) {
        super(name, run, jumpHeight);
        this.swim = swim;
    }

    public void swim() { System.out.println(name + " swam " + swim + " m");}
}

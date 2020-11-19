package java_one.homework_five;

import java.util.Random;

public class Dog extends Animal {

    public Dog(String name, float jumpHeight, int run, int swim) {
        super(name, jumpHeight);

        Random RANDOM = new Random();
        int random200 = RANDOM.nextInt(200);

        this.swim = swim;
        this.run = run + random200;
    }

    public void swim() { System.out.println(name + " swam " + swim + " m");}
}

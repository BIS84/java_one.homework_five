package java_one.homework_five;

public class Main {
    public static void main(String [] args) {
        Dog dog1 = new Dog("Archie", 500, 0.5f, 10);
        Dog dog2 = new Dog("Bublik", 500, 0.5f, 10);
        Cat cat1 = new Cat("Amurka", 200, 2f);
        Cat cat2 = new Cat("Bagheera", 200, 2f);

        dog1.run(100);
        dog1.swim();
        dog1.jumpOverObstacles();
        System.out.println();
        dog2.run(600);
        dog2.swim();
        dog2.jumpOverObstacles();
        System.out.println();
        cat1.run(150);
        cat1.jumpOverObstacles();
        System.out.println();
        cat2.run(250);
        cat2.jumpOverObstacles();

    }


}

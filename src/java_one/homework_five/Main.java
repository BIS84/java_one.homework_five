package java_one.homework_five;

public class Main {
    public static void main(String [] args) {
        Dog dog1 = new Dog("Archie", 0.5f, 400, 10);
        Dog dog2 = new Dog("Bublik", 0.5f, 400, 10);
        Cat cat1 = new Cat("Amurka", 2f, 200);
        Cat cat2 = new Cat("Bagheera", 2f, 200);

        System.out.println(dog1.getName());
        dog1.run(100);
        dog1.swim();
        dog1.jumpOverObstacles();
        System.out.println("run max = " + dog1.getRun());
        System.out.println();

        System.out.println(dog2.getName());
        dog2.run(600);
        dog2.swim();
        dog2.jumpOverObstacles();
        System.out.println("run max = " + dog2.getRun());
        System.out.println();

        cat1.run(50);
        cat1.jumpOverObstacles();
        System.out.println();

        cat2.run(250);
        cat2.jumpOverObstacles();

    }


}

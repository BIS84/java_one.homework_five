package java_one.homework_five;

public abstract class Animal {
    protected String name;
    protected int run;
    protected int swim;
    protected float jumpHeight;

    public Animal(String name, int run, float jumpHeight) {
        this.name = name;
        this.run = run;
        this.jumpHeight = jumpHeight;
    }

    public void run(int runCommand) {
        if (run >= runCommand) {
            System.out.println(name + " run " + runCommand + " m");
        } else { System.out.println(name + " What are you? I won't run that much.");}
    }

    public void jumpOverObstacles() { System.out.println(name + " jump over obstacles " + jumpHeight + " m");}
}

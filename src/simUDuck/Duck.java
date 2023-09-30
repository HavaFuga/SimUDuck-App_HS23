package src.simUDuck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    protected void performQuack()  {
        quackBehaviour.quack();
    }

    protected void performFly() {
        flyBehaviour.fly();
    }

    protected void swim() {
        System.out.println("i swim");
    }

    protected void display() {
        System.out.println("Ich bin eine Ente");
    }

    protected void fly() {
        System.out.println("i fly");
    }
}

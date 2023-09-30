package src.simUDuck;

public class RubberDuck extends Duck{
    QuackBehaviour quackBehaviour = new MuteQuack();
    @Override
    protected void display() {
        System.out.println("i am yellow");
    }

    @Override
    protected void performQuack() {
        quackBehaviour.quack();
    }

}

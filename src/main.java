package src;

public class main {
    public static void main(String[] args) {
        Duck m = new MallardDuck();
        Duck r = new RedheadDuck();
        MallardDuck md = new MallardDuck();


        m.display();
        r.display();
        md.display();
        md.swim();
    }
}

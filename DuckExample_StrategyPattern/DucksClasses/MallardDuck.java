import FlyClasses.FlyWithWings;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        ﬂyBehavior = new FlyWithWings();
    }
        public void display() {
            System.out.println("I’m a real Mallard duck");
        }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.display();
        System.out.println("Before changing a duck’s behavior at runtime");
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        System.out.println("After changing a duck’s behavior at runtime");
        model.performFly();
    }
}
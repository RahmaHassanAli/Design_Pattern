public class Troll extends Character{
    public Troll(){
        weapon = new AxeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm a Troll");
    }
}

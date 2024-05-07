public class Queen extends Character{
    public Queen(){
       weapon = new KnifeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm a Queen");
    }
}

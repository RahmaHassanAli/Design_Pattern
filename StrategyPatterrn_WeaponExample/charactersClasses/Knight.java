public class Knight extends Character{
    public Knight(){
        weapon = new BowAndArrowBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm a Knight");
    }
}

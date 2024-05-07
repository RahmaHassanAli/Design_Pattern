public class King extends Character{
    public King(){
        weapon = new SwordBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm a King");
    }
}

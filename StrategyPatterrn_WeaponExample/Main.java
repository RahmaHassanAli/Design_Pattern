// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();
        queen.chooseWeapon();
        Character king = new King();
        king.fight();
        king.chooseWeapon();
        Character knight = new Knight();
        knight.fight();
        knight.chooseWeapon();
        Character troll = new Troll();
        troll.fight();
        troll.chooseWeapon();
    }
}
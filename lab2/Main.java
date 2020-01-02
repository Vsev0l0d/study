import ru.ifmo.se.pokemon.*;
import Pokemon.*;
public class Main {

    public static void main(String[] args) {


       Battle b = new Battle();

        Pichu p1 = new Pichu("Иван", 100);
        Pikachu p2 = new Pikachu("Борис", 100);
        Raichu p3 = new Raichu("Гавриил", 100);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        Corphish p4 = new Corphish("Алекс", 1);
        Crawdaunt p5 = new Crawdaunt("Джон", 1);
        Solrock p6 = new Solrock("Бил", 1);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}

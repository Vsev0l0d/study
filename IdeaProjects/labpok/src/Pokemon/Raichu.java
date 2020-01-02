package Pokemon;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Raichu extends Pikachu {
    public Raichu(String name, int level){
        super(name , Math.max(level, 50));
        setStats(60, 90, 55, 90, 80, 110);
        addMove(new WildCharge());
    }
}

package Pokemon;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Crawdaunt extends Corphish {
    public Crawdaunt(String name, int level){
        super(name , level);
        setStats(63, 120, 85, 90, 55, 55);
        addType(Type.DARK);
        addMove(new Swift());
    }
}

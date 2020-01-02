package Pokemon;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Pikachu extends Pichu{
    public Pikachu(String name, int level){
        super(name , Math.max(level, 50));
        setStats(35, 55, 40, 50, 50, 90 );
        addMove(new Nuzzle());
    }
}

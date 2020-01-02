package Pokemon;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Pichu extends Pokemon {
    public Pichu(String name, int level){
        super(name , Math.max(level, 50));
        setStats(20, 40,15, 35, 35, 60);
        setType(Type.ELECTRIC);
        setMove(new Thunder(), new ThunderWave());
    }
}

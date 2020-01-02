package Pokemon;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Corphish extends Pokemon {
    public Corphish(String name, int level){
        super(name , level);
        setStats(43, 80, 65, 50, 35, 35);
        setType(Type.WATER);
        setMove(new NightSlash(), new Scald(), new Leer());
    }
}
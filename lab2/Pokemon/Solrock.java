package Pokemon;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Solrock extends Pokemon {
    public Solrock(String name, int level){
        super(name , level);
        setStats(90, 95, 85, 55, 65, 70);
        setType(Type.ROCK, Type.PSYCHIC);
        setMove(new Confusion(), new Swagger(), new RockThrow(), new RockTomb());
    }
}

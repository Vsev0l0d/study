package Moves;
import ru.ifmo.se.pokemon.*;
public class RockThrow extends PhysicalMove {
    public RockThrow(){
        super(Type.ROCK, 50,0.9);
    }

    @Override
    protected String describe(){
        return "использует Rock Throw";
    }
}

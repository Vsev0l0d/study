package Moves;
import ru.ifmo.se.pokemon.*;
public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK, 50, 0.8);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe(){
        return "использует Rock Tomb";
    }
}

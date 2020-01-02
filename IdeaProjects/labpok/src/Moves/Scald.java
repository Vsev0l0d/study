package Moves;
import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.burn;

public class Scald extends SpecialMove {
    public Scald(){
        super(Type.WATER, 80, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        new Effect().chance(0.3).condition(Status.BURN).burn(def);
    }

    @Override
    protected String describe(){
        return "использует Scald";
    }
}

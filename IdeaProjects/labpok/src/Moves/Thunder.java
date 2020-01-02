package Moves;
import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.paralyze;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 120,0.8);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        def.addEffect(new Effect().chance(0.3).turns(0).condition(Status.PARALYZE));
    }

    @Override
    protected String describe(){
        return "использует Thunder";
    }
}

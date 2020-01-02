package Moves;
import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.paralyze;

public class ThunderWave extends StatusMove{
    public ThunderWave(){
        super(Type.ELECTRIC, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        paralyze(def);
    }

    @Override
    protected String describe(){
        return "использльзует Thunder Wave";
    }
}

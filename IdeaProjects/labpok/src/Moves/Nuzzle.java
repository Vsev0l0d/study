package Moves;
import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.paralyze;

public class Nuzzle extends PhysicalMove {
    public Nuzzle(){
        super(Type.ELECTRIC, 20, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        paralyze(def);
    }

    @Override
    protected String describe(){
        return "использует Nuzzle";
    }
}

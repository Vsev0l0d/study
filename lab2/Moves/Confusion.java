package Moves;
import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.confuse;

public class  Confusion extends SpecialMove {
    public Confusion(){
        super(Type.PSYCHIC,50,1);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        double Random = Math.random();
        if (Random < 0.1) {def.confuse();}
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe(){
        return "использует Confusion";
    }
}

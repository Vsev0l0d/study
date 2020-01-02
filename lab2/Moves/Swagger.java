package Moves;
import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0,0.9);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.ATTACK, 2);
        def.confuse();
    }

    @Override
    protected String describe(){
        return "использует Swagger";
    }
}

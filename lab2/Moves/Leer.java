package Moves;
import ru.ifmo.se.pokemon.*;
public class Leer extends StatusMove {
    public Leer(){
        super(Type.NORMAL,0,1);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe(){
        return "использует Leer";
    }
}

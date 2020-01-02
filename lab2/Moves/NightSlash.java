package Moves;
import ru.ifmo.se.pokemon.*;
public class NightSlash extends PhysicalMove {
    public NightSlash(){
        super(Type.DARK, 70, 1);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 2.0D;
    }

    @Override
    protected String describe(){
        return "использует Night Slash";
    }
}

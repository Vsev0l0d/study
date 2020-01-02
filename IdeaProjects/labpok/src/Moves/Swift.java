package Moves;
import ru.ifmo.se.pokemon.*;
public class Swift extends SpecialMove {
    public Swift(){
        super(Type.NORMAL, 60, 1);
    }
    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe(){
        return "использует Swift";
    }
}

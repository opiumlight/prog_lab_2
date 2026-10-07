package pokemon;
import move.physical.Facade;
import move.special.Acid;
import move.status.SwordsDance;
import ru.ifmo.se.pokemon.*;

public class Gloom extends Oddish {
    public Gloom (String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(60, 65, 70, 85, 75, 40);
        this.addMove(new Acid());
    }
}

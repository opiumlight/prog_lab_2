package pokemon;
import move.physical.RazorShell;
import move.physical.XScissor;
import move.status.HoneClaws;
import ru.ifmo.se.pokemon.*;

public class Binacle extends Pokemon {
    public Binacle (String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.WATER);
        setStats(42, 52, 67, 39, 56, 50);
        this.addMove(new HoneClaws());
        this.addMove(new XScissor());
        this.addMove(new RazorShell());
    }
}

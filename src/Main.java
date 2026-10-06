import ru.ifmo.se.pokemon.Battle;
import pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Barbaracle("Tohno", 8));
        b.addAlly(new Gloom("Aozaki", 12));
        b.addAlly(new Stantler("Ryogi", 10));

        b.addFoe(new Bellossom("Einzbern", 10));
        b.addFoe(new Oddish("Emiya", 8));
        b.addFoe(new Binacle("Tohsaka", 12));

        b.go();
    }
}

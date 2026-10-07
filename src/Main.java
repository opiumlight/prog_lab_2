import ru.ifmo.se.pokemon.Battle;
import pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Barbaracle("Tohno", 10));
        b.addAlly(new Gloom("Aozaki", 10));
        b.addAlly(new Stantler("Ryogi", 10));

        b.addFoe(new Bellossom("Einzbern", 10));
        b.addFoe(new Oddish("Emiya", 10));
        b.addFoe(new Binacle("Tohsaka", 10));

        b.go();
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class Colaheroes {
    private Queue<Heroe> cola;

    public Colaheroes() {
        cola = new LinkedList<>();
    }

    public void agregarHeroes() {
        cola.add(new Heroe());

        cola.add(new Heroe("Iron Man", "Humano", 120, "Tecnología"));
        cola.add(new Heroe("Deadpool", "Mutante", 150, "Regeneración"));
        cola.add(new Heroe("Thor", "Alienígena", 180, "Martillo Eléctrico"));
        cola.add(new Heroe("Spider Man", "Mutante", 200, "Aracnido"));
    }

    public void mostrarHeroes() {
        for (Heroe h : cola) {
            h.mostrarHeroe();
        }
    }
}

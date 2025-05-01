public class Heroe {
    private String nombre;
    private String raza;
    private int nivelP;
    private String habilidad;

    public Heroe() {
        this.nombre = "Eso Tilin";
        this.raza = "Humano";
        this.nivelP = 100;
        this.habilidad = "Bueno con las armas";
    }

    public Heroe(String nombre, String raza, int nivelP, String habilidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelP = nivelP;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getNivelPoder() {
        return nivelP;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public double calcularPoderTotal() {
        double poder = nivelP;
        switch (raza) {
            case "Mutante":
                poder *= 1.3;
                break;
            case "Alienígena":
                poder *= 1.5;
                break;
            case "Humano":
            default:
                break;
        }
        return poder;
    }


    public void mostrarHeroe() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Nivel de Poder: " + nivelP);
        System.out.println("Habilidad: " + habilidad);
        System.out.println("Poder Total: " + calcularPoderTotal());
        System.out.println("--------------------------");
    }
}


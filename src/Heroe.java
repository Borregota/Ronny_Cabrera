public class Heroe {
    private String nombre;
    private String raza;
    private int nivelP;
    private String habilidad;

    public Heroe(String nombre, String raza, int nivelP, String habilidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelP = nivelP;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNivelP() {
        return nivelP;
    }

    public void setNivelP(int nivelP) {
        this.nivelP = nivelP;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}

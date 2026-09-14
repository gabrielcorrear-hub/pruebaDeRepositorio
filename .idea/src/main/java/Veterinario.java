public class Veterinario {
    //Atributos
    private String nombre;
    private int numLicencia;

    //Constructor
    public Veterinario(String nombre, int numLicencia) {
        this.nombre = nombre;
        this.numLicencia = numLicencia;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    //Mostrar la información del veterinario
    @Override
    public String toString() {
        return
                nombre +
                ", numLicencia:" + numLicencia;
    }
}

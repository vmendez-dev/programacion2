public class Autor {
    //Constructor:
    public Autor(String nombre, String nacionalidad, int anioNacimiento){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.anioNacimiento=anioNacimiento;
    }

    //Atributos:
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    //Métodos:
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }
}

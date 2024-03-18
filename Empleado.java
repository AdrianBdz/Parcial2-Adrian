/**
 * Clase que representa a un empleado.
 */
public class Empleado {
    /**
     * Nombre del empleado.
     */
    private String nombre;
    
    /**
     * Cargo del empleado.
     */
    private String cargo;
    
    /**
     * Salario del empleado.
     */
    private double salario;
    
    /**
     * Constructor de la clase Empleado.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Método getter para el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para el nombre del empleado.
     * @param nombre Nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para el cargo del empleado.
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Método setter para el cargo del empleado.
     * @param cargo Nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Método getter para el salario del empleado.
     * @return Salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Método setter para el salario del empleado.
     * @param salario Nuevo salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método que devuelve una representación en forma de cadena del objeto Empleado.
     * @return Representación en forma de cadena del objeto Empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
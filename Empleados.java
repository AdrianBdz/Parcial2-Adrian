/**
 * Clase que gestiona a un conjunto de empleados.
 */
public class Empleados {
    /**
     * Lista de empleados.
     */
    private Empleado[] lista;
    
    /**
     * Constructor de la clase Empleados.
     */
    public Empleados() {
        lista = new Empleado[0];
    }
    
    /**
     * Método para dar de alta un nuevo empleado.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public void altaEmpleado(String nombre, String cargo, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, cargo, salario);
        Empleado[] nuevaLista = new Empleado[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            nuevaLista[i] = lista[i];
        }
        nuevaLista[lista.length] = nuevoEmpleado;
        lista = nuevaLista;
    }
    
    /**
     * Método para aumentar el salario de todos los empleados.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
    
    /**
     * Método para mostrar la lista de empleados.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4copia;


import java.util.List;

/**
 *
 * @author María Navarro Elbal
 */
public class Profesor extends Persona {
    private String nombre;
    private int edad;
    private List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, int edad) {
      super(numeroDeTelefono);
      this.edad = edad;
    }


    
     public void printTodaInformacionPersonal() {
        printInformacionPersonal( );
        for (Prestamo p: getPrestamos()){
            System.out.println(p);
        }
     
     }

    public void printInformacionPersonal() {
        System.out.println("Profesor{" + "str=" + getNombre() + ", edad=" + getEdad() + ", numeroDeTelefono=" + numeroDeTelefono );
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the prestamos
     */
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * @param prestamos the prestamos to set
     */
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
    
}

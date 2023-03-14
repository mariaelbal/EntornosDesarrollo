/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4;

import java.util.List;

/**
 *
 * @author María Navarro Elbal
 */
public class Profesor extends Persona {
    
    //refactor rename
    private String nombre;
    private int edad;
    private List<Prestamo> prestamos;
    
    //refactor --safedelete 

    public Profesor(String numeroDeTelefono) {
      super(numeroDeTelefono);
    }

    //refactor safely delete (nombre del metodo)
   
    public void printInformacionPersonal() {
        System.out.println("Profesor{" + "str=" + getNombre() + ", edad=" + getEdad() + ", numeroDeTelefono=" + telefono );
    }

     public void printTodaInformacionPersonal() {
       
         //refactor introduce method
         printInformacionPersonal( );
        for (Prestamo p: getPrestamos()){
            System.out.println(p);
        }
     
     }
     
     
     //refactor encapsulated field
   
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

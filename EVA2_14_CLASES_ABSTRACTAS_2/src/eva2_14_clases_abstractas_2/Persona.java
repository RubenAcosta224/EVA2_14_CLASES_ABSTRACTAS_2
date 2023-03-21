/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_clases_abstractas_2;

/**
 *
 * @author invitado
 */
public abstract class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    //los metodos abstractos pueden coexistir con metodos normales
    
    //si usas metodos abstractos la clase tiene que serlo tambien
    public abstract void imprimirDatos();
}

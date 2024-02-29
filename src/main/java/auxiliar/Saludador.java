/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxiliar;

/**
 *
 * @author Diurno
 */
public class Saludador {

    private int contador;
    private String idioma;

    
    /**
     * pone el contador a 0 y selecciona un idioma
     *  
     */
    public Saludador(String idioma) {
        this.contador = 0;
        this.idioma = idioma;
    }

    public Saludador(int contador, String idioma) {
        this.contador = contador;
        this.idioma = idioma;
    }
/**
 * pone el constructor a 0 
 *  
 */
    public Saludador() {
        contador = 0;
        idioma = "ES";
    }
/**
 * saluda 
 * 
 * 
 * 
 *   (tambien devuelve el contador de las veces que se han saludado)
 *  
 */
    public String saludar() {
        contador++;
        if (idioma.equals("ES")) {
            return "Hola (" + contador + ")";
        }
        return "Hello (" + contador + ")";
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
/**
 * acceso al contador 
 * @return un entero con el numero de veces que se ha llamado a saludar
 */
    public int getContador() {
        return contador;
    }
}
// el set modifica el dato y el get hace que llamemos al dato
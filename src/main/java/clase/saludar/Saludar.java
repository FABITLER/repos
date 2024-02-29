/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package clase.saludar;

import auxiliar.Saludador;

/**
 * 9º
 *               
 * @author Diurno
 */
public class Saludar {
    
    public static void main(String[] args) {
        Saludador s3 = new Saludador();
        Saludador s1 = new Saludador();
        Saludador s2 = new Saludador();
        s1.setIdioma("EN");
        System.out.println(s1.saludar());
        System.out.println(s1.saludar());
        System.out.println(s1.saludar());
        System.out.println(s2.saludar());
        System.out.println(s2.saludar());
        System.out.println(s2.saludar());
        
    }
}


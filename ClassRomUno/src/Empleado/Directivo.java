/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Empleado;

/**
 * 
 * @author Gustavo <@LastShadow>
 */
public class Directivo extends Empleado{      
    
    public Directivo (String nombre){
        super.setNombre(nombre);
    }
    
    @Override
    public String toString(){
        return "Empleado " + super.getNombre() + " -> Directivo";
    }
}

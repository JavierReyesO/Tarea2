/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea2;

/**
 *
 * @author Javier
 */
public class ColorCreator extends Creator {
    @Override
    public BloqueColor crearBloque(){
        return new BloqueColor();
    }
    
}

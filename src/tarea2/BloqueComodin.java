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
public class BloqueComodin extends Bloque implements HabilityBehavior{
    public char color;
    public 
    
    BloqueComodin(){
    }
   
    void setBloqueComodin(char c){
        this.color=c;
    }
    
    char getBloqueComodin(){
        return this.color;
    }
   
    @Override
    public int Hability(int a) {
        return 0; 
    }
    
    @Override
    public void DestruirBloque(){
        this.color=' ';
    }
    
}

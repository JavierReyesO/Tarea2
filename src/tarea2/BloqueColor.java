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
public class BloqueColor extends Bloque{
    private char color;
    static int BR=0, BB=0, BG=0, BY=0, BO=0;

    BloqueColor() {
    }
    
    char getBloqueColor(){
        return this.color;
    }
    
    void setBloqueColor(char c){
        this.color = c;
    }
    
    @Override
    public void DestruirBloque(){
        switch (this.color){
            case 'R':
                BR++;
                break;
            case 'B':
                BB++;
                break;
            case 'G':
                BG++;
                break;
            case 'Y':
                BY++;
                break;
            case 'O':
                BO++;
                break;
        }
    }
}


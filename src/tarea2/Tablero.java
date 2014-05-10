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

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;
import java.lang.*;


public class Tablero extends JPanel implements Runnable{
    private Thread hilo;
    private int x,y;
    
    /* CONSTRUCTOR DEL PANEL EN EL QUE SE ESTABLECEN ALGUNAS
    CONFIGURACION COMO EL COLOR DE FONDO, DOBLE BUFFER,
    INICIALIZACION DE IMAGENES, X,Y */
    public Tablero(){
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        //INICIALIZACIONES
    }
    
    /* ESTE METODO SE LLAMA AUTOMATICAMENTE AL AGREGAR EL PANEL
    A LA VENTANA */
    @Override
    public void addNotify(){
        super.addNotify();
        //CREAMOS UN NUEVO HILO Y LO INICIAMOS
        hilo = new Thread(this);
        hilo.start();
    }
    
    /* METODO QUE SE ENCARGA DE PINTAR EN EL PANEL */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //CREAMOS UN LIENZO 2D CON EL LIENZO POR DEFECTO
        Graphics2D g2 = (Graphics2D)g;
        //DIBUJAMOS
        //LIBERAMOS LIENZO
        g.dispose();
    }
    
    /* METODO DONDE SE ACTUALIZAN LAS COORDENADAS PARA LAS
    POSICIONES DE LAS IMAGNES */
    public void ciclo(){
        x += 1;
        y += 1;
    }
 
    /* METODO DEFINIDO DE LA INTERFAZ RUNNABLE, AQUI IRA EL CICLO
    PRINCIPAL DEL JUEGO, SE CALCULAN LAS POSICIONES, SE MANDA REPINTAR,
    SE ESTABLECE UN TIEMPO DE ESPERA RAZONABLE ENTRE (FRAMERATE) */
    @Override
    public void run() {
        while(true){
            ciclo();
            repaint();
            
            
        }
    }
}

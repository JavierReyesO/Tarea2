/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea2;



import javax.swing.JFrame;
//import java.util.Random;
//import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Main extends JFrame{
    
    static void Cambio(Bloque tablero[][],int x1,int y1, int x2, int y2){
            int XY1 ,XY2;
            char temporal;
            
            if(tablero[x1][y1] instanceof BloqueColor){XY1 = 0;}
            else{XY1 = 1;}
            if(tablero[x2][y2] instanceof BloqueColor){XY2 = 0;}
            else{XY2 = 1;}
            
           
            if (XY1==0 && XY2==0){
                temporal=((BloqueColor)tablero[x1][y1]).getBloqueColor();
                ((BloqueColor) tablero[x1][y1]).setBloqueColor(((BloqueColor) tablero[x2][y2]).getBloqueColor());
                ((BloqueColor) tablero[x2][y2]).setBloqueColor(temporal);                
            }
            else if (XY1==0 && XY2==1){
                temporal=((BloqueColor) tablero[x1][y1]).getBloqueColor();
                tablero[x1][y1]= new ComodinCreator().crearBloque();
                ((BloqueComodin) tablero[x1][y1]).setBloqueComodin(((BloqueComodin) tablero[x2][y2]).getBloqueComodin());
                tablero[x2][y2]= new ColorCreator().crearBloque();
                ((BloqueColor) tablero[x2][y2]).setBloqueColor(temporal);                
            }
            else if (XY1==1 && XY2==0){
                temporal=((BloqueComodin) tablero[x1][y1]).getBloqueComodin();
                tablero[x1][y1]= new ColorCreator().crearBloque();
                ((BloqueColor) tablero[x1][y1]).setBloqueColor(((BloqueColor) tablero[x2][y2]).getBloqueColor());
                tablero[x2][y2]= new ComodinCreator().crearBloque();
                ((BloqueComodin) tablero[x2][y2]).setBloqueComodin(temporal);                
            }
            else if (XY1==1 && XY2==1){
                temporal=((BloqueComodin) tablero[x1][y1]).getBloqueComodin();
                ((BloqueComodin) tablero[x1][y1]).setBloqueComodin(((BloqueComodin) tablero[x2][y2]).getBloqueComodin());
                ((BloqueComodin) tablero[x2][y2]).setBloqueComodin(temporal);                
            }        
    }
    
    //wea
    
    static void ImprimirTablero(Bloque tablero[][]){
        System.out.print("\n\n\n\n\n\n\n");
        System.out.println("    1  2  3  4  5  6  7  8  9  10 11 12 13 14 15");
        for (int i = 0; i < 15; i++) {
            if (i<9) System.out.print(i+1+"   ");
            else System.out.print(i+1+"  ");
            for (int j=0;j<15;j++){
                if(tablero[i][j] instanceof BloqueColor){
                   System.out.print(((BloqueColor) tablero[i][j]).getBloqueColor()+"  "); 
                }
                else{
                    System.out.print(((BloqueComodin) tablero[i][j]).getBloqueComodin()+"  "); 
                }
                
            }
           System.out.print("\n");
        }
        System.out.print("\n");
    
    }
    
    
    
    //private static JFrame ventanita;
    
    public static void main(String[] args) {
        //ventanita = new JFrame("CandyCrush");
        //ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventanita.setSize(600,600);
        //ventanita.setResizable(false);
        //ventanita.setVisible(true);
        /*int[] meta = new int[5];
        
        System.out.println("Presione la tecla ENTER para comenzar el juego\n");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.println("Indique cantidad romper de cada color para ganar:\n");
        System.out.print("Bloques Rojos:");
        meta[0]=scan.nextInt();        
        System.out.print("\nBloques Azules:");
        meta[1]=scan.nextInt();
        System.out.print("\nBloques Verdes:");
        meta[2]=scan.nextInt();
        System.out.print("\nBloques Amarillos:");
        meta[3]=scan.nextInt();
        System.out.print("\nBloques Naranjos:");
        meta[4]=scan.nextInt();*/
        
        //System.out.println(R +"\n"+ B +"\n"+ G +"\n"+ Y +"\n"+ O+"\n");
        
        Bloque[][] tablero = new Bloque[15][15];
        
        for(int j=0;j<15;j++){
            for(int d=0;d<15;d++){
                int Probabilidad = (int)(Math.random()*100);                
                if(Probabilidad >= 95){
                    int PComodin = (int) (Math.random()*2);
                    if(PComodin == 0){
                        tablero[j][d] = new ComodinCreator().crearBloque();
                        ((BloqueComodin) tablero[j][d]).setBloqueComodin('$');
                    }
                    if(PComodin == 1){
                        tablero[j][d] = new ComodinCreator().crearBloque();
                        ((BloqueComodin) tablero[j][d]).setBloqueComodin('&');
                    }
                }
                else {
                    int PColor = (int) (Math.random()*5);
                    if(PColor == 0){
                        tablero[j][d] = new ColorCreator().crearBloque();
                        ((BloqueColor) tablero[j][d]).setBloqueColor('R');
                    }
                    if(PColor == 1){
                        tablero[j][d] = new ColorCreator().crearBloque();
                        ((BloqueColor) tablero[j][d]).setBloqueColor('B');
                    }
                    if(PColor == 2){
                        tablero[j][d] = new ColorCreator().crearBloque();
                        ((BloqueColor) tablero[j][d]).setBloqueColor('G');
                    }
                    if(PColor == 3){
                        tablero[j][d] = new ColorCreator().crearBloque();
                        ((BloqueColor) tablero[j][d]).setBloqueColor('Y');
                    }
                    if(PColor == 4){
                        tablero[j][d] = new ColorCreator().crearBloque();
                        ((BloqueColor) tablero[j][d]).setBloqueColor('O');
                    }
                }
            }
        }
        ImprimirTablero(tablero);
        //while(){
            
        //}
    }
    
}

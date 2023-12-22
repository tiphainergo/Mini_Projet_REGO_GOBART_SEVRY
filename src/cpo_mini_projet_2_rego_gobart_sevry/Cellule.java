/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_mini_projet_2_rego_gobart_sevry;

/**
 *
 * @author sevry
 */
public class Cellule {
    
    Cavalier etatcellule = null;
    boolean capturee = false;
    int X;
    int Y;
    boolean deplacementpossible = false;
    
    public Cellule(int x, int y){
        
        X = x;
        Y = y;
        
    }
    
    public void capturer(Cavalier cavalier){
        capturee = true;
        etatcellule = cavalier;
        cavalier.X = X;
        cavalier.Y = Y;
    }
    
    public void partir(){
        etatcellule = null;
    }
    
    public boolean capturee(){
        return capturee;
    }
    
    public void reset(){
        etatcellule = null;
        capturee = false;
    }
    
}
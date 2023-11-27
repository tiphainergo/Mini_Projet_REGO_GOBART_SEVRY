/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_mini_projet_2_rego_gobart_sevry;

import java.util.ArrayList;

/**
 *
 * @author regotiphaine
 */
public class Grille {
      
    int Ligne;
    int Colonne;
    Cellule[][] grille;
    
    public Grille(int ligne, int colonne){
        Ligne = ligne;
        Colonne = colonne;
        grille = new Cellule[Ligne][Colonne];   //grille de cellules que l'on créera à chaque niveau
        
        for(int k = 0; k < Ligne; k++){
            for (int i = 0; i < Colonne; i++){
                grille[k][i] = new Cellule(k, i);
            }
        }
        afficher_grille();
    }
    
    public boolean Cellule_capturee(int x, int y){
        return grille[x][y].capturee();
    }
    
    public void reset(){
        for(int k = 0; k < Ligne; k++){
            for (int i = 0; i < Colonne; i++){
                grille[k][i].reset();
            }
        }
    }
    
    public void afficher_grille(){
        for(int k = 0; k < Ligne; k++){
            for (int i = 0; i < Colonne; i++){
                if (grille[k][i].etatcellule != null){
                    System.out.print("[" + grille[k][i].capturee() + grille[k][i].etatcellule.Name + "]");
                }else{
                    System.out.print("[" + grille[k][i].capturee() + "]");
                }
                if(i == Colonne - 1){
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
    
    public boolean gagne(){
        for (int k=0; k< Ligne; k++){
            for (int i=0; i < Colonne ; i++){
                if (! grille[k][i].capturee()){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean perd(ArrayList<Cellule> liste_deplacements){
        if (liste_deplacements.size() == 0 && gagne() == false){
            return true;
        }
        return false;
    }
    
    public void prend_nouvelle_cellule(Cavalier cavalier, int x, int y){
        if (! grille[x][y].capturee){
            grille[cavalier.X][cavalier.Y].partir();
            grille[x][y].capturer(cavalier);
        }
    }
    
    public ArrayList<Cellule> deplacements_possibles(Cavalier cavalier){
        int x = cavalier.X;
        int y = cavalier.Y;
        ArrayList<Cellule> liste_deplacements = new ArrayList<Cellule>();
        
        int[] deplacements_x = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int[] deplacements_y = { 1, 2, 2, 1, -1, -2, -2, -1 };
        
        for (int i = 0; i < deplacements_x.length; i++) {
            int nouveau_x = x + deplacements_x[i];
            int nouveau_y = y + deplacements_y[i];
            
            if ((nouveau_x >= 0 && nouveau_x < Ligne && nouveau_y >= 0 && nouveau_y < Colonne) && (grille[nouveau_x][nouveau_y].capturee() == false)) {
                    liste_deplacements.add(grille[nouveau_x][nouveau_y]);
            }
        }
        return liste_deplacements;
    }
}


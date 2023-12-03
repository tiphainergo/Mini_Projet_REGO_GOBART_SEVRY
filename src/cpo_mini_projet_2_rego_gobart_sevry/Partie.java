/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_mini_projet_2_rego_gobart_sevry;

import java.util.ArrayList;

/**
 *
 * @author sevry
 */
public class Partie {

    Grille GrilleJeu;
    String Name;
    Joueur Joueur;
    String Couleur;
    private int level;

    public Partie(String name, String couleur) {
        Name = name;
        Couleur = couleur;
    }

    public void init_partie() {
        GrilleJeu = null;
        GrilleJeu = new Grille(levels[level][0], levels[level][1]);
        
    }

    public void debuterniveau() {
        init_player();
        init_partie();
        int nbrcoup = 0;

        System.out.println("Bienvenue dans le niveau " + Joueur.level);
    }

    private void init_player() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

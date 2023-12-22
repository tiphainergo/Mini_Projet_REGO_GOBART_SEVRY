/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_mini_projet_2_rego_gobart_sevry;

/**
 *
 * @author regotiphaine
 */
public class Joueur {
    
    String Nom;
    String Couleur;
    int level = 1;
    int score = 100;
    Cavalier cavalier;
    
    public Joueur(String nom, String couleur){
        Nom = nom;
        Couleur = couleur;
        cavalier = new Cavalier(Couleur);
    }
    
    public void set_color(String couleur){
        Couleur = couleur;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_mini_projet_2_rego_gobart_sevry;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sevry
 */
public class Partie {
    
    Grille GrilleJeu;
    String Name;
    Joueur Joueur;
    String Couleur;
    ArrayList<String> colorlist = new ArrayList<String>(){{
        add("Rouge");
        add("Jaune");
        add("Bleu");
        add("Vert");
        add("Noir");
        add("Blanc");
    }};
    
    int[][] levels = {
        {3, 3, 0, 0},
        {4, 3, 0, 1},
        {4, 4, 2, 2},
        {5, 5, 2, 2},
        {8, 8, 0, 0},
        {10, 5, 5, 2},
        {6, 8, 2, 4},
    };
    
    int[][] casecaptureedepart = {
        {1, 1},
        {},
        {},
        {},
        {},
        {},
        {}
    };
    
    int[] stats = new int[levels.length - 1];
    
    public Partie(String name, String couleur){
        Name = name;
        Couleur = couleur;
    }
        
    public void init_player(){
        Random generateurAleat = new Random();
        
        if (Couleur == null){
            int index_couleur = generateurAleat.nextInt(colorlist.size());
            String couleur = colorlist.get(index_couleur);
            System.out.println("Couleur " + colorlist.get(index_couleur));
        }
        
        Joueur = new Joueur(Name, Couleur);
        int level = Joueur.level - 1;
        Joueur.cavalier.set_coords(levels[level][2], levels[level][3]);     //penser à définir ses coordonnées sur la grille de jeu
    }
    
    public void init_partie(){        
        int level = Joueur.level - 1;
        Joueur.score = 100;
        GrilleJeu = null;
        GrilleJeu = new Grille(levels[level][0], levels[level][1]);
        GrilleJeu.grille[Joueur.cavalier.X][Joueur.cavalier.Y].capturer(Joueur.cavalier);
        for (int k=0; k < casecaptureedepart[level].length / 2; k++){
            GrilleJeu.grille[casecaptureedepart[level][2*k]][casecaptureedepart[level][2*k +1]].capturee = true;
        }
    }
    
    public void debuterniveau(){
        init_player();
        init_partie();
        int nbrcoup = 0;
        
        System.out.println("Bienvenue dans le niveau " + Joueur.level);
        
        ArrayList<Cellule> liste_deplacements = GrilleJeu.deplacements_possibles(Joueur.cavalier);
        afficher_deplacements(liste_deplacements);
        GrilleJeu.afficher_grille();
        
        while(true){
            
            jouer();

            nbrcoup++;
            liste_deplacements = GrilleJeu.deplacements_possibles(Joueur.cavalier);
            afficher_deplacements(liste_deplacements);
            GrilleJeu.afficher_grille();
            
            if (GrilleJeu.gagne()){
                System.out.println("Vous avez gagné !");
                stats[Joueur.level - 1] = nbrcoup;
                if (Joueur.level <= levels.length){
                    Joueur.level ++;
                    GrilleJeu.reset();
                    debuterniveau();
                }else{
                    System.out.println("Félicitation, vous avez fini le jeu !");
                    break;
                }
            }
            
            if (Joueur.score <= 0){
                System.out.println("Vous avez perdu ...");
                GrilleJeu.reset();
                debuterniveau();
                break;
            }
            
        }
        
    }
    
    public void jouer(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        
        do{
            System.out.println("Les coordonnées auxquels vous voulez vous déplacer");
            System.out.println("X : ");     //les x et y sont mélangés
            y = scanner.nextInt();
            System.out.println("Y : ");
            x = scanner.nextInt();
        }
        while(GrilleJeu.grille[x][y].capturee == true); //si la cellule est capturée, on continue de demander une nouvelle cellule
        
        if (GrilleJeu.prend_nouvelle_cellule(Joueur.cavalier, x, y) == false){
            Joueur.score -= 10;
        }
        System.out.println("Votre score est de " + Joueur.score + " %");
    }
    
    public void afficher_deplacements(ArrayList<Cellule> deplacements){
        for(int k = 0; k < deplacements.size(); k++){
            System.out.println("Case possible : " + deplacements.get(k).X + " " + deplacements.get(k).Y);
        }
    }
    
}
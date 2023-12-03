/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_mini_projet_2_rego_gobart_sevry;

/**
 *
 * @author sevry
 */
public class Cavalier {
    String Couleur;
    String Name = "Cavalier";
    int X;
    int Y;
    
    public Cavalier(String couleur){
        Couleur = couleur;
    }
    
    public void set_coords(int x, int y){
        X = x;
        Y = y;
    }
}

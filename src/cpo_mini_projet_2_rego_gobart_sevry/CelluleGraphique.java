
package cpo_mini_projet_2_rego_gobart_sevry;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sevry
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CelluleGraphique extends JButton{
    Cellule CelluleAssociee;
    ImageIcon imagecavalier;
    
    public CelluleGraphique(Cellule cellule){
        CelluleAssociee = cellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        
        boolean capturee = CelluleAssociee.capturee();
        Cavalier cavalier = CelluleAssociee.etatcellule;
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        
        if (CelluleAssociee.deplacementpossible){
            G.setColor(Color.red);
            G.fillRect(x - 10, y - 10, 20, 20);
        }
        
        if (capturee){
            setBackground(Color.BLUE);
        }else if(CelluleAssociee.deplacementpossible == false){
            setBackground(Color.GRAY);
        }
        
        if (cavalier != null){
            
            try{
                ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\cpo_mini_projet_2_rego_gobart_sevry\\cavalier.png");
                Image image = icon.getImage();
                ImageObserver imageObserver = icon.getImageObserver();
                int hauteur = (int) ((int) getWidth() * 0.3);
                int largeur = (int) ((int) getHeight() * 0.3);
                G.drawImage(image, x-(largeur/2), y-(hauteur/2), hauteur, largeur, imageObserver);
                
            } catch (Exception error) {
                System.out.println(error);
                Color couleur = Color.BLACK;
                switch(cavalier.Couleur){
                    case "Vert":
                        couleur = Color.GREEN;
                        break;
                    case "Noir":
                        couleur = Color.BLACK;
                        break;
                    case "Blanc":
                        couleur = Color.WHITE;
                        break;
                    case "Jaune":
                        couleur = Color.YELLOW;
                        break;
                }
                setBackground(couleur);
            }
        }
    }
}
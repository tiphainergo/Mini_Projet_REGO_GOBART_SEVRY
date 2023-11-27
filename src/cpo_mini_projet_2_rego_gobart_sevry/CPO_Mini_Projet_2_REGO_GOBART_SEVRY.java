/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpo_mini_projet_2_rego_gobart_sevry;

/**
 *
 * @author regotiphaine
 */
public class CPO_Mini_Projet_2_REGO_GOBART_SEVRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la_chevauchee_fantastique;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
public class La_chevauchee_fantastique extends javax.swing.JFrame {
    int nbrcoup;
    boolean gagne = false;
    Partie partie;
    ArrayList<Cellule> liste_deplacements = new ArrayList<Cellule>();
    ArrayList<String> colorlist = new ArrayList<String>(){{
        add("Jaune");
        add("Vert");
        add("Noir");
        add("Blanc");
    }};
    int[] stats = {0, 0, 0, 0, 0, 0, 0};  /**
     * Creates new form La_chevauchee_fantastique
     */
    public La_chevauchee_fantastique() {
        initComponents();
        deplacementspossibles.setEnabled(false);
        infos.setText("Bienvenue dans 'La chevauchée magique' !");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label4 = new java.awt.Label();
        grille = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Titre = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        nom = new javax.swing.JTextField();
        jouer = new javax.swing.JButton();
        couleur = new javax.swing.JComboBox<>();
        demande_couleur = new java.awt.Label();
        niveau = new java.awt.Label();
        demande_pseudo1 = new java.awt.Label();
        deplacementspossibles = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        score1 = new java.awt.Label();
        score2 = new java.awt.Label();
        score4 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        score3 = new java.awt.Label();
        label10 = new java.awt.Label();
        score7 = new java.awt.Label();
        label12 = new java.awt.Label();
        score6 = new java.awt.Label();
        label14 = new java.awt.Label();
        score5 = new java.awt.Label();
        label3 = new java.awt.Label();
        label9 = new java.awt.Label();
        label6 = new java.awt.Label();
        infos = new java.awt.TextArea();

        label4.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label4.setText("Niveau 2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jeu");

        grille.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        grille.setPreferredSize(new java.awt.Dimension(0, 0));
        grille.setLayout(new java.awt.GridLayout(1, 0));

        Titre.setEditable(false);
        Titre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Titre.setForeground(new java.awt.Color(0, 153, 153));
        Titre.setText("La chevauchée Frantastique");
        Titre.setName("title"); // NOI18N
        jScrollPane1.setViewportView(Titre);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        nom.setText("Nom");

        jouer.setBackground(new java.awt.Color(204, 0, 102));
        jouer.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jouer.setText("Jouer");
        jouer.setToolTipText("");
        jouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jouerActionPerformed(evt);
            }
        });

        couleur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vert", "Jaune", "Blanc", "Noir" }));

        demande_couleur.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        demande_couleur.setText("Choisissez votre couleur");

        niveau.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        niveau.setText("Niveau 1");

        demande_pseudo1.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        demande_pseudo1.setText("Entrez votre Pseudo");

        deplacementspossibles.setBackground(new java.awt.Color(204, 0, 102));
        deplacementspossibles.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        deplacementspossibles.setText("Voir déplacements");
        deplacementspossibles.setToolTipText("");
        deplacementspossibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deplacementspossiblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(demande_couleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deplacementspossibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jouer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nom)
                    .addComponent(couleur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(demande_pseudo1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(niveau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(couleur, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demande_couleur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jouer)
                    .addComponent(deplacementspossibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(demande_pseudo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(137, 137, 137)))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setAutoscrolls(true);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        label1.setText("-- Statistiques --");

        label2.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label2.setText("Niveau 1");

        score1.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        score1.setText("0");

        score2.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        score2.setText("0");

        score4.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        score4.setText("0");

        label7.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label7.setText("Niveau 4");

        label8.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label8.setText("Niveau 2");

        score3.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        score3.setText("0");

        label10.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label10.setText("Niveau 7");

        score7.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        score7.setText("0");

        label12.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label12.setText("Niveau 6");

        score6.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        score6.setText("0");

        label14.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label14.setText("Niveau 5");

        score5.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        score5.setText("0");

        label3.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        label3.setText("Score");

        label9.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        label9.setText("Niveau 3");

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("Informations");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(infos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(score4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(score5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(score6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(score7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(infos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grille, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        grille.getAccessibleContext().setAccessibleName("grille");
        grille.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void layout_grille(){
        grille.setLayout(new GridLayout(partie.GrilleJeu.Ligne, partie.GrilleJeu.Colonne));
        for (int k = 0; k < partie.levels[partie.Joueur.level - 1][0]; k++){
            for (int i = 0; i < partie.levels[partie.Joueur.level - 1][1]; i ++){
                
                CelluleGraphique cellulegraphique = new CelluleGraphique(partie.GrilleJeu.grille[k][i]);
                cellulegraphique.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule cellule = cellulegraphique.CelluleAssociee;
                        
                        for (Cellule c : liste_deplacements){       //on désactive les cases de déplacement possible
                           c.deplacementpossible = false;
                        }
                        
                        liste_deplacements = partie.GrilleJeu.deplacements_possibles(partie.Joueur.cavalier);   //on stocke les déplacements possibles (sans les afficher)
                        
                        for (Cellule c : liste_deplacements){
                            if (cellule.X == c.X && cellule.Y == c.Y && !partie.GrilleJeu.gagne()){      //si la cellule que l'on traite est dans la liste des déplacements possibles
                                partie.GrilleJeu.prend_nouvelle_cellule(partie.Joueur.cavalier, cellule.X, cellule.Y);
                                nbrcoup++;
                            }
                        }
                        
                        if (partie.GrilleJeu.gagne() && gagne == false){        //si le joueur gagne
                            gagne = true;
                            infos.setText(infos.getText() + "\nVous avez gagné !");
                            stats[partie.Joueur.level - 1] = nbrcoup;
                            score1.setText(""+stats[0]);
                            score2.setText(""+stats[1]);
                            score3.setText(""+stats[2]);
                            score4.setText(""+stats[3]);
                            score5.setText(""+stats[4]);
                            score6.setText(""+stats[5]);
                            score7.setText(""+stats[6]);
                            jouer.setEnabled(true);
                            if (partie.Joueur.level < partie.levels.length){
                                partie.Joueur.level ++;
                            }else{
                                infos.setText(infos.getText() + "\nFélicitation, vous avez fini le jeu !");
                            }
                        }
                        
                        liste_deplacements = partie.GrilleJeu.deplacements_possibles(partie.Joueur.cavalier);   //on refait la liste des déplacements après avoir joué et on regarde si on perd
                        if (partie.GrilleJeu.perd(liste_deplacements)){
                            infos.setText(infos.getText() + "\nVous avez perdu ...");
                            jouer.setEnabled(true);
                        }
                        
                        grille.repaint();
                        
                    }
                });
                
                grille.add(cellulegraphique);
            }
            grille.repaint();
        }
    }
    
    private void afficherdeplacementspossibles(){   //modifie les Cellules en fonction des déplacements possibles
        for (Cellule c : liste_deplacements){
            c.deplacementpossible = true;
        }
        grille.repaint();
    }
    
    private void jouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jouerActionPerformed
        // TODO add your handling code here:
        //lorsque on clique sur le bouton "jouer"
        if (partie == null){
            partie = new Partie(nom.getText(), couleur.getSelectedItem().toString());
        }
        if (partie.Joueur == null){
            partie.init_player();
        }else{
            partie.Joueur.cavalier.set_coords(partie.levels[partie.Joueur.level - 1][2], partie.levels[partie.Joueur.level - 1][3]);
        }
        
        partie.init_partie();
        niveau.setText("Niveau " + partie.Joueur.level);
        infos.setText(infos.getText() + "\nBonne Chance " + partie.Joueur.Nom + "!");
        grille.removeAll();
        nbrcoup = 0;
        gagne = false;
        liste_deplacements.clear();
        layout_grille();
        jouer.setEnabled(false);
        deplacementspossibles.setEnabled(true);
    }//GEN-LAST:event_jouerActionPerformed

    private void deplacementspossiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deplacementspossiblesActionPerformed
        // TODO add your handling code here:
        liste_deplacements = partie.GrilleJeu.deplacements_possibles(partie.Joueur.cavalier);
        afficherdeplacementspossibles();
    }//GEN-LAST:event_deplacementspossiblesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(La_chevauchee_fantastique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(La_chevauchee_fantastique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(La_chevauchee_fantastique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(La_chevauchee_fantastique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new La_chevauchee_fantastique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Titre;
    private javax.swing.JComboBox<String> couleur;
    private java.awt.Label demande_couleur;
    private java.awt.Label demande_pseudo1;
    private javax.swing.JButton deplacementspossibles;
    private javax.swing.JPanel grille;
    private java.awt.TextArea infos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jouer;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label12;
    private java.awt.Label label14;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Label niveau;
    private javax.swing.JTextField nom;
    private java.awt.Label score1;
    private java.awt.Label score2;
    private java.awt.Label score3;
    private java.awt.Label score4;
    private java.awt.Label score5;
    private java.awt.Label score6;
    private java.awt.Label score7;
    // End of variables declaration//GEN-END:variables
}
    }
    


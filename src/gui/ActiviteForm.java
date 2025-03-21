/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Activite;
import static gui.MDIApplication.instance;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;
import services.ActiviteService;

/**
 *
 * @author HP
 */
public class ActiviteForm extends javax.swing.JInternalFrame {

    private ActiviteService as;
    private DefaultTableModel model;
    private static ActiviteForm instance; // Variable statique pour stocker l'instance unique

    /**
     * Creates new form ActiviteForm
     */
    public ActiviteForm() {
        initComponents();
        as = new ActiviteService();
        model = new DefaultTableModel(new String[]{"ID", "Intitule", "Description", "Date"}, 0);
        lisetActivite.setModel(model); // Assurez-vous d'initialiser le modèle de la table
        load(); //
    }

    void load() {
        model.setRowCount(0); // Vider le modèle
        for (Activite a : as.findAll()) {
            model.addRow(new Object[]{a.getId(), a.getIntitule(), a.getDescription(), a.getDate()});
        }
    }
// Méthode statique pour obtenir l'instance unique

    public static ActiviteForm getInstance() {
        if (instance == null || instance.isClosed()) {
            instance = new ActiviteForm();
        }
        return instance;
    }
// Méthode pour vérifier si la fenêtre est fermée

    public boolean isClosed() {
        return this.isClosed(); // Utilise la méthode de JInternalFrame pour vérifier si la fenêtre est fermée
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser2 = new com.toedter.calendar.JDayChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIntitule = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        bnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lisetActivite = new javax.swing.JTable();
        bnmodifier = new javax.swing.JButton();
        bnSupprime = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion des Activites"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("intitule:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("description:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("date:");

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        bnAdd.setBackground(new java.awt.Color(51, 255, 0));
        bnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnAdd.setText("ajouter");
        bnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddActionPerformed(evt);
            }
        });

        lisetActivite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "intitule", "description", "date"
            }
        ));
        lisetActivite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lisetActiviteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lisetActivite);

        bnmodifier.setBackground(new java.awt.Color(255, 255, 0));
        bnmodifier.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnmodifier.setText("modifier");
        bnmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnmodifierActionPerformed(evt);
            }
        });

        bnSupprime.setBackground(new java.awt.Color(255, 0, 0));
        bnSupprime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnSupprime.setText("supprime");
        bnSupprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSupprimeActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/icons8-gestion-des-événements-24.png"))); // NOI18N
        jLabel7.setText(" la gestion des données des activités");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(txtIntitule, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(bnSupprime)
                        .addGap(69, 69, 69)
                        .addComponent(bnmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIntitule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnAdd)
                    .addComponent(bnSupprime)
                    .addComponent(bnmodifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void bnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddActionPerformed
        // TODO add your handling code here:
        String intitule = txtIntitule.getText();
        String description = txtDescription.getText();
        Date date = txtDate.getDate();

        // Utilisez le constructeur adéquat
        if (as.create(new Activite(intitule, date, description))) {
            JOptionPane.showMessageDialog(this, "Bien enregistré");
            load();
        } else {
            JOptionPane.showMessageDialog(this, "Problème");
        }
    }//GEN-LAST:event_bnAddActionPerformed

    private void bnmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnmodifierActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment modifier cette activité?");
        if (response == JOptionPane.YES_OPTION) {
            // Récupérer les données de l'interface utilisateur
            int id = Integer.parseInt(model.getValueAt(lisetActivite.getSelectedRow(), 0).toString());
            String intitule = txtIntitule.getText();
            String description = txtDescription.getText();
            Date date = txtDate.getDate();

            // Mettre à jour l'activité
            if (as.update(new Activite(id, intitule, date, description))) {
                JOptionPane.showMessageDialog(this, "Bien enregistrée");
                load(); // Actualiser le tableau
            } else {
                JOptionPane.showMessageDialog(this, "Problème lors de la mise à jour");
            }
        }
    }//GEN-LAST:event_bnmodifierActionPerformed

    private void lisetActiviteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lisetActiviteMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(model.getValueAt(lisetActivite.getSelectedRow(), 0).toString());

        txtIntitule.setText(model.getValueAt(lisetActivite.getSelectedRow(), 1).toString());
        txtDescription.setText(model.getValueAt(lisetActivite.getSelectedRow(), 2).toString());

        Date date = (Date) model.getValueAt(lisetActivite.getSelectedRow(), 3);
        txtDate.setDate(date);

    }//GEN-LAST:event_lisetActiviteMouseClicked

    private void bnSupprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSupprimeActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer cette activité ?");
        if (response == JOptionPane.YES_OPTION) {
            // Récupérer l'ID de l'activité sélectionnée
            int selectedRow = lisetActivite.getSelectedRow();
            if (selectedRow != -1) { // Vérifier si une ligne est sélectionnée
                int id = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

                // Supprimer l'activité
                if (as.delete(as.findById(id))) {
                    JOptionPane.showMessageDialog(this, "Activité supprimée avec succès");
                    load(); // Actualiser le tableau
                } else {
                    JOptionPane.showMessageDialog(this, "Problème lors de la suppression");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Veuillez sélectionner une activité à supprimer");
            }
        }
    }//GEN-LAST:event_bnSupprimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAdd;
    private javax.swing.JButton bnSupprime;
    private javax.swing.JButton bnmodifier;
    private com.toedter.calendar.JDayChooser jDayChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable lisetActivite;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtIntitule;
    // End of variables declaration//GEN-END:variables
}

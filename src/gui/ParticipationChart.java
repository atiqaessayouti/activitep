/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author HP
 */
public class ParticipationChart extends javax.swing.JFrame {

    /**
     * Creates new form ParticipationChart
     */
    public ParticipationChart() {
        initComponents();
        
        DefaultCategoryDataset dataset = createDataset();

        // Créer le graphique
        JFreeChart chart = ChartFactory.createBarChart(
                "Taux de Participation par Activité",
                "Activités",          // Label de l'axe X
                "Taux de Participation (%)", // Label de l'axe Y
                dataset // Ajout du dataset ici
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);

    }
  private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Connexion à la base de données
        String url = "jdbc:mysql://localhost:3306/pédagogiques"; // Remplacez par votre URL
        String user = "root"; // Remplacez par votre utilisateur
        String password = ""; // Remplacez par votre mot de passe (laissez vide s'il n'y en a pas)

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            // Requête SQL pour récupérer les données
            String sql = "SELECT a.intitule AS Activite, " +
                    "COUNT(pa.etudiant_id) AS NombreParticipants, " +
                    "(COUNT(pa.etudiant_id) * 100.0 / (SELECT COUNT(*) FROM Participationactivite)) AS TauxParticipation " +
                    "FROM activité a " +
                    "LEFT JOIN Participationactivite pa ON a.id = pa.activite_id " +
                    "GROUP BY a.id, a.intitule;";

            ResultSet rs = statement.executeQuery(sql);

            // Remplir le dataset avec les résultats
            while (rs.next()) {
                String activite = rs.getString("Activite");
                double tauxParticipation = rs.getDouble("TauxParticipation");
                dataset.addValue(tauxParticipation, "Taux de participation", activite);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataset;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            ParticipationChart example = new ParticipationChart();
            example.setSize(800, 600);
            example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            example.setLocationRelativeTo(null);
            example.setVisible(true);
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

   
}

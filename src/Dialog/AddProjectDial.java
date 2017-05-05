/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialog;

import Calcul.calcul;
import java.util.Hashtable;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import projet.projet;
import projet_testing.MainFrame;

/**
 *
 * @author vincent
 */
public class AddProjectDial extends javax.swing.JDialog {

    DefaultListModel listModel ;
    //projet project;
    /**
     * Creates new form AddProject
     */
    public AddProjectDial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listModel = new DefaultListModel<Double>();
        CashflowList.setModel(listModel);
        
    }
    
    public AddProjectDial(java.awt.Frame parent, boolean modal, projet project)
    {
        super(parent, modal);
        initComponents();
        listModel = new DefaultListModel<Double>();
        CashflowList.setModel(listModel);
        NameTF.setText(project.getName());
        PeriodTF.setText(Integer.toString(project.getPeriode()));
        InvestTF.setText(Double.toString(project.getCashflow(0)));
        ActualisationTF.setText(Double.toString(project.getTauxActualisation()));
        Hashtable<Integer,Double> hash = project.getCashflow();
        
        
        for(int i=1;i<hash.size();i++)
        {
            listModel.addElement(hash.get(i));
        }
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        NameLabel = new javax.swing.JLabel();
        PeriodLabel = new javax.swing.JLabel();
        InvestLabel = new javax.swing.JLabel();
        NameTF = new javax.swing.JTextField();
        PeriodTF = new javax.swing.JTextField();
        InvestTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CashflowList = new javax.swing.JList<>();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        CashflowLabel = new javax.swing.JLabel();
        OkButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        ActualisationLabel = new javax.swing.JLabel();
        ActualisationTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nouveau Projet");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        NameLabel.setText("Nom du projet : ");
        getContentPane().add(NameLabel, new java.awt.GridBagConstraints());

        PeriodLabel.setText("Période du projet : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(PeriodLabel, gridBagConstraints);

        InvestLabel.setText("Investissement : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(InvestLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(NameTF, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(PeriodTF, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(InvestTF, gridBagConstraints);

        jScrollPane1.setViewportView(CashflowList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 5;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        deleteButton.setText("Supprimer");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        getContentPane().add(deleteButton, gridBagConstraints);

        addButton.setText("Ajouter");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        getContentPane().add(addButton, gridBagConstraints);

        CashflowLabel.setText("CashFlows : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        getContentPane().add(CashflowLabel, gridBagConstraints);

        OkButton.setText("Ok");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        getContentPane().add(OkButton, gridBagConstraints);

        CloseButton.setText("Fermer");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        getContentPane().add(CloseButton, gridBagConstraints);

        ActualisationLabel.setText("Taux d'actualisation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        getContentPane().add(ActualisationLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(ActualisationTF, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        double cashflow = Double.parseDouble(JOptionPane.showInputDialog(this, "entrer le cashflow", (double)0));
        listModel.addElement(cashflow);
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int index=CashflowList.getSelectedIndex();
        if(index != -1)
        {
            listModel.remove(index);
        }
        else
            JOptionPane.showMessageDialog(this, "vous devez d'abord sélectionner un cashflow", "erreur de suppression de cashflow", JOptionPane.ERROR_MESSAGE, null);
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        projet project = new projet(NameTF.getText(),Double.parseDouble(InvestTF.getText()),Integer.parseInt(PeriodTF.getText()),Double.parseDouble(ActualisationTF.getText()));
        for(int i=0;i<listModel.size();i++)
        {
            project.addCashflow((double)listModel.get(i));
        }
        project.CalculateNPV();
        project.CalculateIRR(0.1);
        ((MainFrame)this.getParent()).addProject(project);
        this.setVisible(false);
    }//GEN-LAST:event_OkButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddProjectDial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProjectDial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProjectDial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProjectDial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProjectDial dialog = new AddProjectDial(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualisationLabel;
    private javax.swing.JTextField ActualisationTF;
    private javax.swing.JLabel CashflowLabel;
    private javax.swing.JList<String> CashflowList;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel InvestLabel;
    private javax.swing.JTextField InvestTF;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTF;
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel PeriodLabel;
    private javax.swing.JTextField PeriodTF;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

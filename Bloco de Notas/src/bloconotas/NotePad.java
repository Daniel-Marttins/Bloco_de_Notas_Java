/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloconotas;

import java.awt.Color;
import java.awt.TextArea;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Takashi
 */
public class NotePad extends javax.swing.JFrame {

    /**
     * Creates new form NotePad
     */
    public NotePad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rolar = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        opMenu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        salvar = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        newFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        dark = new javax.swing.JMenuItem();
        white = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textArea.setRows(5);
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaKeyPressed(evt);
            }
        });
        rolar.setViewportView(textArea);

        file.setText("Arquivo");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        file.add(salvar);

        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        file.add(abrir);

        newFile.setText("Novo Arquivo");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        file.add(newFile);

        opMenu.add(file);

        jMenu2.setText("Editar");

        jMenu1.setText("Tema");

        dark.setText("Escuro");
        dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkActionPerformed(evt);
            }
        });
        jMenu1.add(dark);

        white.setText("Claro");
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });
        jMenu1.add(white);

        jMenu2.add(jMenu1);

        opMenu.add(jMenu2);

        setJMenuBar(opMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rolar, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rolar, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        BufferedWriter bw = null;
        String nome;
        String juntar;
        try {
            String getText = textArea.getText();
            nome = JOptionPane.showInputDialog("Nome do Arquivo: ");
            juntar = nome + ".txt";
            bw = new BufferedWriter(new FileWriter(juntar));
            bw.write(getText);
        } catch (IOException ex) {
            Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Arquivo Salvo!");
    }//GEN-LAST:event_salvarActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        NotePad newFile = new NotePad();
        newFile.setVisible(true);
        NotePad.this.dispose();
    }//GEN-LAST:event_newFileActionPerformed

    private void darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkActionPerformed
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setForeground(Color.WHITE);
    }//GEN-LAST:event_darkActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.BLACK);
    }//GEN-LAST:event_whiteActionPerformed

    private void textAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyPressed
        
    }//GEN-LAST:event_textAreaKeyPressed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        new Arquivos(textArea).setVisible(true);
    }//GEN-LAST:event_abrirActionPerformed

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
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenuItem dark;
    private javax.swing.JMenu file;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuBar opMenu;
    private javax.swing.JScrollPane rolar;
    private javax.swing.JMenuItem salvar;
    private javax.swing.JTextArea textArea;
    private javax.swing.JMenuItem white;
    // End of variables declaration//GEN-END:variables

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(String text) {
        System.out.println(text);
        this.textArea.append(text);
    }

}

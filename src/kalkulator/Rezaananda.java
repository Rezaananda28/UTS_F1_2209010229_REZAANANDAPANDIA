/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author REZA ANANDA PANDIA
 */
public class Rezaananda extends javax.swing.JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilih;

    /**
     * Creates new form Tampilan
     */
    public Rezaananda() {
        initComponents();
        angka = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        btnAngka7 = new javax.swing.JButton();
        btnAngka4 = new javax.swing.JButton();
        btnAngka1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAngka8 = new javax.swing.JButton();
        btnAngka5 = new javax.swing.JButton();
        btnAngka2 = new javax.swing.JButton();
        btnAngka0 = new javax.swing.JButton();
        btnAngka6 = new javax.swing.JButton();
        btnAngka9 = new javax.swing.JButton();
        btnAngka3 = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnPembagian = new javax.swing.JButton();
        btnPerkalian = new javax.swing.JButton();
        btnPengurangan = new javax.swing.JButton();
        btnPertambahan = new javax.swing.JButton();
        btnHasil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton8.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("kalkulator sederhana");

        display.setEditable(false);
        display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        btnAngka7.setText("7");
        btnAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka7ActionPerformed(evt);
            }
        });

        btnAngka4.setText("4");
        btnAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka4ActionPerformed(evt);
            }
        });

        btnAngka1.setText("1");
        btnAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka1ActionPerformed(evt);
            }
        });

        btnClear.setLabel("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAngka8.setText("8");
        btnAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka8ActionPerformed(evt);
            }
        });

        btnAngka5.setText("5");
        btnAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka5ActionPerformed(evt);
            }
        });

        btnAngka2.setText("2");
        btnAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka2ActionPerformed(evt);
            }
        });

        btnAngka0.setText("0");
        btnAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka0ActionPerformed(evt);
            }
        });

        btnAngka6.setText("6");
        btnAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka6ActionPerformed(evt);
            }
        });

        btnAngka9.setText("9");
        btnAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka9ActionPerformed(evt);
            }
        });

        btnAngka3.setText("3");
        btnAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka3ActionPerformed(evt);
            }
        });

        btnKoma.setText(".");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });

        btnPembagian.setText("/");
        btnPembagian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembagianActionPerformed(evt);
            }
        });

        btnPerkalian.setText("X");
        btnPerkalian.setToolTipText("");
        btnPerkalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerkalianActionPerformed(evt);
            }
        });

        btnPengurangan.setText("-");
        btnPengurangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenguranganActionPerformed(evt);
            }
        });

        btnPertambahan.setText("+");
        btnPertambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPertambahanActionPerformed(evt);
            }
        });

        btnHasil.setText("=");
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });

        jLabel1.setText("KALKULAOTR SEDERHANA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAngka7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAngka4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPembagian, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAngka5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAngka8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAngka0, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAngka3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPertambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAngka9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPerkalian, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAngka6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPengurangan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPembagian, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerkalian, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPengurangan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAngka3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPertambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAngka0, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPembagianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembagianActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("/");
        angka="";
        pilih=4;

    }//GEN-LAST:event_btnPembagianActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        angka += ".";
        display.setText(angka);

    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka1ActionPerformed
        angka += "1";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka1ActionPerformed

    private void btnAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka3ActionPerformed
        angka += "3";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka3ActionPerformed

    private void btnAngka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka0ActionPerformed
        angka += "0";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka0ActionPerformed

    private void btnAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka2ActionPerformed
        angka += "2";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka2ActionPerformed

    private void btnAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka4ActionPerformed
        angka += "4";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka4ActionPerformed

    private void btnAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka5ActionPerformed
        angka += "5";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka5ActionPerformed

    private void btnAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka6ActionPerformed
        angka += "6";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka6ActionPerformed

    private void btnAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka7ActionPerformed
        angka += "7";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka7ActionPerformed

    private void btnAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka8ActionPerformed
        angka += "8";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka8ActionPerformed

    private void btnAngka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka9ActionPerformed
        angka += "9";
        display.setText(angka);

    }//GEN-LAST:event_btnAngka9ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        display.setText("");
        angka1=0.0;
        angka2=0.0;
        jumlah=0.0;
        angka="";

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPertambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPertambahanActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("+");
        angka="";
        pilih=1;

    }//GEN-LAST:event_btnPertambahanActionPerformed

    private void btnPenguranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenguranganActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("-");
        angka="";
        pilih=2;

    }//GEN-LAST:event_btnPenguranganActionPerformed

    private void btnPerkalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerkalianActionPerformed
        angka1=Double.parseDouble(angka);
        display.setText("*");
        angka="";
        pilih=3;

    }//GEN-LAST:event_btnPerkalianActionPerformed

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHasilActionPerformed
        switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            display.setText(angka);
            break;
            default:
            break;
} 

    }//GEN-LAST:event_btnHasilActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Rezaananda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAngka0;
    private javax.swing.JButton btnAngka1;
    private javax.swing.JButton btnAngka2;
    private javax.swing.JButton btnAngka3;
    private javax.swing.JButton btnAngka4;
    private javax.swing.JButton btnAngka5;
    private javax.swing.JButton btnAngka6;
    private javax.swing.JButton btnAngka7;
    private javax.swing.JButton btnAngka8;
    private javax.swing.JButton btnAngka9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnPembagian;
    private javax.swing.JButton btnPengurangan;
    private javax.swing.JButton btnPerkalian;
    private javax.swing.JButton btnPertambahan;
    private javax.swing.JTextField display;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

package tubes2048;
//

public class History extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(History.class.getName());

    public History() {
        initComponents(); // Ini biarin aja
        setLocationRelativeTo(null); // Biar di tengah
        
        // 1. PANGGIL FUNGSI BACA JSON DI SINI!
        tampilkanDataHistory(); 
    }

    // 2. BIKIN FUNGSI BARU DI BAWAH CONSTRUCTOR (Tulis manual)
    private void tampilkanDataHistory() {
        // Panggil mesin JSON kita
        GameData data = DataManager.loadData();
        
        // Pakai tag HTML biar text JLabel bisa di-enter (ke bawah)
        StringBuilder teksNama = new StringBuilder("<html>");
        StringBuilder teksSkor = new StringBuilder("<html>");

        // Loop isi history dari JSON
        for (ScoreEntry entry : data.getHistory()) {
            teksNama.append(entry.getName()).append("<br><br>");
            teksSkor.append(entry.getScore()).append("<br><br>");
        }

        teksNama.append("</html>");
        teksSkor.append("</html>");

        // Masukkan ke komponen UI-mu (pastikan nama variabelnya cocok)
        lblNames.setText(teksNama.toString());
        lblScores.setText(teksSkor.toString());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblScores = new javax.swing.JLabel();
        lblNames = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblScores.setText("SKOR");
        lblScores.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblScores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 220, -1));

        lblNames.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNames.setText("NAMA");
        lblNames.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 72, 560, 520));

        jPanel2.setBackground(new java.awt.Color(255, 194, 143));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("History");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mainmenu mainmenu = new Mainmenu();
        this.dispose();
        mainmenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new History().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNames;
    private javax.swing.JLabel lblScores;
    // End of variables declaration//GEN-END:variables
}

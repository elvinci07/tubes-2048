package tubes2048;


public class Mainmenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Mainmenu.class.getName());

    public Mainmenu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPlay = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        subTitle = new javax.swing.JLabel();
        subsubTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlay.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnPlay.setText("Play");
        btnPlay.addActionListener(this::btnPlayActionPerformed);
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 110, 40));

        btnHistory.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnHistory.setText("History");
        jPanel1.add(btnHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 110, 40));

        btnExit.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        btnExit.setText("Exit Game");
        btnExit.addActionListener(this::btnExitActionPerformed);
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 170, 40));

        subTitle.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        subTitle.setText("Slide, Merge, and Win!");
        jPanel1.add(subTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        subsubTitle.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        subsubTitle.setText("Keep Going, You Can Reach 2048!");
        jPanel1.add(subsubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("2048");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 260, 110));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 220, 30));

        lblName.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        lblName.setText("Nama Pemain");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        String usn = txtNama.getText();
        
        setName(usn);
        inGame ingame = new inGame();
        this.dispose();
        ingame.show();
    }//GEN-LAST:event_btnPlayActionPerformed

    public String getName(String usn) {
        return usn;
    }
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Mainmenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel subsubTitle;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}

package tubes2048;

public class Mainmenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Mainmenu.class.getName());
    private GameData dataTersimpan = new GameData();

    // 1. Constructor untuk menerima operan balik dari History (hanya bawa data)
    public Mainmenu(GameData data) {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        this.dataTersimpan = data; // Tangkap datanya kembali!
    }

    // 2. Constructor untuk menerima operan balik dari inGame (bawa nama & data)
    public Mainmenu(String namaSebelumnya, GameData data) {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        txtNama.setText(namaSebelumnya); // Isi ulang kolom nama
        this.dataTersimpan = data; // Tangkap datanya kembali!
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
        lblTitle = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048 - Slide, Merge, and Win!");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/2048_logo.svg.png")).getImage());
        setMaximumSize(new java.awt.Dimension(1000, 732));
        setMinimumSize(new java.awt.Dimension(1000, 732));
        setPreferredSize(new java.awt.Dimension(1000, 732));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 248, 239));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 732));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 732));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlay.setBackground(new java.awt.Color(249, 246, 242));
        btnPlay.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(143, 122, 102));
        btnPlay.setText("Play");
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlayMouseExited(evt);
            }
        });
        btnPlay.addActionListener(this::btnPlayActionPerformed);
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 180, 60));

        btnHistory.setBackground(new java.awt.Color(249, 246, 242));
        btnHistory.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnHistory.setForeground(new java.awt.Color(143, 122, 102));
        btnHistory.setText("History");
        btnHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistoryMouseExited(evt);
            }
        });
        btnHistory.addActionListener(this::btnHistoryActionPerformed);
        jPanel1.add(btnHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 180, 60));

        btnExit.setBackground(new java.awt.Color(249, 246, 242));
        btnExit.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(143, 122, 102));
        btnExit.setText("Exit Game");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(this::btnExitActionPerformed);
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 180, 60));

        subTitle.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        subTitle.setForeground(new java.awt.Color(143, 122, 102));
        subTitle.setText("Slide, Merge, and Win!");
        jPanel1.add(subTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        lblTitle.setFont(new java.awt.Font("Stencil", 1, 148)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(75, 53, 31));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("2048");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 370, 120));

        txtNama.setBackground(new java.awt.Color(249, 246, 242));
        txtNama.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        txtNama.setForeground(new java.awt.Color(92, 65, 40));
        txtNama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 360, 60));

        lblName.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(118, 95, 75));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Nama Pemain");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        String usn = txtNama.getText().trim();

        if (usn.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nama pemain tidak boleh kosong!");
            return; 
        }

        if (this.dataTersimpan == null) {
            this.dataTersimpan = new GameData();
        }
        Player pemainAktif = new Player(usn);

        inGame ingame = new inGame(pemainAktif, dataTersimpan); 
        this.dispose();
        ingame.setVisible(true);
    }//GEN-LAST:event_btnPlayActionPerformed

    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        if (this.dataTersimpan == null) {
            this.dataTersimpan = new GameData();
        }
        History menuHistory = new History(dataTersimpan);
        this.dispose();
        menuHistory.setVisible(true);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseEntered
        btnPlay.setBackground(new java.awt.Color(232,221,205));
    }//GEN-LAST:event_btnPlayMouseEntered

    private void btnPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseExited
        btnPlay.setBackground(new java.awt.Color(249,246,242));
    }//GEN-LAST:event_btnPlayMouseExited

    private void btnHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryMouseEntered
        btnHistory.setBackground(new java.awt.Color(232,221,205));
    }//GEN-LAST:event_btnHistoryMouseEntered

    private void btnHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryMouseExited
        btnHistory.setBackground(new java.awt.Color(249,246,242));
    }//GEN-LAST:event_btnHistoryMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new java.awt.Color(232,221,205));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new java.awt.Color(249,246,242));
    }//GEN-LAST:event_btnExitMouseExited

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
        java.awt.EventQueue.invokeLater(() -> {
            // 1. Load data dari JSON sekali saja saat game pertama kali dibuka
            GameData dataAwal = DataManager.loadData(); 

            if (dataAwal == null) {
                dataAwal = new GameData();
            }

            new Mainmenu(dataAwal).setVisible(true);
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel subTitle;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}

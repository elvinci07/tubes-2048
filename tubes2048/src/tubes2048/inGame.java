package tubes2048;

import javax.swing.JOptionPane;


public class inGame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(inGame.class.getName());

    private GameBoard gameBoard;
    private javax.swing.JLabel[][] guiBoard;
    private String playerName = getName();

    /**
     * Creates new form inGame
     */
    public inGame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        gameBoard = new GameBoard();
        guiBoard = new javax.swing.JLabel[][] {
            {kotak00, kotak01, kotak02, kotak03},
            {kotak10, kotak11, kotak12, kotak13},
            {kotak20, kotak21, kotak22, kotak23},
            {kotak30, kotak31, kotak32, kotak33}
        };
        
        updateGUI();
    }
    
    private void updateGUI() {
        Tile[][] backendBoard = gameBoard.getBoard(); 

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int nilai = backendBoard[i][j].getValue();

                // Setel JLabel menjadi transparan agar background board terlihat
                guiBoard[i][j].setOpaque(false);
                guiBoard[i][j].setText(""); // Hapus teks lama

                // Muat gambar yang sesuai (misalnya: tubes2048/2.png)
                try {
                    // Tentukan path gambar yang benar
                    java.net.URL imgURL = getClass().getResource("/tubes2048/resources/" + nilai + ".png");

                    if (imgURL != null) {
                        // Buat ImageIcon dan setel ke JLabel
                        guiBoard[i][j].setIcon(new javax.swing.ImageIcon(imgURL));
                    } else {
                        // Jika gambar tidak ditemukan (misalnya kotak kosong 0)
                        guiBoard[i][j].setIcon(null);
                        // Opsi: kamu bisa memuat gambar kotak kosong default di sini jika punya
                    }
                } catch (Exception e) {
                    System.err.println("Gagal memuat gambar untuk nilai: " + nilai);
                    guiBoard[i][j].setIcon(null);
                }
            }
        }

        // Perbarui Skor
        lblScore.setText(String.valueOf(gameBoard.getScore()));
    }

    // Method penentu warna
    private java.awt.Color getWarnaKotak(int value) {
        return switch (value) {
            case 2 -> new java.awt.Color(238, 228, 218);
            case 4 -> new java.awt.Color(237, 224, 200);
            case 8 -> new java.awt.Color(242, 177, 121);
            case 16 -> new java.awt.Color(245, 149, 99);
            case 32 -> new java.awt.Color(246, 124, 95);
            case 64 -> new java.awt.Color(246, 94, 59);
            case 128 -> new java.awt.Color(237, 207, 114);
            default -> new java.awt.Color(237, 194, 46);
        };
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblBestScore = new javax.swing.JLabel();
        gameTitle = new javax.swing.JLabel();
        gridContainer = new javax.swing.JPanel();
        kotak00 = new javax.swing.JLabel();
        kotak01 = new javax.swing.JLabel();
        kotak02 = new javax.swing.JLabel();
        kotak03 = new javax.swing.JLabel();
        kotak10 = new javax.swing.JLabel();
        kotak11 = new javax.swing.JLabel();
        kotak12 = new javax.swing.JLabel();
        kotak13 = new javax.swing.JLabel();
        kotak20 = new javax.swing.JLabel();
        kotak21 = new javax.swing.JLabel();
        kotak22 = new javax.swing.JLabel();
        kotak23 = new javax.swing.JLabel();
        kotak30 = new javax.swing.JLabel();
        kotak31 = new javax.swing.JLabel();
        kotak32 = new javax.swing.JLabel();
        kotak33 = new javax.swing.JLabel();
        bgBoard = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnNewGame1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 233, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jLabel2.setText("SCORE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblScore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblScore.setText("0");
        jPanel2.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 90, 70));

        jPanel3.setBackground(new java.awt.Color(249, 233, 233));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        jLabel4.setText("BEST");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 21));

        lblBestScore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBestScore.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBestScore.setText("0");
        jPanel3.add(lblBestScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 90, 70));

        gameTitle.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        gameTitle.setForeground(new java.awt.Color(61, 30, 0));
        gameTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gameTitle.setText("2048");
        jPanel1.add(gameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 640, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 720, 130));

        gridContainer.setOpaque(false);
        gridContainer.setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        kotak00.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak00.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak00);

        kotak01.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak01);

        kotak02.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak02);

        kotak03.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak03);

        kotak10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak10);

        kotak11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak11);

        kotak12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak12);

        kotak13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak13);

        kotak20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak20);

        kotak21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak21);

        kotak22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak22);

        kotak23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak23);

        kotak30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak30);

        kotak31.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak31);

        kotak32.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak32);

        kotak33.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kotak33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridContainer.add(kotak33);

        getContentPane().add(gridContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 430, 430));

        bgBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes2048/resources/board.png"))); // NOI18N
        getContentPane().add(bgBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 450, 450));

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("<html>Back</html>");
        btnBack.setActionCommand("<html> New<br>\nGame</html>");
        btnBack.setFocusable(false);
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 130));

        btnNewGame1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNewGame1.setText("<html>New<br>\nGame</html>");
        btnNewGame1.setActionCommand("<html> New<br>\nGame</html>");
        btnNewGame1.setFocusable(false);
        btnNewGame1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGame1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewGame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:                           
        if (gameBoard.isGameOver()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Game Over! Skor: " + gameBoard.getScore());
            return;
        }

        int key = evt.getKeyCode();
        switch (key) {
            case java.awt.event.KeyEvent.VK_UP -> gameBoard.moveUp();
            case java.awt.event.KeyEvent.VK_DOWN -> gameBoard.moveDown();
            case java.awt.event.KeyEvent.VK_LEFT -> gameBoard.moveLeft();
            case java.awt.event.KeyEvent.VK_RIGHT -> gameBoard.moveRight();
            default -> {
            }
        }

        updateGUI(); // Panggil ini biar layarnya ke-update setiap kamu pencet arah

        if (gameBoard.isWin()) {
            javax.swing.JOptionPane.showMessageDialog(this, "You Win!");
            gameTitle.setText("4096");
        }
        
        if (gameBoard.isWinWin()) {
            javax.swing.JOptionPane.showMessageDialog(this, "You win again!");
            gameTitle.setText("8192");
        }
        
        if (gameBoard.isWinWin()) {
            javax.swing.JOptionPane.showMessageDialog(this, "At this rate just play alone bro");
            gameTitle.setText("XÆA-12#!@$%^&*()_+{}|:<>?=-[]\\\\;',./0123456789");
        }
    }//GEN-LAST:event_formKeyPressed

    private void btnNewGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGame1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, 
            "Do you want to proceed? Your last score will be stored in History.", 
            "Confirmation", 
            JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            int lastScore = gameBoard.getScore();
            String lastName = playerName;
//            Mainmenu mainmenu = new Mainmenu();
//            this.dispose();
//            mainmenu.show();
        this.requestFocusInWindow(); // Kembalikan fokus ke keyboard
        }
    }//GEN-LAST:event_btnNewGame1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int result = JOptionPane.showConfirmDialog(null, 
            "Do you want to proceed? Your last score will be stored in History.", 
            "Confirmation", 
            JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            int lastScore = gameBoard.getScore();
            Mainmenu mainmenu = new Mainmenu();
            this.dispose();
            mainmenu.show();
        this.requestFocusInWindow(); // Kembalikan fokus ke keyboard
        }
    }//GEN-LAST:event_btnBackActionPerformed

    
    

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> new inGame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgBoard;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNewGame1;
    private javax.swing.JLabel gameTitle;
    private javax.swing.JPanel gridContainer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kotak00;
    private javax.swing.JLabel kotak01;
    private javax.swing.JLabel kotak02;
    private javax.swing.JLabel kotak03;
    private javax.swing.JLabel kotak10;
    private javax.swing.JLabel kotak11;
    private javax.swing.JLabel kotak12;
    private javax.swing.JLabel kotak13;
    private javax.swing.JLabel kotak20;
    private javax.swing.JLabel kotak21;
    private javax.swing.JLabel kotak22;
    private javax.swing.JLabel kotak23;
    private javax.swing.JLabel kotak30;
    private javax.swing.JLabel kotak31;
    private javax.swing.JLabel kotak32;
    private javax.swing.JLabel kotak33;
    private javax.swing.JLabel lblBestScore;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}

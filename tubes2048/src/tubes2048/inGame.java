package tubes2048;

import javax.swing.JOptionPane;


public class inGame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(inGame.class.getName());

    private GameBoard gameBoard;
    private javax.swing.JLabel[][] guiBoard;
    private Player pemainAktif;
    private GameData dataTersimpan;
    private boolean win2048Triggered = false;
    private boolean win4096Triggered = false;
    private boolean win8192Triggered = false;


    public inGame(Player pemain, GameData data) { 
        initComponents();
        this.pemainAktif = pemain;
        this.dataTersimpan = data;
        setLocationRelativeTo(null);
        setResizable(false);
        
        gameBoard = new GameBoard();
        guiBoard = new javax.swing.JLabel[][] {
            {kotak00, kotak01, kotak02, kotak03},
            {kotak10, kotak11, kotak12, kotak13},
            {kotak20, kotak21, kotak22, kotak23},
            {kotak30, kotak31, kotak32, kotak33}
        };
        
        lblBestScore.setText(String.valueOf(this.dataTersimpan.getBestScore()));        
        System.out.println("Game dimulai! Player: " + pemainAktif.getName());
        updateGUI();
        this.requestFocusInWindow();
    }
    
    private void updateGUI() {
        Tile[][] backendBoard = gameBoard.getBoard(); 

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int nilai = backendBoard[i][j].getValue();

                guiBoard[i][j].setOpaque(false);
                guiBoard[i][j].setText(""); // Hapus teks lama

                try {
                    java.net.URL imgURL = getClass().getResource("/resources/" + nilai + ".png");

                    if (imgURL != null) {
                        guiBoard[i][j].setIcon(new javax.swing.ImageIcon(imgURL));
                    } else {
                        guiBoard[i][j].setIcon(null);
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



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnNewGame1 = new javax.swing.JButton();
        gameTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblBestScore = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048 - Slide, Merge, and Win!");
        setBackground(new java.awt.Color(255, 204, 204));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/2048_logo.svg.png")).getImage());
        setMaximumSize(new java.awt.Dimension(800, 640));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setPreferredSize(new java.awt.Dimension(800, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 640));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 239, 220));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(249, 246, 242));
        btnBack.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(143, 122, 102));
        btnBack.setText("<html>Back</html>");
        btnBack.setActionCommand("<html> New<br>\nGame</html>");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.setFocusable(false);
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 50));

        btnNewGame1.setBackground(new java.awt.Color(249, 246, 242));
        btnNewGame1.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        btnNewGame1.setForeground(new java.awt.Color(143, 122, 102));
        btnNewGame1.setText("<html>New Game</html>");
        btnNewGame1.setActionCommand("<html> New<br>\nGame</html>");
        btnNewGame1.setBorder(new javax.swing.border.MatteBorder(null));
        btnNewGame1.setFocusable(false);
        btnNewGame1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewGame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewGame1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewGame1MouseExited(evt);
            }
        });
        btnNewGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGame1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewGame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 140, 50));

        gameTitle.setFont(new java.awt.Font("Stencil", 1, 90)); // NOI18N
        gameTitle.setForeground(new java.awt.Color(75, 53, 31));
        gameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameTitle.setText("2048");
        gameTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(gameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 370, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        jPanel4.setBackground(new java.awt.Color(250, 248, 239));
        jPanel4.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel4.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(143, 122, 102));
        jPanel3.setForeground(new java.awt.Color(249, 246, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 239, 227));
        jLabel4.setText("BEST");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblBestScore.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblBestScore.setForeground(new java.awt.Color(253, 252, 251));
        lblBestScore.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBestScore.setText("0");
        jPanel3.add(lblBestScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 45, 130, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 150, 85));

        jPanel2.setBackground(new java.awt.Color(143, 122, 102));
        jPanel2.setForeground(new java.awt.Color(249, 246, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 239, 227));
        jLabel2.setText("SCORE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblScore.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblScore.setForeground(new java.awt.Color(253, 252, 251));
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblScore.setText("0");
        jPanel2.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 45, 130, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 150, 85));

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

        jPanel4.add(gridContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 430, 430));

        bgBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/board.png"))); // NOI18N
        jPanel4.add(bgBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 450, 450));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (gameBoard.isGameOver()) {
            int result = JOptionPane.showConfirmDialog(this, 
                "Game Over! Score: " + gameBoard.getScore() + ". Start a new Game?", 
                "Confirmation", 
                JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                int skorAkhir = gameBoard.getScore();

                // Simpan ke JSON!
                DataManager.saveScore(this.dataTersimpan, pemainAktif.getName(), skorAkhir);
                inGame sesiBaru = new inGame(this.pemainAktif, this.dataTersimpan);
                
                this.dispose(); 
                sesiBaru.setVisible(true); 
            }
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

        // Kunci 1: Tembus 2048
        if (gameBoard.isWin() && !win2048Triggered) {
            javax.swing.JOptionPane.showMessageDialog(this, "You Win!");
            gameTitle.setText("4096");
            win2048Triggered = true; // Gembok ditutup biar ga spam
        }
        
        // Kunci 2: Tembus 4096
        if (gameBoard.isWin4096() && !win4096Triggered) {
            javax.swing.JOptionPane.showMessageDialog(this, "You win again!");
            gameTitle.setText("8192");
            win4096Triggered = true;
        }
        
        // Kunci 3: Tembus 8192
        if (gameBoard.isWin8192() && !win8192Triggered) {
            javax.swing.JOptionPane.showMessageDialog(this, "At this rate just play alone bro");
            gameTitle.setText("XÆA-12#!@$%^&*()_+{}|:<>?=-[]\\\\;',./0123456789");
            gameTitle.setFont(new java.awt.Font("Stencil", 1, 25));
            win8192Triggered = true;
        }
    }//GEN-LAST:event_formKeyPressed

    private void btnNewGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGame1ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, 
            "Do you want to proceed? Your last score will be stored in History.", 
            "Confirmation", 
            JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            int skorAkhir = gameBoard.getScore();
            
            // Simpan ke JSON!
            DataManager.saveScore(this.dataTersimpan, pemainAktif.getName(), skorAkhir);            
            inGame sesiBaru = new inGame(this.pemainAktif, this.dataTersimpan);
            
            this.dispose(); 
            sesiBaru.setVisible(true); 
        }
    }//GEN-LAST:event_btnNewGame1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int result = JOptionPane.showConfirmDialog(this, 
            "Do you want to proceed? Your last score will be stored in History.", 
            "Confirmation", 
            JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            int skorAkhir = gameBoard.getScore();
            
            // Simpan ke JSON!
            DataManager.saveScore(this.dataTersimpan, pemainAktif.getName(), skorAkhir);
            Mainmenu mainmenu = new Mainmenu(pemainAktif.getName(), this.dataTersimpan);
            this.dispose();
            mainmenu.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setBackground(new java.awt.Color(232,221,205)); 
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setBackground(new java.awt.Color(249,246,242));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnNewGame1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGame1MouseEntered
        btnNewGame1.setBackground(new java.awt.Color(232,221,205));
    }//GEN-LAST:event_btnNewGame1MouseEntered

    private void btnNewGame1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewGame1MouseExited
        btnNewGame1.setBackground(new java.awt.Color(249,246,242));
    }//GEN-LAST:event_btnNewGame1MouseExited

    
    

    public static void main(String args[]) {
        
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
    private javax.swing.JPanel jPanel4;
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

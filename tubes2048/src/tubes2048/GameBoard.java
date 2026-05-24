package tubes2048;

import java.util.ArrayList;

public class GameBoard {
    private Tile[][] board;
    private int score;

    // Constructor
    public GameBoard() {
        board = new Tile[4][4];
        initializeBoard();
    }

    // 1. Inisialisasi awal papan
    public void initializeBoard() {
        score = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = new Tile(0); // Isi dengan nilai 0 (kosong)
            }
        }
        // Munculkan 2 angka di awal
        spawnTile();
        spawnTile();
    }

    // 2. Memunculkan angka 2 atau 4 di posisi acak yang kosong
    public void spawnTile() {
        ArrayList<int[]> emptyCells = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].getValue() == 0) {
                    emptyCells.add(new int[]{i, j});
                }
            }
        }

        if (emptyCells.isEmpty()) return;

        // Pilih indeks acak
        int randomIndex = (int) (Math.random() * emptyCells.size());
        int[] chosenCell = emptyCells.get(randomIndex);

        // Probabilitas: 90% angka 2, 10% angka 4
        int newNumber = (Math.random() < 0.9) ? 2 : 4;
        board[chosenCell[0]][chosenCell[1]].setValue(newNumber);
    }

    
    // LOGIKA PERGERAKAN (SLIDE & MERGE)
    // Helper: Algoritma memproses 1 baris/kolom (Geser -> Gabung -> Geser)
    private boolean processLine(int[] line) {
        boolean changed = false;

        // Langkah 1: Slide (Geser melewati nol)
        int insertPos = 0;
        for (int i = 0; i < 4; i++) {
            if (line[i] != 0) {
                if (i != insertPos) {
                    line[insertPos] = line[i];
                    line[i] = 0;
                    changed = true;
                }
                insertPos++;
            }
        }

        // Langkah 2: Merge (Gabungkan angka yang sama)
        for (int i = 0; i < 3; i++) {
            if (line[i] != 0 && line[i] == line[i + 1]) {
                line[i] *= 2;         // Kalikan 2
                score += line[i];     // Tambahkan ke skor
                line[i + 1] = 0;      // Kosongkan kotak sebelahnya
                changed = true;
            }
        }

        // Langkah 3: Slide lagi (Tutup celah kosong akibat merge)
        insertPos = 0;
        for (int i = 0; i < 4; i++) {
            if (line[i] != 0) {
                if (i != insertPos) {
                    line[insertPos] = line[i];
                    line[i] = 0;
                    changed = true;
                }
                insertPos++;
            }
        }

        return changed;
    }
    
    
    // Trigger pergerakan dari Keyboard
    public void moveLeft() {
        boolean moved = false;
        for (int i = 0; i < 4; i++) {
            int[] line = new int[4];
            for (int j = 0; j < 4; j++) line[j] = board[i][j].getValue();
            
            if (processLine(line)) {
                moved = true;
                for (int j = 0; j < 4; j++) board[i][j].setValue(line[j]);
            }
        }
        if (moved) spawnTile();
    }

    public void moveRight() {
        boolean moved = false;
        for (int i = 0; i < 4; i++) {
            int[] line = new int[4];
            for (int j = 0; j < 4; j++) line[j] = board[i][3 - j].getValue(); // Ekstrak terbalik
            
            if (processLine(line)) {
                moved = true;
                for (int j = 0; j < 4; j++) board[i][3 - j].setValue(line[j]); // Masukkan terbalik
            }
        }
        if (moved) spawnTile();
    }

    public void moveUp() {
        boolean moved = false;
        for (int j = 0; j < 4; j++) {
            int[] line = new int[4];
            for (int i = 0; i < 4; i++) line[i] = board[i][j].getValue(); // Ekstrak per kolom
            
            if (processLine(line)) {
                moved = true;
                for (int i = 0; i < 4; i++) board[i][j].setValue(line[i]);
            }
        }
        if (moved) spawnTile();
    }

    public void moveDown() {
        boolean moved = false;
        for (int j = 0; j < 4; j++) {
            int[] line = new int[4];
            for (int i = 0; i < 4; i++) line[i] = board[3 - i][j].getValue(); // Ekstrak kolom terbalik
            
            if (processLine(line)) {
                moved = true;
                for (int i = 0; i < 4; i++) board[3 - i][j].setValue(line[i]);
            }
        }
        if (moved) spawnTile();
    }
    
    
    // STATUS PERMAINAN (MENANG / KALAH)
    public boolean isWin() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].getValue() == 2048) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGameOver() {
        // 1. Cek apakah ada kotak kosong
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].getValue() == 0) return false;
            }
        }

        // 2. Cek apakah ada angka bersebelahan (kiri-kanan / atas-bawah) yang sama
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int current = board[i][j].getValue();
                // Cek kanan
                if (j < 3 && current == board[i][j + 1].getValue()) return false;
                // Cek bawah
                if (i < 3 && current == board[i + 1][j].getValue()) return false;
            }
        }

        // Jika Penuh dan tidak ada yang bisa digabung maka Game Over
        return true; 
    }

    // Getter untuk dipanggil oleh GUI
    public Tile[][] getBoard() {
        return board;
    }

    public int getScore() {
        return score;
    }
}
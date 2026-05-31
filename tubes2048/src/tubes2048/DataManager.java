package tubes2048;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class DataManager {
    // Nama file JSON yang akan dibuat otomatis di folder project
    private static final String FILE_PATH = "history.json"; 
    // setPrettyPrinting() bikin isi JSON-nya ada enter dan rapi, ga cuma 1 baris panjang
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create(); 

    // Method untuk membaca file JSON
    public static GameData loadData() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new GameData(); // Kalau belum main sama sekali, balikin data kosong
        }
        
        try (Reader reader = new FileReader(file)) {
            return gson.fromJson(reader, GameData.class);
        } catch (Exception e) {
            System.err.println("Gagal membaca file JSON: " + e.getMessage());
            return new GameData();
        }
    }

    // Method untuk menyimpan skor baru ke file JSON
    public static void saveScore(GameData data, String playerName, int score) {
        if (score > data.getBestScore()) {
            data.setBestScore(score);
        }
        data.getHistory().add(new ScoreEntry(playerName, score));
        
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(data, writer);
        } catch (Exception e) {
            System.err.println("Gagal menyimpan JSON: " + e.getMessage());
        }
    }
}
# tubes-2048
Tugas Besar Praktikum Algoritma &amp; Pemrograman 2 Kelompok 4 - Game 2048

## 1. Pembagian Tugas

*   **Core Engine (Script & Logika):**
    *   Fokus pada *file* `GameEngine.java` (Class murni tanpa GUI).
    *   Mengelola matriks angka menggunakan array 2D (`int[][] board = new int[4][4]`).
    *   Membuat algoritma inti: geser angka (*Slide*), gabung angka (*Merge*), *spawn* angka baru (2 atau 4), dan cek *Game Over*.
*   **GUI In-Game & Input:**
    *   Fokus mendesain papan permainan di JFrame (menggunakan *drag-and-drop*).
    *   Menyusun 16 `JLabel` sebagai representasi kotak matriks 4x4.
    *   Mengatur `KeyListener` untuk mendeteksi *input* panah keyboard (Atas, Bawah, Kiri, Kanan).
    *   Memanggil fungsi pergeseran dari `GameEngine.java` setiap kali tombol ditekan.
*   **GUI Main Menu & Flow:**
    *   Mendesain Menu Utama (Judul, tombol *Play*, tombol *Exit*).
    *   Mendesain tampilan *pop-up Game Over* / *Win* dan sistem skor.
    *   Mengatur navigasi perpindahan antar *frame* (misal: transisi dari Menu Utama ke dalam permainan).

---

## 2. Alur Logika & Kalibrasi

*   **Aturan Angka:**
    *   Wajib menggunakan kelipatan pangkat dua: 2, 4, 8, 16, 32, 64, 128, dst.
*   **Logika Pergeseran (Berurutan):**
    1.  **Slide 1:** Geser angka melewati kotak kosong (`0`).
    2.  **Merge:** Gabungkan (kalikan 2) dua angka sama yang bersebelahan.
    3.  **Slide 2:** Geser lagi untuk menutup celah kosong akibat *merge*.
    4.  **Spawn:** Jika posisi matriks berubah, isi satu titik kosong acak dengan angka 2 atau 4.
*   **Cara Kalibrasi (Integrasi Kode):**
    *   GUI mendeteksi input -> panggil `engine.moveLeft()`.
    *   GUI meminta data terbaru -> panggil `engine.getBoard()`.
    *   GUI melakukan *looping* -> perbarui teks dan warna 16 `JLabel` sesuai data terbaru.

---

## 3. Panduan Git via NetBeans (WAJIB BACA)

**PENTING:** Login Git di NetBeans TIDAK BISA menggunakan *password* akun GitHub. Wajib menggunakan **Personal Access Token (PAT)**.

### A. Cara Mendapatkan Token (Hanya Sekali)
*   Buka GitHub di *browser* > Login > Klik Foto Profil > **Settings**.
*   Pilih **Developer settings** (paling bawah kiri) > **Personal access tokens** > **Tokens (classic)**.
*   Klik **Generate new token (classic)** > Isi nama bebas (misal: `NetBeans`).
*   **WAJIB:** Centang kotak `repo` (agar diizinkan mengubah *file* repositori).
*   Klik **Generate token** (di paling bawah) > **COPY** kode panjang (`ghp_...`) dan simpan di Notepad. Ini adalah pengganti *password* kalian!

### B. Clone Project (Mengunduh ke Laptop)
*   Buka NetBeans > Menu **Team** > **Git** > **Clone...**
*   Masukkan URL Repository ini.
*   **User:** Isi dengan Username GitHub masing-masing.
*   **Password:** Isi dengan Token `ghp_...` yang sudah disalin.
*   Klik **Next** > Pilih *branch* `main` > **Finish**.

### C. Alur Kerja Harian (Wajib Urut!)
1.  **PULL (Ambil Update):** 
    *   *Klik kanan nama Project* > **Git** > **Remote** > **Pull**.
    *   Lakukan INI PERTAMA KALI setiap buka laptop agar *codingan* tidak tabrakan dengan teman lain.
2.  **COMMIT (Simpan Lokal):**
    *   *Klik kanan nama Project* > **Git** > **Commit**.
    *   Tulis deskripsi kerjaan di *Commit Message* (misal: "Bikin desain main menu"). Klik **Commit**.
3.  **PUSH (Kirim ke GitHub):**
    *   *Klik kanan nama Project* > **Git** > **Remote** > **Push** > **Next** > **Finish**.
    *   Segera kabari di grup WA agar teman lain bisa langsung melakukan **PULL**.

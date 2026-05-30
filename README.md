# 2048: Slide, Merge, and Win! 🧩

Tugas Besar Praktikum Algoritma & Pemrograman 2 Kelompok 4 - Game 2048. 
Repositori ini berisi implementasi game *puzzle* matematika klasik 2048 yang dibangun menggunakan Java dan Java Swing. Proyek ini tidak hanya berfokus pada mekanik permainan dasar, tetapi juga pada manajemen *state* antar-jendela dan penyimpanan data menggunakan JSON.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/Apache_NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white)

---

## ✨ Fitur Utama

* **Classic 2048 Engine:** Algoritma pergeseran (*Slide*) dan penggabungan (*Merge*) matriks 4x4 yang akurat, lengkap dengan *random spawner* angka 2 atau 4.
* **Endless Mode & Easter Eggs:** Permainan tidak langsung berhenti saat mencapai 2048. Pemain dapat memilih untuk melanjutkan permainan menuju 4096, 8192, dan seterusnya dengan respon UI judul yang dinamis.
* **Persistent Data & History (JSON):** * Menggunakan *library* **Gson** untuk menyimpan riwayat permainan secara permanen di memori fisik (`history.json`).
  * Sistem *Best Score* yang otomatis melacak dan menyimpan skor tertinggi melintasi berbagai sesi permainan.
* **Seamless Multi-Window GUI:** Terdiri dari `MainMenu`, `inGame`, dan `History`. Dilengkapi arsitektur *State Management* (penerusan objek `GameData`) yang memastikan perpindahan antar-jendela (*frame*) berjalan sangat mulus tanpa *lag* atau *NullPointerException*.
* **Custom Graphics Rendering:** Alih-alih warna kaku, permainan merender aset visual khusus (`.png`) untuk setiap kotak/angka pada papan 2048 agar terlihat estetis.
* **Anti-Focus Stealing:** Implementasi `requestFocusInWindow()` yang menjamin *input* keyboard (panah arah) selalu responsif tanpa terganggu oleh elemen GUI lainnya.

---

## 🛠️ Tech Stack & Arsitektur

* **Language:** Java (Berbasis Object-Oriented Programming)
* **GUI Framework:** Java Swing (Didesain menggunakan NetBeans GUI Builder)
* **External Library:** `gson.jar` (Google JSON) untuk serialisasi data.

### Struktur Kelas (*Class Structure*)
| File / Class | Deskripsi Tugas |
| :--- | :--- |
| `Mainmenu.java` | *Entry point* aplikasi. Pusat inisialisasi awal untuk data *history*. |
| `inGame.java` | *Controller* & UI untuk papan permainan. Menangkap *input* keyboard dan memperbarui grafis *tiles*. |
| `History.java` | Jendela pembacaan data. Menampilkan tabel riwayat skor pemain yang diekstrak dari memori (RAM). |
| `GameBoard.java` | Logika inti (*Backend/Engine*) untuk kalkulasi pergeseran angka dan deteksi Menang/Kalah. |
| `DataManager.java` | *Handler* utilitas murni untuk operasi *File I/O* (Membaca/Menulis `history.json`). |
| `GameData.java` | Model struktur data utama (*Best Score* & *History List*). |
| `Tile.java` & `Player.java`| Kelas model objek untuk memegang entitas individu. |

---

## 🚀 Panduan Menjalankan Proyek

1. **Clone repository** ini ke mesin lokal Anda melalui terminal:  
   `git clone https://github.com/[USERNAME_GITHUB_KAMU]/[NAMA_REPO_KAMU].git`
2. **Buka project** menggunakan Apache NetBeans IDE.
3. **Penting - Instalasi Library Gson:**
   * Di dalam NetBeans, buka jendela *Projects*.
   * Klik kanan pada folder **Libraries** -> pilih **Add JAR/Folder...**
   * Cari dan tambahkan file `gson.jar` (di folder lib).
4. **Jalankan Aplikasi:** Klik **Run Project**, atau klik kanan pada file `Mainmenu.java` dan pilih **Run File** (atau tekan `Shift + F6`).

---

## 🤝 Panduan Kontribusi Kelompok (Workflow Git)

**Alur Kerja Harian (Wajib Urut!):**
1. **PULL (Ambil Update):** Klik kanan nama Project > **Git** > **Remote** > **Pull**. Lakukan ini PERTAMA KALI setiap buka laptop agar tidak terjadi konflik (*merge conflict*).
2. **COMMIT (Simpan Lokal):** Klik kanan nama Project > **Git** > **Commit**. Tulis deskripsi kerjaan di *Commit Message* (misal: "Fix bug di MainMenu"). Klik **Commit**.
3. **PUSH (Kirim ke GitHub):** Klik kanan nama Project > **Git** > **Remote** > **Push** > **Next** > **Finish**. Segera kabari di grup tim agar anggota lain bisa langsung melakukan **PULL**.

---

## 👤 Author / Kelompok 4
* [Nama A] - [NRP]
* [Nama B] - [NRP]
* [Nama C] - [NRP]

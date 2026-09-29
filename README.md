# UTS Advanced Software Engineering - Spring Boot Application

## 👤 Profil
* **Nama** : Keino Aflah Zahiry
* **Mata Kuliah** : Advanced Software Engineering
* **Proyek** : `UTS_AdvSWE_KeinoAflah`
* **Tech Stack** : Java 17, Spring Boot 3.2.0 (Web Starter), Maven

---

## 📝 Jawaban Soal 1: Analisis 5W Spring Framework

* **What (Apa itu Spring):**  
  Spring adalah *framework* berbasis Java yang bersifat *open-source* dan menyediakan infrastruktur komprehensif untuk membangun aplikasi *backend* tingkat enterprise. Fitur utamanya berfokus pada *Dependency Injection* (DI) dan *Inversion of Control* (IoC) untuk pengelolaan objek (*beans*).

* **Why (Mengapa menggunakan Spring):**  
  Spring menyederhanakan pengembangan sistem Java kompleks secara signifikan. Dengan dukungan *embedded server* (seperti Apache Tomcat bawaan Spring Boot), *developer* tidak perlu melakukan konfigurasi server manual dan dapat fokus murni pada pengembangan bisnis logika.

* **Who (Siapa pembuatnya):**  
  Spring Framework pertama kali diciptakan oleh **Rod Johnson** dan dirilis secara publik pada bulan Juni 2003.

* **When (Kapan harus digunakan):**  
  Spring/Spring Boot ideal digunakan ketika membangun aplikasi skala menengah hingga besar, sistem berbasis *RESTful API*, arsitektur *microservices*, serta aplikasi enterprise yang membutuhkan integrasi *database* dan keamanan tinggi.

* **Where (Di mana Spring diimplementasikan):**  
  Spring diimplementasikan di *side back-end* (server-side) dan berjalan di atas lingkungan *Java Virtual Machine* (JVM).

---

## 🚀 Fitur & Bisnis Logika Aplikasi

Aplikasi ini dibangun berbasis **Web REST API** menggunakan Spring Boot dengan formulir input interaktif:

1. **Kalkulator Gaji John Travolta (`/travolta`)**  
   * **Deskripsi:** Menghitung total gaji mingguan berdasarkan jam kerja dengan tarif normal Rp 15.000/jam (maksimal 40 jam) dan lembur 1.5x tarif normal untuk sisa jamnya.
   * **Analisis Finansial:** Mengalkulasikan sisa pendapatan setelah dikurangi pengeluaran operasional (Rp 600.000) untuk menentukan status tabungan.

2. **Pencari Akar Persamaan Kuadrat (`/kuadrat`)**  
   * **Deskripsi:** Menghitung nilai Diskriminan ($D = b^2 - 4ac$) dari persamaan $ax^2 + bx + c = 0$.
   * **Kondisi Akar:**
     * $D > 0$: Memiliki 2 akar real berbeda ($x_1$ dan $x_2$).
     * $D = 0$: Memiliki 1 akar real kembar ($x_1 = x_2$).
     * $D < 0$: Akar imajiner (tidak memiliki akar real).

---

## Visual WEB
1. **Tampilan Page Input Hitung John Travolta dan Akar Kuadrat**  
<img width="1020" height="782" alt="image" src="https://github.com/user-attachments/assets/78a53f62-872d-49fa-8bb0-e3f60b9f432d" />

2. **Tampilan Page Hasil Hitung John Travolta**
<img width="919" height="400" alt="image" src="https://github.com/user-attachments/assets/ae093d24-8135-4671-94a1-a157d21cec59" />

3. **Tampilan Page Hasil Hitung Akar Kuadrat**
<img width="929" height="374" alt="image" src="https://github.com/user-attachments/assets/1ec68579-25b5-42a4-bd95-e537935468dc" />

---

## 🛠️ Cara Menjalankan Aplikasi

### Option 1: Via Apache NetBeans
1. Buka Apache NetBeans, pilih **File > Open Project**.
2. Pilih folder **`UTS_AdvSWE_KeinoAflah`**.
3. *Expand* `Source Packages` > `com.uts.advswe`.
4. Klik kanan file **`UtsApplication.java`** lalu pilih **Run File** (`Shift + F6`).

### Option 2: Via Terminal / PowerShell (Maven)
Jalankan perintah berikut di folder root proyek:
```bash
mvn spring-boot:run

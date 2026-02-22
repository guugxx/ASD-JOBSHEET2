Jawaban Percobaan 1
2.1.3 Pertanyaan
1. Atribute dan method, atribute adlah data atau informasi 
    yang dimiliki oleh suatu objek atau entitas.
    class Mahasiswa, atributnya adalah nim, nama, kelas, dan ipk
    sedangkan method ialah fungsi yang bisa dilakukan objek atau class tersebut
    contoh tampilkanInformasi(), ubahKelas()

2.  Class Mahasiswa memiliki 4 atribut
    nim bertipe String,nama bertipe String,kelas bertipe String,ipk bertipe double

3.  Class Mahasiswa memiliki 4 method, yaitu:
    tampilkanInformasi() — bertipe void
    ubahKelas(kelasBaru: String) — bertipe void
    updateIpk(ipkBaru: double) — bertipe void
    nilaiKinerja() — bertipe String

void updateIpk(double ipkBaru) {
    if (ipkBaru < 0.0 || ipkBaru > 4.0) {
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    } else {
        ipk = ipkBaru;
    }
}
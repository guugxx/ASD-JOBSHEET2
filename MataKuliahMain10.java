
public class MataKuliahMain10 {

    public static void main(String[] args) {

        // ── Objek 1: menggunakan konstruktor default ───────────────────
        System.out.println("===== Mata Kuliah 1 (konstruktor default) =====");
        Matakuliah10 mk1 = new Matakuliah10();
        mk1.kodeMK    = "TI-201";
        mk1.nama      = "Algoritma dan Struktur Data";
        mk1.sks       = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();

        System.out.println("-- Ubah SKS --");
        mk1.ubahSKS(4);

        System.out.println("-- Tambah Jam --");
        mk1.tambahJam(2);

        System.out.println("-- Kurangi Jam --");
        mk1.kurangiJam(3);

        System.out.println("-- Kurangi Jam (melebihi sisa) --");
        mk1.kurangiJam(20);   // seharusnya gagal

        System.out.println("\n-- Info akhir mk1 --");
        mk1.tampilInformasi();

        // ── Objek 2: menggunakan konstruktor berparameter ──────────────
        System.out.println("\n===== Mata Kuliah 2 (konstruktor berparameter) =====");
        Matakuliah10 mk2 = new Matakuliah10("TI-301", "Pemrograman Web", 2, 4);

        mk2.tampilInformasi();

        System.out.println("-- Ubah SKS --");
        mk2.ubahSKS(3);

        System.out.println("-- Tambah Jam --");
        mk2.tambahJam(1);

        System.out.println("-- Kurangi Jam --");
        mk2.kurangiJam(2);

        System.out.println("\n-- Info akhir mk2 --");
        mk2.tampilInformasi();
    }
}
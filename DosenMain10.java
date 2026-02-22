public class DosenMain10 {

    public static void main(String[] args) {

        int tahunSekarang = 2026;

        // ── Objek 1: menggunakan konstruktor default ───────────────────
        System.out.println("===== Dosen 1 (konstruktor default) =====");
        Dosen10 dsn1 = new Dosen10();
        dsn1.idDosen        = "D-001";
        dsn1.nama           = "Dr. Andi Wijaya, M.Kom";
        dsn1.statusAktif    = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Kecerdasan Buatan";

        dsn1.tampilInformasi();

        System.out.println("-- Masa Kerja --");
        int masaKerja1 = dsn1.hitungMasaKerja(tahunSekarang);
        System.out.println("Masa kerja " + dsn1.nama + ": " + masaKerja1 + " tahun");

        System.out.println("-- Ubah Status --");
        dsn1.setStatusAktif(false);

        System.out.println("-- Ubah Keahlian --");
        dsn1.ubahKeahlian("Machine Learning");

        System.out.println("\n-- Info akhir dsn1 --");
        dsn1.tampilInformasi();

        // ── Objek 2: menggunakan konstruktor berparameter ──────────────
        System.out.println("\n===== Dosen 2 (konstruktor berparameter) =====");
        Dosen10 dsn2 = new Dosen10("D-002", "Sari Dewi, S.T., M.T.", true, 2015, "Jaringan Komputer");

        dsn2.tampilInformasi();

        System.out.println("-- Masa Kerja --");
        int masaKerja2 = dsn2.hitungMasaKerja(tahunSekarang);
        System.out.println("Masa kerja " + dsn2.nama + ": " + masaKerja2 + " tahun");

        System.out.println("-- Ubah Status --");
        dsn2.setStatusAktif(false);

        System.out.println("-- Ubah Keahlian --");
        dsn2.ubahKeahlian("Keamanan Siber");

        System.out.println("\n-- Info akhir dsn2 --");
        dsn2.tampilInformasi();
    }
}
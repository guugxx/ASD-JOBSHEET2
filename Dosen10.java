public class Dosen10 {

    // ── Atribut ──────────────────────────────────────────────
    String  idDosen;
    String  nama;
    boolean statusAktif;
    int     tahunBergabung;
    String  bidangKeahlian;

    // ── Konstruktor Default ───────────────────────────────────
    public Dosen10() {
        // Nilai default: statusAktif = false, tahunBergabung = 0, sisanya null
    }

    // ── Konstruktor Berparameter ──────────────────────────────
    public Dosen10(String idDosen, String nama, boolean statusAktif,
                 int tahunBergabung, String bidangKeahlian) {
        this.idDosen        = idDosen;
        this.nama           = nama;
        this.statusAktif    = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // ── Method ────────────────────────────────────────────────

    /**
     * Menampilkan informasi lengkap dosen.
     */
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    
    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen '" + nama + "' diubah menjadi: "
                + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

   
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen '" + nama + "' diubah menjadi: " + bidangKeahlian);
    }
}
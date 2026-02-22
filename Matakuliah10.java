public class Matakuliah10 {

    // ── Atribut ──────────────────────────────────────────────
    String kodeMK;
    String nama;
    int    sks;
    int    jumlahJam;

    // ── Konstruktor Default ───────────────────────────────────
    public Matakuliah10() {
        
    }

    // ── Konstruktor Berparameter ──────────────────────────────
    public Matakuliah10(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK    = kodeMK;
        this.nama      = nama;
        this.sks       = sks;
        this.jumlahJam = jumlahJam;
    }

    // ── Method ────────────────────────────────────────────────

    
    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam + " jam/minggu");
    }

    
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS untuk mata kuliah '" + nama + "' telah diubah menjadi " + sks);
    }

    
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam bertambah " + jam + " jam. Jumlah jam sekarang: " + jumlahJam);
    }

    
    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi "
                    + "(jam saat ini: " + jumlahJam + ", jam yang dikurangi: " + jam + ")");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        }
    }
}

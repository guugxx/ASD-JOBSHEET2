public class MahasiswaMain10{
    public static void main(String[] args) {
         Mahasiswa10 mhsl = new Mahasiswa10();

        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa10 mhs2 = new Mahasiswa10 ("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa10 mhsFarrell = new Mahasiswa10("Farrell Raissa Ermanto", "254107060150", 3.80, "SIB 1E");
        mhsFarrell.updateIpk(4.00);
        mhsFarrell.tampilkanInformasi();

       
    }
}
    
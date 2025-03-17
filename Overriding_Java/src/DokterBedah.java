public class DokterBedah extends Dokter {
    private String ruanganOperasi;
    private double tingkatKeberhasilanOperasi;


    DokterBedah(String nama, int gaji, int jamKerja, String spesialis, int pengalamanKerja, double biayaKonsultasi, String ruanganOperasi, double tingkatKeberhasilanOperasi){
        super(nama, gaji, jamKerja, spesialis, pengalamanKerja, biayaKonsultasi);
        this.ruanganOperasi = ruanganOperasi;
        this.tingkatKeberhasilanOperasi = tingkatKeberhasilanOperasi;

    }

    // override
    public void kerja(){
        System.out.println(getNama() + " sedang bekerja dirumah sakit pada ruangan : " + this.ruanganOperasi);
    }

    // override
    public double kalkulasiBonus(){
        return super.kalkulasiBonus() + (this.tingkatKeberhasilanOperasi * 500);
    }

    public void operasi(){
        System.out.println("Dokter " + getNama() + " sedang melakukan operasi");
    }
    // overloading
    public void operasi(String pasien){
        System.out.println("Dokter " + getNama() + " sedang melakukan operasi dengan nama pasien : " + pasien);
    }
    // overloading
    public void operasi(String pasien, boolean urgent){
        if(urgent){
            System.out.println("Operasi darurat dilakukan oleh dokter " + getNama() + " dengan pasien " + pasien);
        } else {
            System.out.println("Dokter " + getNama() + " sedang melakukan operasi standar dengan nama pasien : " + pasien);
        }
    }

}
